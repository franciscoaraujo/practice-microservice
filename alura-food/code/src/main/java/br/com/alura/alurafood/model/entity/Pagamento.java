package br.com.alura.alurafood.model.entity;

import br.com.alura.alurafood.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbpagamentos")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger idPagamento;

    @Column(name = "valor_pagamento")
    private BigDecimal valor;

    @Column(name = "nome_cartao")
    private String nome;

    @Column(name = "numero_cartao")
    private String numero;

    @Column(name = "data_expiracao")
    private String expiracao;

    @Column(name = "CVV")
    private String codigo;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "data_pagamentos")
    private Date dtPagamento;

    private Long pedidoId;
    private Long formaDePagamentoId;
}
