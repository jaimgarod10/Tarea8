/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea8;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer [] arrai = {1,4,3,8,3,8,5,2,4,7,1,-3,5};
        OperacionesGenericas <Integer>og = new OperacionesGenericas<>();
        
        Integer min = og.calElemMinimo(arrai);
        Integer max = og.calElemMaximo(arrai);
        Integer pos = og.buscarOjeto(arrai, 7);
        
        System.out.println("min="+min);
        System.out.println("max="+max);
        System.out.println("pos="+pos);
        
    }
}

