/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business;

/**
 *
 * @author NYL
 */
public interface IPrestable {
    /**
     * Método que me devolverá el estado "prestado" del libro.
     * @return 
     */
    boolean esPrestado();
    
    
    /**
     * Método que cambia el estado de "prestado" del libro.
     */
    void cambiarEstado();
        
    
}
