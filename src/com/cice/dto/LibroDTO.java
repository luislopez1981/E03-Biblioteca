/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.business.IPrestable;

/**
 *
 * @author NYL
 */
public class LibroDTO extends EntidadBaseDTO implements IPrestable{

    private String edicion;
    private String isbn;
    private String autor;
    private boolean prestado;
    

    public LibroDTO(String edicion, String isbn, String autor, String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean esPrestado() {
        return this.prestado;
    }

    @Override
    public void cambiarEstado() {
        this.prestado= !this.prestado;
    }
    
    
    
    }
    
    

