package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Faixa;

interface FaixaRepository extends JpaRepository<Faixa, Long> {
    
}
