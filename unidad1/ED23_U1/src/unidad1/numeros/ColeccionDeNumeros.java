/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.numeros;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author paveg
 */
public class ColeccionDeNumeros implements TDAColeccionDeNumeros {

    private int posicion;
    private int n;
    private int coleccion[];

    public ColeccionDeNumeros() {
//        System.out.println("");
        this(10);
//        this.n = 10;
//        coleccion = new int [n];
    }

    public ColeccionDeNumeros(int n) {
        if (n >= 2) {
            this.n = n;
            coleccion = new int[n];
        } else {
            throw new IllegalArgumentException("Valor minimo de 2");
        }
    }

    @Override
    public void agregar(int numero) {
        asegurarCapacidad();
        coleccion[posicion++] = numero;
    }

    @Override
    public void agregar(int numero, int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException("No se aceptan posiciones "
                    + "negativas: " + posicion);
        }
        if (posicion > this.posicion) {
            throw new IndexOutOfBoundsException("Posición no válida (" + posicion + "): "
                    + "La posición indicada ocasionaría que queden espacios vacíos "
                    + "dentro de la colección, la posición máxima aceptada es "
                    + this.posicion);
        }

        asegurarCapacidad();
        //Se añadirá al final
        if (posicion == this.posicion) {
            coleccion[posicion++] = numero;
        } else {
            //La posición es intermedia debo recorrer los elementos a la derecha
            for (int i = this.posicion; i > posicion; i--) {
                coleccion[i] = coleccion[i - 1];
            }
            coleccion[posicion++] = numero;
        }
    }

    private void asegurarCapacidad() {
        if (posicion == coleccion.length) {
            coleccion = Arrays.copyOf(coleccion, coleccion.length + n);
        }
    }

    @Override
    public int[] numerosIngresados() {
        if (posicion == 0) {
            return null;
        } else {
            return Arrays.copyOf(coleccion, posicion);
        }
    }

    @Override
    public int[] numerosIngresadosSinDuplicados() {
        if (posicion != 0) {
            return null;
        } else {
            ArrayList<Integer> valoresUnicos = new ArrayList<>();
            for (int i = 0; i < posicion; i++) {
                if(!valoresUnicos.contains(coleccion[i])){
                    valoresUnicos.add(coleccion[i]);
                }
            }
            int[] valores=new int[valoresUnicos.size()];
            for (int i = 0; i < valoresUnicos.size(); i++) {
                valores[i]=valoresUnicos.get(i);
            }
            return valores;
        }

    }

    @Override
    public int reemplazarTodos(int numero, int nuevo) {
        int cont=0;
        for (int i = 0; i < posicion; i++) {
            if(coleccion[i]==numero){
                coleccion[i]=nuevo;
                cont++;
            }
        }
        return cont;
    }
    
    @Override
    public void reemplazar(int posicion, int nuevo){
        if (posicion < 0) {
            throw new IndexOutOfBoundsException("No se aceptan posiciones "
                    + "negativas: " + posicion);
        }
        
        if (posicion > this.posicion-1) {
            throw new IndexOutOfBoundsException("Posición no válida (" + posicion + "): "
                    + "La posición indicada ocasionaría que queden espacios vacíos "
                    + "dentro de la colección, la posición máxima aceptada es "
                    + this.posicion);
        }
        coleccion[posicion]=nuevo;
    }

    @Override
    public int longitud(){
        return posicion;
    }
    
    @Override
    public int sumar(){
        int suma=0;
        for (int i = 0; i < posicion; i++) {
            suma+=coleccion[i];
        }
        return suma;
    }
    @Override
    public double promedio(){
        if(posicion>0){
            return (double)sumar()/posicion;
        }
        return 0;
    }
    
    @Override
    public void ordenar(){
        Arrays.sort(coleccion, 0, posicion-1);
    }

    @Override
    public String toString() {
        StringBuilder constructor=new StringBuilder();
        constructor.append("[");
        for (int i = 0; i < posicion; i++) {
            //constructor.append(coleccion[i]+",");
            
            constructor.append(coleccion[i]);
            constructor.append(",");
        }
        String cadena=constructor.toString();
        
        return cadena.substring(0,cadena.length()-1);
    }
}
