package br.com.bjjevolution.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Pessoa {
    
    @Column(name = "nome")
    private String nome;

    @jakarta.persistence.Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataDeNascimento;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "celular")
    private String celular;

    @Column(name = "email_pessoal")
    private String email;

    @Column(name = "foto_url")
    private String fotoUrl;

}
