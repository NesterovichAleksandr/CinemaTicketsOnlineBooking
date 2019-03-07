package com.gmail.nesterovich.aleksandr.model;

import java.math.BigDecimal;

public class ReservedTicketDto {

    private String id;
    private Integer code;
    private BigDecimal cost;

    public ReservedTicketDto() {
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
}
