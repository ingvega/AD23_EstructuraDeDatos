
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paveg
 */
public class UsoEstructuras {
    public static void main(String[] args) {
        TreeMap<String,String> carreras=new TreeMap<>();
        carreras.put("S","SISTEMAS COMPUTACIONALES");
        carreras.put("G","GESTION");
        carreras.put("E","ELECTRONICA");
        carreras.put("S","SISTEMAS COMP");
        
        //Iterar todas las claves (todas las inciales)
        System.out.println("INICIALES DE LAS CARRERAS");
        for(String inicial:carreras.keySet()){
            System.out.println(inicial);
        }
        
        System.out.println("NOMBRES DE LAS CARRERAS");
        for(String carrera:carreras.values()){
            System.out.println(carrera);
        }
        
        for (Map.Entry<String, String> entry : carreras.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
        /*
        TreeSet<String> coleccion=new TreeSet<>();
        
        System.out.println(coleccion.add("D"));
        //System.out.println(coleccion.add(null));
        System.out.println(coleccion.add("R"));
        System.out.println(coleccion.add("X"));
        System.out.println(coleccion.add("O"));
        System.out.println(coleccion.add("A"));
        System.out.println(coleccion.add("D"));
        
        for (String string : coleccion) {
            System.out.println(string);
        }
        */
        
        
        
        /*TreeMap -> Almacena pares de valores (clave - valor)
        No acepta null para las claves pero sí para los valores
        La clave no acepta repetidos
        
        TreeSet -> Almacena valores
        No acepta valores repetidos
        */
    }
}
