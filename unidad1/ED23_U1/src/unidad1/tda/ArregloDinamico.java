/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tda;

import java.util.Arrays;

/**
 *
 * @author paveg
 */
public class ArregloDinamico implements TDAArregloDinamico {

    private int c = 0;
    private int[] datos = new int[10];

    @Override
    public int buscar(int valor) {
        
        for (int i = 0; i < c; i++) {
            if(datos[i]==valor){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int obtener(int posicion) throws IndexOutOfBoundsException {
        try{
            //Obtener el valor
            return datos[posicion];
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new IndexOutOfBoundsException("Posición no válida: " + posicion);
        }
    }

//    @Override
//    public void agregar(int valor) {
//        //1 Verificar que haya espacio
//        //Verificar si el número de elementos aún no llega al borde
//        //del arreglo
//        if(c<datos.length){
//            //puedes llenar el siguiente espacio disponible
//            datos[c]=valor;
//            //Contar el nuevo elemento que acabamos de guardar
//            c++;
//        }else{//Redimensionar
//            //Preparar un arreglo más grande
//            int datosNuevo[]=new int[c+10];
//            //Copiar todos los elementos actuales al nuevo arreglo
//            for (int i = 0; i < c; i++) {
//                datosNuevo[i]=datos[i];
//            }
//            //Añadir el nuevo elemento ahora que ya hay espacio
//            datosNuevo[c]=valor;
//            //Contamos el nuevo elemento
//            c++;
//            //Establecer el arreglo nuevo como el arreglo actual
//            datos=datosNuevo;
//        }
    /**
     * Añade el valor indicado al final del último valor añadido
     * @param valor Valor a añadir a la colección
     */
    @Override
    public void agregar(int valor) {
        //1 Verificar que haya espacio
        //Verificar si el número de elementos aún no llega al borde
        //del arreglo
        if (c < datos.length) {
            //puedes llenar el siguiente espacio disponible
            datos[c] = valor;
            //Contar el nuevo elemento que acabamos de guardar
            c++;
        } else {//Redimensionar
            datos=Arrays.copyOf(datos, c+10);
            //Añadir el nuevo elemento ahora que ya hay espacio
            datos[c] = valor;
            //Contamos el nuevo elemento
            c++;
        }

    }

    /**
     * 
     * @param posicion
     * @param valor
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public void sustituir(int posicion, int valor)  throws IndexOutOfBoundsException{
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
