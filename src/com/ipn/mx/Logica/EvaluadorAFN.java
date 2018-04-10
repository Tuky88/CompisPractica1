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
public class EvaluadorAFN {

    private Automata auto;

    public EvaluadorAFN(Automata auto) {
        this.auto = auto;
    }

    public void Evaluar(String cadenita, FuncionTrans[] ft) {
        String cadena = cadenita;
        int indice = cadena.length(), i = 0;
        Estado ea;
        ea =auto.getEstadoini();
String ruta= "ruta:"+ea.getNumEstado();
        while (i < indice - 1) {
            FuncionTrans[] funciones;
            funciones = ft;
            
            //funciones=auto.buscarRegla(ea, cadena.substring(i,i+1));
            //System.out.println("Caracter:" + cadena.substring(i, i + 1));
            for (int j = 0; j < funciones.length; j++) {
                if (funciones[j].estadoini.getNumEstado().equals(ea.getNumEstado()) && funciones[j].getTransicion().getS().equals(cadena.substring(i, i + 1))) {
                    System.out.println(funciones[j].toString());
                    ea = funciones[j].getEstadofin();
                    ruta=ruta.concat(ea.getNumEstado());
                }
            }
            i++;
        }
        
        System.out.println("Nodo final:" + ea.getNumEstado());
        System.out.println("Camino:"+ruta);
            
        Estado[] efinales = auto.getEstadofin();
        for (int j = 0; j < auto.getEstadofin().length; j++) {
            if (ea.getNumEstado().equals(efinales[j].getNumEstado())) {
                System.out.println("Cadena validada");
            } else {
                System.out.println("Cadena incorrecta");
            }

        }
    }

    public Camino[] ObtenerReglas() {
       Camino[] ft = null;
       

        return ft;
    }
}
