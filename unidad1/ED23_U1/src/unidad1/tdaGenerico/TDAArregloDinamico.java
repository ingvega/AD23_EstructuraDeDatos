/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tdaGenerico;

/**
 *
 * @author paveg
 */
public interface TDAArregloDinamico<T> {
    
    /**
     * Busca un valor en la colección
     * @param valor dato a buscar
     * @return posición en la que encontró la primera coincidencia
     * del valor recibido como parámetro o -1 en caso de no encontrarlo
     */
    public int buscar (T valor); 
    /**
     * Permite obtener el valor ubicado en una posición específica
     * @param posicion Indica el índice del elemento buscado
     * @return El valor que se encuentre en la posición especificada
     * @throws IndexOutOfBoundsException Cuando se indique una posición
     * que esté fuera de los límites de los datos ingresados
     */
    public T obtener(int posicion) throws IndexOutOfBoundsException; //arreglo[2]
    
    /**
     * Añade el valor indicado al final del último valor añadido
     * @param valor Valor a añadir a la colección
     */
    public void agregar(T valor);
    public void sustituir(int posicion, T valor)  throws IndexOutOfBoundsException;
    public int tamanio();

}
