/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdadiccionario;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author paveg
 */
public class Diccionario<C,V> implements IDiccionario<C,V>{
    ArrayList<C> claves=new ArrayList<>();
    ArrayList<V> valores=new ArrayList<>();
    
    @Override
    public boolean agregar(C clave, V valor) {
        if(claves.contains(clave))
            return false;
        else{
            claves.add(clave);
            valores.add(valor);
            return true;
        }   
    }

    @Override
    public boolean eliminar(C clave) {
        int pos=claves.indexOf(clave);
        if(pos>=0){
            claves.remove(pos);
            valores.remove(pos);
            return true;
        }else{
            return false;
        }   
    }

    @Override
    public void modificar(C clave, V nuevoValor) {
        int pos=claves.indexOf(clave);
        if(pos>=0){
            valores.set(pos, nuevoValor);
        }else{
            throw new NoSuchElementException("Clave " + clave + " no encontrada");
        }   
    }

    @Override
    public V buscar(C clave) {
        int pos=claves.indexOf(clave);
        if(pos>=0){
            return valores.get(pos);
        }else{
            throw new NoSuchElementException("Clave " + clave + " no encontrada");
        } 
    }
    
    @Override
    public String toString(){
        String cadena="";
        for (int i = 0; i < claves.size(); i++) {
            cadena+="["+claves.get(i)+","+valores.get(i)+"]\n";
        }
        return cadena;
    }
    
}
