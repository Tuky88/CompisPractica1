/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.Ejecutor;

import com.ipn.mx.Logica.Camino;
import com.ipn.mx.Logica.EvaluadorAFN;
import com.ipn.mx.Logica.FuncionTrans;
import com.ipn.mx.Util.LecturaArchivo;
import java.util.LinkedList;

/**
 *
 * @author axel
 */
public class EjecutorPrincial {

    public static void main(String[] args) {
        LecturaArchivo la=new LecturaArchivo("/home/axel/Documents/PracticasMicros/Practica1/src/com/ipn/mx/Archivo/2.txt");
        EvaluadorAFN ea=new EvaluadorAFN(la.LeerArchivo());
        Camino[] ft=
                ea.ObtenerReglas();
        for (Camino funcion : ft) {
        ea.Evaluar("ababababab",funcion.getFt());
        }
    }
    
}
