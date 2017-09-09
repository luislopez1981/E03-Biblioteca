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
public class ComicsDTO extends EntidadBaseDTO{
    
    private String numero;
    private String coleccion;

    public ComicsDTO(String numero, String coleccion, String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.coleccion = coleccion;
    }
    
    
    
}
