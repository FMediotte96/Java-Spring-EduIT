package com.eduit.model;

public class Venta {
    private String id;
    private Double montoNominal;
    private Double descuento;
    private Double montototal;

    public Venta() {
    }

    public Venta(String id, Double montoNominal, Double montototal) {
        this.id = id;
        this.montoNominal = montoNominal;
        this.montototal = montototal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getMontoNominal() {
        return montoNominal;
    }

    public void setMontoNominal(Double montoNominal) {
        this.montoNominal = montoNominal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getMontototal() {
        return montototal;
    }

    public void setMontototal(Double montototal) {
        this.montototal = montototal;
    }
}
