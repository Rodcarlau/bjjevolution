package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Comportamento;

interface ComportamentoRepository extends JpaRepository<Comportamento, Long> {
    
}
