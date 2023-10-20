/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesenlazadas.linkedqueue;

import java.util.Iterator;

/**
 *
 * @author paveg
 */
public class LinkedQueue<T> extends ADTQueue<T> 
                implements Iterable<T> {

    private Node last;
    private Node first;

    @Override
    public void add(T valor) {
        Node nuevo = new Node();
        nuevo.value = valor;

        if (!empty()) {
            nuevo.previous = last;
            last.next = nuevo;
        } else {
            first = nuevo;
        }

        last = nuevo;
    }

    @Override
    public T remove() throws EmptyCollectionException {

        if (!empty()) {
            T valor = first.value;
            Node siguiente = first.next;
            first = siguiente;
            if (siguiente != null) {//Cuando aún hay al menos un elemento en la colección
                siguiente.previous = null;
            } else {//La colección está vacía de modo que último también se reseteará a null
                last = null;
            }
            return valor;
        } else {
            throw new EmptyCollectionException();
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (!empty()) {
            return first.value;
        } else {
            throw new EmptyCollectionException();
        }
    }

    @Override
    public boolean empty() {
        //return (last==null);
        if (last == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<T> iterator() {
        
        Iterator<T> iterador=new Iterator<T>() {
            Node apuntador=first;
            @Override
            public boolean hasNext() {
                if(apuntador!=null){
                    return true;
                }else{
                    return false;
                }
            }

            @Override
            public T next() {
                T valor=apuntador.value;
                apuntador=apuntador.next;
                return valor;
            }
        };
        return iterador;
    }

    private class Node {

        T value;
        Node next;
        Node previous;
    }
}
