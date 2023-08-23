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
public class PruebaEstudiante {
    public static void main(String[] args) {
        ArregloDinamico<Estudiante> estudiantes=new ArregloDinamico<>();
        Estudiante e=new Estudiante("S22120211","Denise","Aguado Perez ",3);
        estudiantes.agregar(e);
        e=new Estudiante("S22120182","Aaron","Aguilera Guzman",3);
        estudiantes.agregar(e);
        e=new Estudiante("S21120233","Eliseo Emiliano","Arizaga Castro",5);
        estudiantes.agregar(e);
        
        Estudiante eABuscar=new Estudiante("s22120233","","",0);
        
        System.out.println(e.equals(eABuscar));
        //Buscar a un estudiante
        int posicion=estudiantes.buscar(e);
        System.out.println(posicion);
       
        for (int i = 0; i < estudiantes.tamanio(); i++) {
            e=estudiantes.obtener(i);
//            System.out.println(e.getNoControl() + " - " + e.getNombre() + " " + 
//                    e.getApellidos() + " - " + e.getSemestre());
            System.out.println(e);
        }
        
        
        
    }
}
