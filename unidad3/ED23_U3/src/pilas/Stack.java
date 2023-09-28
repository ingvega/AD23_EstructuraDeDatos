/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public class Stack<T> extends ADTStack<T> {
    private Object[] arreglo=new Object[10];
    private int posicion=0;
    
    
    @Override
    public void push(T valor) {
        if(arreglo.length>posicion){
            arreglo[posicion]=valor;
        }else{
            Arrays.copyOf(arreglo, posicion+10);
            arreglo[posicion]=valor;
        }
        posicion++;
    }

    @Override
    public T pop() throws EmptyStackException {
        //arreglo[posicion-1]=null;
        T valor=top();
        posicion--;
        return valor;
    }

    @Override
    public T top() throws EmptyStackException {
        if(posicion==0) throw new EmptyStackException();
        T valor=(T)arreglo[posicion-1];
        return valor;
    }

    @Override
    public boolean empty() {
        return (posicion==0);
    }
    
}
