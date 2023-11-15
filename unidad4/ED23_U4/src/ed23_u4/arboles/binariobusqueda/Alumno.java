package ed23_u4.arboles.binariobusqueda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paveg
 */
public class Alumno implements Comparable<Alumno>{
    private String numControl;
    private String nombre;
    private String carrera;
    public Alumno(){}
    public Alumno(String numControl, String nombre, String carrera) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numControl=" + numControl + ", nombre=" + nombre + ", carrera=" + carrera + '}';
    }
    
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.numControl.compareToIgnoreCase(o.getNumControl());
         
//        if(this.numControl.compareToIgnoreCase(o.getNumControl())==0){
//            return 0;
//        }else if(this.numControl.compareToIgnoreCase(o.getNumControl())<0){
//            return -1;
//        }else{
//            return 1;
//        }
    }
    
    
}