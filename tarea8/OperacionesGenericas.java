/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea8;

/**
 *
 * @author jaimg
 * @param <T>
 */
public class OperacionesGenericas<T> {

   public T calElemMinimo(T[] arrai) {

        T minimo = null;
        for (T actual : arrai) {
            if (minimo == null || ((Comparable)actual).compareTo((T) minimo) < 0) {
                minimo = actual;
            }
        }
        return minimo;
    }

    public T calElemMaximo(T[] arrai) {

        T max = null;
        for (int i = 0; i < arrai.length; i++) {
            if (max == null || ((Comparable)arrai[i]).compareTo(max)>0) {
                max = arrai[i];
            }
        }
        return max;
    }

    public int buscarOjeto(T[] arrai, T obj) {

        for (int i = 0; i < arrai.length; i++) {
            // miramos si son iguales segun el valor.
            if (arrai[i].equals(obj)) {
                return i;
            }
            //miramos si son el mismo objeto, es decir, por referencia.
            if (arrai[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public T borrarElem(T[] arrai, T obj) {
        
        int pos = buscarOjeto(arrai, obj);
        if(pos == -1){
            return null;
        }
        T resultado = arrai[pos];
        for(int i = pos; i< arrai.length; i++){
            arrai[pos] = arrai[pos + 1];
        }
        arrai[arrai.length - 1] = null;
        return resultado;
    }
    
     /*public T borrarElem2(T[] arrai, T obj) {
        
        int pos = buscarOjeto(arrai, obj);
        if(pos == -1){
            return null;
        }
        T resultado = arrai[pos];
        ArrayUtils.removeElement(arrai, obj);
        return resultado;
    }*/

}

