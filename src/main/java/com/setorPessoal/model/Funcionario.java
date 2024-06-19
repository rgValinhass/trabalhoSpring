
package com.setorPessoal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column (name = "nascimento", nullable = false)
    private LocalDate nascimento;
    
    @Column (name = "salario", nullable = false)
    private double salario;

    public Funcionario() {
        this.setId(0);
        this.setNome("");
        this.setNascimento(LocalDate.now());
        this.setSalario(0);
    }

    public Funcionario(int id, String nome, LocalDate nascimento, double salario) {
        this.setId(id);
        this.setNome(nome);
        this.setNascimento(nascimento);
        this.setSalario(salario);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "nome vazio" : nome.toUpperCase();
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        return this.id == other.id;
    }   
}
