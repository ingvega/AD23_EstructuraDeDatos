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
        pqa.add(new Alumno("S02","Medina Juan","Sistemas Automotrices",5));
        pqa.add(new Alumno("T11","Perez Juan ","Sistemas Automotrices",5 ));
        pqa.add(new Alumno("S01","Medina Alberto","Sistemas Computacionales",1));
        
        System.out.println("Medina Juan".compareTo("Medina Alberto"));
        System.out.println("Medina Alberto".compareTo("Medina Juan"));
        
        for (Alumno alumno : pqa) {
            System.out.println(alumno);
        }
    }
}

class Alumno {// implements Comparable<Alumno>{
    private String noControl;
    private String nombre;
    private String carrera;
    private int semestre;

    public Alumno(String noControl, String nombre, String carrera, int semestre) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre=semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "noControl=" + noControl + ", nombre=" + nombre + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }

    

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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

//    @Override
//    public int compareTo(Alumno o) {
//            return this.noControl.toLowerCase().compareTo(o.noControl.toLowerCase());
//    }
/*    
    @Override
    public int compareTo(Alumno o) {
        //this vs o
        //Comparar carrera
        //Cuando el compareTo de la carrera no sea 0 (es mayor o menor)
        //ese será el valor a devolver
        if(this.carrera.compareToIgnoreCase(o.carrera)!=0){
            return this.carrera.compareToIgnoreCase(o.carrera);
        }
        if(this.semestre<o.semestre){
            return -1;
        }else if(this.semestre>o.semestre){
            return 1;
        }
//        Integer sem=this.semestre;
//        Integer oSem=o.semestre;
//        if(sem.compareTo(oSem)!=0){
//            //Solo si la carrera es la misma revisará el semestre
//            //Comparar el semestre
//            return sem.compareTo(oSem);
//        }
        
        //Solo si la carrera es la misma revisará el nombre
        //Comparar el nombre
        return this.nombre.compareToIgnoreCase(o.nombre);
        
        
    }   */ 
}
