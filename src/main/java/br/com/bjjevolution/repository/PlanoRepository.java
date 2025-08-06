package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Plano;

interface PlanoRepository extends JpaRepository<Plano, Long> {
    
}
