/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesenlazadas.linkedstack;

import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public class LinkedStack<T> extends ADTStack<T>{
    private Node last;
    
    @Override
    public void push(T valor) {
        Node nuevo=new Node();
        nuevo.value=valor;
        
        if(!empty()){
            nuevo.link=last;
        }
        
        last=nuevo;
    }

    @Override
    public T pop() throws EmptyStackException {
        
        if(!empty()){
            T valor=last.value;
            Node previo=last.link;
            last=previo;
            //last=last.link;
            return valor;
        }else{
            throw new EmptyStackException();
        }
    }

    @Override
    public T top() throws EmptyStackException {
        if(!empty())
            return last.value;
        else
            throw new EmptyStackException();
    }

    @Override
    public boolean empty() {
        //return (last==null);
        if(last==null){
            return true;
        }else{
            return false;
        }
    }
    
    private class Node{
        T value;
        Node link;
    }
}
