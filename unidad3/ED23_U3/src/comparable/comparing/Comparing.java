/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable.comparing;
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
public class Comparing {
    public static void main(String[] args) {
        
        
        PriorityQueue<Alumno> pqCA=new PriorityQueue<>(new CarreraAlumno());
        pqCA.add(new Alumno("S02","Zavala Juan","Sistemas Automotrices",5));
        pqCA.add(new Alumno("S01","Medina Alberto","Sistemas Computacionales",1));
        pqCA.add(new Alumno("T11","Perez Juan ","Sistemas Automotrices",5 ));
        
        for (Alumno alumno : pqCA) {
            System.out.println(alumno);
        }
        System.out.println("");
        PriorityQueue<Alumno> pqCSA=new PriorityQueue<>(new CarreraSemestreAlumno());
        pqCSA.add(new Alumno("S02","Zavala Juan","Sistemas Automotrices",3));
        pqCSA.add(new Alumno("S01","Medina Alberto","Sistemas Computacionales",1));
        pqCSA.add(new Alumno("T11","Perez Juan ","Sistemas Automotrices",5 ));
        
        for (Alumno alumno : pqCSA) {
            System.out.println(alumno);
        }
    }
}

class CarreraAlumno implements Comparator<Alumno>{
    @Override
    public int compare(Alumno o1, Alumno o2) {
        /*Método 1 Ordenar por Carrera y luego por Nombre*/
        if(o1.getCarrera().compareToIgnoreCase(o2.getCarrera())!=0){
            return o1.getCarrera().compareToIgnoreCase(o2.getCarrera());
        }else{
            //La carrera de o1 y o2 es la misma, ahora compara el nombre
            return o1.getNombre().compareToIgnoreCase(o2.getNombre());
        }
    }
}

class CarreraSemestreAlumno implements Comparator<Alumno>{
    @Override
    public int compare(Alumno o1, Alumno o2) {
        
        /*Método 1 Ordenar por Carrera, después por semestre y luego por Nombre*/
        if(o1.getCarrera().compareToIgnoreCase(o2.getCarrera())!=0){
            return o1.getCarrera().compareToIgnoreCase(o2.getCarrera());
        }
//        else if(Integer.compare(o1.getSemestre(),o2.getSemestre())!=0){
//            return Integer.compare(o1.getSemestre(),o2.getSemestre());
//        }
        else if(o1.getSemestre()>o2.getSemestre()){
            //La carrera de o1 y o2 es la misma, ahora compara el semestre
            return 1;
        }else if(o1.getSemestre()<o2.getSemestre()){
            //La carrera de o1 y o2 es la misma, ahora compara el semestre
            return -1;
        }else
            //La carrera y el semestre de o1 y o2 son los mismos, ahora compara el nombre
            return o1.getNombre().compareToIgnoreCase(o2.getNombre());
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
