/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.Logica;

/**
 *
 * @author axel
 */
public class Camino {
   
    Estado eactual;
    String recorrido;

    public Estado getEactual() {
        return eactual;
    }

    public void setEactual(Estado eactual) {
        this.eactual = eactual;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    @Override
    public String toString() {
        return "Camino{" + "eactual=" + eactual + ", recorrido=" + recorrido + '}';
    }

    public Camino(Estado eactual, String recorrido) {
        this.eactual = eactual;
        this.recorrido = recorrido;
    }
    
}
