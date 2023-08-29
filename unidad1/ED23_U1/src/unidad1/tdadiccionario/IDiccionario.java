/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdadiccionario;

/**
 *
 * @author paveg
 */
public interface IDiccionario<C,V> {
    boolean agregar (C clave,V valor);
    boolean eliminar(C clave);
    void modificar(C clave, V nuevoValor);
    V buscar (C clave);
    
}
