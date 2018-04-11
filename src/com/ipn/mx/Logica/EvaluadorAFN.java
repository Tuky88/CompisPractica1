/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.Logica;

import java.util.Stack;

/**
 *
 * @author axel
 */
public class EvaluadorAFN {

    private Automata auto;

    public EvaluadorAFN(Automata auto) {
        this.auto = auto;
    }

    public void Evaluar(String cadenita) {
        String cadena = cadenita;
        int indice = cadena.length(), i = 0;
        Estado ea;
        ea = auto.getEstadoini();
        Camino c = new Camino(ea, "");
        Stack pila = new Stack();
        pila.push(c);
        System.out.println("--------------------------------------------------");
        System.out.println("Cadena a validar:" + cadenita + " Tamaño:" + cadena.length());
        System.out.println("--------------------------------------------------");
        while (!pila.isEmpty()) {
            Camino a = (Camino) pila.pop();
            //ystem.out.println(a.toString());
            for (int j = 0; j < indice-1; j++) {
                FuncionTrans[] ft = auto.buscarRegla(a.getEactual(), String.valueOf(cadena.charAt(j)));
                //System.out.println(ft.length + "//" + cadena.charAt(j) + "//" + a.getEactual().getNumEstado());
                for (int k = 0; k < ft.length; k++) {
                    if (k == 0) {
                        a.setEactual(ft[0].getEstadofin());
                        a.setRecorrido(a.getRecorrido() + a.getEactual().getNumEstado());
                    } else {
                        Camino x = new Camino(ea, a.getRecorrido());
                        x.setEactual(ft[k].getEstadofin());
                        x.setRecorrido(a.getRecorrido() + x.getEactual().getNumEstado());
                        //System.out.println(x.toString());
                        pila.push(x);
                    }
                    //System.out.println("Estado actual:"+a.eactual.getNumEstado());
                }
            }
            System.out.println("Recorrido:" + a.getRecorrido() + " nodos:" + a.getRecorrido().length());
            System.out.println("Nodo final:" + a.getEactual().getNumEstado());
            //System.out.println("Camino:" + ruta);
            Estado[] efinales = auto.getEstadofin();
            for (int j = 0; j < auto.getEstadofin().length; j++) {
                System.out.println(a.getEactual().getNumEstado() + "--" + efinales[j].getNumEstado());
                System.out.println(a.getRecorrido().length() + " == " + (cadena.length() + 1));
                if (a.getEactual().getNumEstado().equals(efinales[j].getNumEstado())
                        && (a.getRecorrido().length() == (cadena.length() + 1))) {

                    System.out.println("Cadena validada");
                } else {
                    System.out.println("Cadena incorrecta");
                }

            }
            System.out.println("--------------------------------------------------");
        }
    }
}