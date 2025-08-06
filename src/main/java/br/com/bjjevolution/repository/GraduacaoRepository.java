package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Graduacao;

interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
    
}
