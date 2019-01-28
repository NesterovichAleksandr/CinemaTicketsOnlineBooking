package com.gmail.nesterovich.aleksandr.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

public class ReservedTicket {

    private static final long serialVersionUID = 6598806665044633298L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private Integer code;
    @Column
    private BigDecimal cost;

    public ReservedTicket() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservedTicket reservedTicket = (ReservedTicket) o;
        return Objects.equals(id, reservedTicket.id) &&
                Objects.equals(code, reservedTicket.code) &&
                Objects.equals(cost, reservedTicket.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, cost);
    }
}
