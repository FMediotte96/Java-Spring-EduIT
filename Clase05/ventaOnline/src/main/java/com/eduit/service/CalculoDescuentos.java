package com.eduit.service;

public class CalculoDescuentos {
    private String idCliente;
    private Double importe;
    private BusquedaClienteFrecuente busquedaClienteFrecuente;

    public static CalculoDescuentos build() {
        return new CalculoDescuentos();
    }

    public CalculoDescuentos setearIdCliente(String idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public CalculoDescuentos setearImporte(Double importe) {
        this.importe = importe;
        return this;
    }

    public CalculoDescuentos setearBusquedaClienteFrecuente(BusquedaClienteFrecuente busquedaClienteFrecuente) {
        this.busquedaClienteFrecuente = busquedaClienteFrecuente;
        return this;
    }

    public double calcular() {
        Integer tipoDescuento = busquedaClienteFrecuente.descuento(idCliente);
        if(tipoDescuento == 0) {
            return importe;
        }

        if(tipoDescuento == 1) {
            return importe * 0.9d;
        }

        if(tipoDescuento == 2) {
            return importe * 0.8d;
        }

        throw new RuntimeException("Nunca deberia llegar acá");
    }

}
