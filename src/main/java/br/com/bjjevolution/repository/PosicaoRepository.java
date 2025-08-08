package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Posicao;

interface PosicaoRepository extends JpaRepository<Posicao, Long> {
    
}
