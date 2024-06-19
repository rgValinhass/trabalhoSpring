
package com.setorPessoal.repository;

import com.setorPessoal.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
}
