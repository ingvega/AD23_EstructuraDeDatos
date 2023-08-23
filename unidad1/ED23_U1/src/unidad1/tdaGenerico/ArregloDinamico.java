/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tdaGenerico;

import java.util.Arrays;

/**
 *
 * @author paveg
 */
public class ArregloDinamico<T> implements TDAArregloDinamico<T> {

    private Object[] datos = new Object[10];
    int c;

    @Override
    public int buscar(T valor) {
        for (int i = 0; i < c; i++) {
            if (datos[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T obtener(int posicion) throws IndexOutOfBoundsException {
        try {
            //Obtener el valor
            return (T) datos[posicion];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException("Posición no válida: " + posicion);
        }
    }

    @Override
    public void agregar(T valor) {
        if (c == datos.length) {
            datos = Arrays.copyOf(datos, c + 10);
        }
        //Añadir el nuevo elemento ahora que ya hay espacio
        datos[c] = valor;
        //Contamos el nuevo elemento
        c++;

    }

    @Override
    public void sustituir(int posicion, T valor) throws IndexOutOfBoundsException {
        //Identificar si es un índice válido
        if(posicion>=0 && posicion<c){
            //Si es una posicino existente
            datos[posicion]=valor;
        }else{
            //La posición no existe (ser negativa o rebasar el límite de elementos añadidos)
            throw new IndexOutOfBoundsException("Posición no válida: " + posicion);
        }
    }

    @Override
    public int tamanio() {
        return c;
    }

}
