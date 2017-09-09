/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

/**
 *
 * @author NYL
 */
public class RevistaDTO extends EntidadBaseDTO {
    
    private String numero;
    private String periodicidad;

    public RevistaDTO(String numero, String periodicidad, String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    
    
}
