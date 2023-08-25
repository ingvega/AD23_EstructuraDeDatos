/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class UsoArrayListEquals {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas=new ArrayList<>();
        listaCadenas.add("X");
        listaCadenas.add("A");
        listaCadenas.add("sd");
        listaCadenas.add("Xwe");
        listaCadenas.add("www");
        listaCadenas.add("qqq");
        
        ArrayList<String> listaCadenas2=new ArrayList<>();
        listaCadenas2.add("dgsdfsd");
        listaCadenas2.add("gsdfhg");
        
        System.out.println(listaCadenas.equals(listaCadenas2));
        
        
        String cadena="www";
        for (int i = 0; i < listaCadenas.size(); i++) {
            if(listaCadenas.get(i).equals(cadena)){
                System.out.println("Encontrada en la posicion " + i);
                break;
            }
        }
                
        if(listaCadenas.contains(cadena))
            System.out.println("Encontrada en la posicion " + listaCadenas.indexOf(cadena));
        System.out.println("-------------------------------------------------");
        
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        Estudiante e=new Estudiante("S22120211","Denise","Aguado Perez ",3);
        estudiantes.add(e);
        e=new Estudiante("S22120182","Aaron","Aguilera Guzman",3);
        estudiantes.add(e);
        e=new Estudiante("S21120233","Eliseo Emiliano","Arizaga Castro",5);
        estudiantes.add(e);
        
        Estudiante eABuscar=new Estudiante("s21120233","","",0);
        
        if(estudiantes.contains(eABuscar))
            System.out.println("Encontrado en la posicion " + 
                    estudiantes.indexOf(eABuscar));
    }
}
