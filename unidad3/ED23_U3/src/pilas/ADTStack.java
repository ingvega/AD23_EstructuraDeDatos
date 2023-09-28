/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public abstract class ADTStack<T> {
    public abstract void push(T valor);
    public abstract T pop() throws EmptyStackException;
    public abstract T top() throws EmptyStackException;
    public abstract boolean empty();
}
