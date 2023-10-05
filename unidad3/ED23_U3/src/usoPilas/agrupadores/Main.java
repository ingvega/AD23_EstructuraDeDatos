/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoPilas.agrupadores;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena = lector.nextLine();
        String cadenaCorregida = "";
        boolean balanceada=true;
        Stack<Character> pila = new Stack<>();

            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        cadenaCorregida+=c;
                        pila.push(c);
                        break;
                    case ')':
                        if(!pila.empty()){
                            if (pila.top() != '(') {
                                c=cerrarAgrupador(pila.top());
                                i--;
                                balanceada=false;
                            }
                            pila.pop();
                            cadenaCorregida+=c;
                        }else{
                            balanceada=false;
                        }
                        break;
                    case ']':
                        if(pila.empty()){
                            balanceada=false;
                            break;
                        }
                        if (pila.top() != '[') {
                            c=cerrarAgrupador(pila.top());
                            i--;
                            balanceada=false;
                        }
                        pila.pop();
                        cadenaCorregida+=c;
                        break;
                    case '}':
                        if(!pila.empty()){
                            if (pila.top() != '{') {
                                c=cerrarAgrupador(pila.top());
                                i--;
                                balanceada=false;
                            }
                            pila.pop();
                            cadenaCorregida+=c;
                        }else{
                            balanceada=false;
                        }
                        break;
                    default:
                        cadenaCorregida+=c;
                }
            }
            if(balanceada && pila.empty()){
                System.out.println("BALANCEADA");
            }else{
                while(!pila.empty()){
                    char c=pila.pop();
                    cadenaCorregida+=cerrarAgrupador(c);
                }
                System.out.println("CORREGIDA " + cadenaCorregida );
            }
            //3-[2(a-b]=0)
    }
    
    private static char cerrarAgrupador(char c){
        if(c=='(') 
            return ')';
        else if(c=='{') 
            return '}';
        else
            return ']';
    }
}

abstract class ADTStack<T> {

    public abstract void push(T valor);

    public abstract T pop() throws EmptyStackException;

    public abstract T top() throws EmptyStackException;

    public abstract boolean empty();
}

class Stack<T> extends ADTStack<T> {

    private Object[] arreglo = new Object[10];
    private int posicion = 0;

    @Override
    public void push(T valor) {
        if (arreglo.length > posicion) {
            arreglo[posicion] = valor;
        } else {
            Arrays.copyOf(arreglo, posicion + 10);
            arreglo[posicion] = valor;
        }
        posicion++;
    }

    @Override
    public T pop() throws EmptyStackException {
        T valor = top();
        arreglo[posicion - 1] = null;
        posicion--;
        return valor;
    }

    @Override
    public T top() throws EmptyStackException {
        if (posicion == 0) {
            throw new EmptyStackException();
        }
        T valor = (T) arreglo[posicion - 1];
        return valor;
    }

    @Override
    public boolean empty() {
        return (posicion == 0);
    }

}
