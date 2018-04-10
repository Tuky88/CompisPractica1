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
    private FuncionTrans[] ft;

    public Camino(FuncionTrans[] ft) {
        this.ft = ft;
    }

    public FuncionTrans[] getFt() {
        return ft;
    }

    public void setFt(FuncionTrans[] ft) {
        this.ft = ft;
    }

    @Override
    public String toString() {
        return "Camino{" + "ft=" + ft + '}';
    }
    
}
