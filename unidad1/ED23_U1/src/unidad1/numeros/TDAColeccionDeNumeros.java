/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.numeros;

/**
 *
 * @author paveg
 */
public interface TDAColeccionDeNumeros {
    public void agregar(int numero);
    public void agregar (int numero, int posicion) throws IndexOutOfBoundsException;
    int[] numerosIngresados();
    int[] numerosIngresadosSinDuplicados();
    int reemplazarTodos(int numero, int nuevo);
    void reemplazar(int posicion, int nuevo) throws IndexOutOfBoundsException;
    int longitud();
    int sumar();
    double promedio();
    void ordenar();
}
