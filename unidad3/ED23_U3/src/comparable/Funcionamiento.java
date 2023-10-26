/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.PriorityQueue;

/**
 *
 * @author paveg
 */
public class Funcionamiento {
    public static void main(String[] args) {
        String cadena="Hola";
        String cadena2="Mundo";
        String cadena3="HOLA";
        String cadena4="hola";
        String cadena5="hola";
        System.out.println(cadena.compareTo(cadena2));
        System.out.println(cadena2.compareTo(cadena));
        System.out.println(cadena3.compareTo(cadena4));
        System.out.println(cadena4.compareTo(cadena3));
        System.out.println(cadena4.compareTo(cadena5));
        
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Hola");
        pq.add("Mundo");
        pq.add("HOLA");
        pq.add("hola");
        pq.add("hola");
        
        for (String string : pq) {
            System.out.println(string);
        }
        
        PriorityQueue<Alumno> pqa=new PriorityQueue<>();
        pqa.add(new Alumno("s11","Juan Perez"));
        pqa.add(new Alumno("S01","Alberto Medina"));
        
        for (Alumno alumno : pqa) {
            System.out.println(alumno);
        }
    }
}

class Alumno implements Comparable<Alumno>{
    private String noControl;
    private String nombre;

    public Alumno(String noControl, String nombre) {
        this.noControl = noControl;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "noControl=" + noControl + ", nombre=" + nombre + '}';
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Alumno o) {
            return this.noControl.toLowerCase().compareTo(o.noControl.toLowerCase());
    }
    
    
}
