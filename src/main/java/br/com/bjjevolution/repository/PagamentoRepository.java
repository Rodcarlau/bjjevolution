package br.com.bjjevolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bjjevolution.model.Pagamento;

interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}
