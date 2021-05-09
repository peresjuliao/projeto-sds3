package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String selleName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        selleName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSelleName() {
        return selleName;
    }

    public void setSelleName(String selleName) {
        this.selleName = selleName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
