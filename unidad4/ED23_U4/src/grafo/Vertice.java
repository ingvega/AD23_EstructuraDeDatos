/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.Objects;

/**
 *
 * @author paveg
 */
public class Vertice {

    private String nombre;
    private int numVertice;

    public Vertice(String nombre) {
        this.nombre = nombre;
        numVertice = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    
//    public boolean equals(Vertice n) 
//    {
//        return nombre.equals(n.nombre);
//    }

    @Override
    public String toString() {
        return "Vertice{" + "nombre=" + nombre + ", numVertice=" + numVertice + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertice other = (Vertice) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
