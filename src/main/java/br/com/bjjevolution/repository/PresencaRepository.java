package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bjjevolution.model.Presenca;

@Repository
interface PresencaRepository extends JpaRepository<Presenca, Long> {
    
}
