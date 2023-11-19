
import ed23_u4.arboles.binariobusqueda.Alumno;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paveg
 */
public class DiccionarioAlumnos {

    public static void main(String[] args) {
        //TreeMap<Integer, Alumno> alumnos = new TreeMap<>();
        TreeMap<String, Alumno> alumnos = new TreeMap<>();
        Alumno a;

        /*a = new Alumno("S22120211", "Aguado Perez Denise", "Sistemas Computacionales");
        alumnos.put(1, a);
        a = new Alumno("S22120182", "Aguilera Guzman Aaron", "Sistemas Computacionales");
        alumnos.put(2, a);
        a = new Alumno("S21120233", "Arizaga Castro Eliseo Emiliano", "Sistemas Computacionales");
        alumnos.put(3, a);
        a = new Alumno("S22120147", "Barrera Barrera Erik", "Sistemas Computacionales");
        alumnos.put(4, a);
        a = new Alumno("S21120215", "Cañedo Lopez Cristian Jose", "Sistemas Computacionales");
        alumnos.put(5, a);
        a = new Alumno("S22120231", "Cisneros Cardenas Jose Roberto", "Sistemas Computacionales");
        alumnos.put(6, a);
        a = new Alumno("S22120153", "Gaona Ceja Yareli Yosselin", "Sistemas Computacionales");
        alumnos.put(7, a);
        a = new Alumno("S22120160", "Garcia Telles Chelsea Andrea", "Sistemas Computacionales");
        alumnos.put(8, a);
        a = new Alumno("S21120176", "Gonzalez Zamudio Sergio", "Sistemas Computacionales");
        alumnos.put(9, a);
        a = new Alumno("S21120194", "Gutierrez Vieyra Emmanuel Alejandro", "Sistemas Computacionales");
        alumnos.put(10, a);
        a = new Alumno("S21120228", "Lopez Mora Alexander", "Sistemas Computacionales");
        alumnos.put(11, a);
        a = new Alumno("S21120230", "Luna Regalado Andres", "Sistemas Computacionales");
        alumnos.put(12, a);
        a = new Alumno("S21120244", "Mora Rico Marco Antonio", "Sistemas Computacionales");
        alumnos.put(13, a);
        a = new Alumno("S19120159", "Ortiz Perez Enya", "Sistemas Computacionales");
        alumnos.put(14, a);
        a = new Alumno("S21120241", "Paniagua Flores Agustin", "Sistemas Computacionales");
        alumnos.put(15, a);
        a = new Alumno("S21120170", "Perez Alvarez Sebastian", "Sistemas Computacionales");
        alumnos.put(16, a);
        a = new Alumno("S22120010", "Rodriguez Ortiz Leonardo Alexandro", "Sistemas Computacionales");
        alumnos.put(17, a);
        a = new Alumno("S21120212", "Rodriguez Rodriguez Erik", "Sistemas Computacionales");
        alumnos.put(18, a);
        a = new Alumno("S19120185", "Zamudio Ruiz Cesar", "Sistemas Computacionales");
        alumnos.put(19, a);*/
        a = new Alumno("S22120211", "Aguado Perez Denise", "Sistemas Computacionales");
        alumnos.put("S22120211", a);
        a = new Alumno("S22120182", "Aguilera Guzman Aaron", "Sistemas Computacionales");
        alumnos.put("S22120182", a);
        a = new Alumno("S21120233", "Arizaga Castro Eliseo Emiliano", "Sistemas Computacionales");
        alumnos.put("S21120233", a);
        a = new Alumno("S22120147", "Barrera Barrera Erik", "Sistemas Computacionales");
        alumnos.put("S22120147", a);
        a = new Alumno("S21120215", "Cañedo Lopez Cristian Jose", "Sistemas Computacionales");
        alumnos.put("S21120215", a);
        a = new Alumno("S22120231", "Cisneros Cardenas Jose Roberto", "Sistemas Computacionales");
        alumnos.put("S22120231", a);
        a = new Alumno("S22120153", "Gaona Ceja Yareli Yosselin", "Sistemas Computacionales");
        alumnos.put("S22120153", a);
        a = new Alumno("S22120160", "Garcia Telles Chelsea Andrea", "Sistemas Computacionales");
        alumnos.put("S22120160", a);
        a = new Alumno("S21120176", "Gonzalez Zamudio Sergio", "Sistemas Computacionales");
        alumnos.put("S21120176", a);
        a = new Alumno("S21120194", "Gutierrez Vieyra Emmanuel Alejandro", "Sistemas Computacionales");
        alumnos.put("S21120194", a);
        a = new Alumno("S21120228", "Lopez Mora Alexander", "Sistemas Computacionales");
        alumnos.put("S21120228", a);
        a = new Alumno("S21120230", "Luna Regalado Andres", "Sistemas Computacionales");
        alumnos.put("S21120230", a);
        a = new Alumno("S21120244", "Mora Rico Marco Antonio", "Sistemas Computacionales");
        alumnos.put("S21120244", a);
        a = new Alumno("S19120159", "Ortiz Perez Enya", "Sistemas Computacionales");
        alumnos.put("S19120159", a);
        a = new Alumno("S21120241", "Paniagua Flores Agustin", "Sistemas Computacionales");
        alumnos.put("S21120241", a);
        a = new Alumno("S21120170", "Perez Alvarez Sebastian", "Sistemas Computacionales");
        alumnos.put("S21120170", a);
        a = new Alumno("S22120010", "Rodriguez Ortiz Leonardo Alexandro", "Sistemas Computacionales");
        alumnos.put("S22120010", a);
        a = new Alumno("S21120212", "Rodriguez Rodriguez Erik", "Sistemas Computacionales");
        alumnos.put("S21120212", a);
        a = new Alumno("S19120185", "Zamudio Ruiz Cesar", "Sistemas Computacionales");
        alumnos.put("S19120185", a);

        //SortedMap mitad1 = alumnos.headMap(10, true);
        //SortedMap mitad1 = alumnos.tailMap("S21120194", true);
        
        SortedMap mitad1 = alumnos.subMap("S21120000","S21129999");
        for (Object numLista : mitad1.keySet()) {
            System.out.println(numLista + " - " + mitad1.get(numLista));
        }

    }
}
