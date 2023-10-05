/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 *
 * @author paveg
 */
public class Queue<T> extends ADTQueue<T> implements Iterable<T> {

    private Object[] arreglo = new Object[10];
    private int posicion = 0;

    @Override
    public void add(T valor) {
        if (arreglo.length > posicion) {
            arreglo[posicion] = valor;
        } else {
            Arrays.copyOf(arreglo, posicion + 10);
            arreglo[posicion] = valor;
        }
        posicion++;
    }

    @Override
    public T remove() throws NullPointerException {
        T valor = element();
        arreglo = Arrays.copyOfRange(arreglo, 1, arreglo.length);
        posicion--;
        return valor;
    }

    @Override
    public T element() throws NullPointerException {
        if (posicion == 0) {
            throw new NullPointerException();
        }
        T valor = (T) arreglo[0];
        return valor;
    }

    @Override
    public boolean empty() {
        return (posicion == 0);
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterador = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public T next() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return iterador;
    }

}
