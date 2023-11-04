/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable.thencomparing;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
    Ordenar
        Método 1
            Carrera
            Nombre
        Método 2
            Carrera
            Semestre
            Nombre
*/

/**
 *
 * @author paveg
 */
public class ThenComparing {
    public static void main(String[] args) {
        
        
        PriorityQueue<Alumno> pqCA=
                new PriorityQueue<>(Comparator.comparing(Alumno::getCarrera)
                                                    .thenComparing(Alumno::getNombre));
        pqCA.add(new Alumno("S02","Zavala Juan","Sistemas Automotrices",5));
        pqCA.add(new Alumno("S01","Medina Alberto","Sistemas Computacionales",1));
        pqCA.add(new Alumno("T11","Perez Juan ","Sistemas Automotrices",5 ));
        
//        for (Alumno alumno : pqCA) {
//            System.out.println(alumno);
//        }
        while(!pqCA.isEmpty()){
            System.out.println(pqCA.poll());
        }
        System.out.println("");
        PriorityQueue<Alumno> pqCSA=new PriorityQueue<>(
                Comparator.comparing(Alumno::getCarrera)
                                    .thenComparing(Alumno::getSemestre,Comparator.reverseOrder())
                                    .thenComparing(Alumno::getNombre)
        );
        pqCSA.add(new Alumno("S02","Zavala Juan","Sistemas Automotrices",8));
        pqCSA.add(new Alumno("S01","Medina Alberto","Sistemas Computacionales",1));
        pqCSA.add(new Alumno("T11","Perez Juan ","Sistemas Automotrices",5 ));
        
//        for (Alumno alumno : pqCSA) {
//            System.out.println(alumno);
//        }
        while(!pqCSA.isEmpty()){
            System.out.println(pqCSA.poll());
        }
    }
}



class Alumno {
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
}
