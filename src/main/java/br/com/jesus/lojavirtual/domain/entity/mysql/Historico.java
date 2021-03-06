package br.com.jesus.lojavirtual.domain.entity.mysql;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "historico_pagamentos")
public class Historico implements Serializable {

    @Id
    private Integer id;
    private String descricao;
    private String tipo;
    private Date data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Historico historico = (Historico) o;
        return Objects.equals(id, historico.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
