/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesenlazadas.linkedqueue;

import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public abstract class ADTQueue<T> {
    
    public abstract void add(T valor);
    public abstract T remove() throws EmptyCollectionException;
    public abstract T peek() throws EmptyCollectionException;
    public abstract boolean empty();
   
}
