package com.drj.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Produto {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    //@NotNull
    @JoinColumn(nullable = false)
    private String nome;

    @JoinColumn(nullable = false)
    private String descricao;

    @JoinColumn(nullable = false)
    private String contentType;

    private Long tamanho;

    private Double valor;

    private Integer quantidade;


}
