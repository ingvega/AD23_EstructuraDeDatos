/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paveg
 */
public class RepasoRecursividad {

    
    public static void main(String[] args) {
        RepasoRecursividad r = new RepasoRecursividad();
        System.out.println(r.generarPalindromo("Hola"));
    }

    public String generarPalindromo(String cadena) {
        return generarPalindromo(cadena, cadena.length() - 1);
    }

    private String generarPalindromo(String cadena, int posicion) {
        if (posicion >= 0) {
            cadena = cadena + cadena.charAt(posicion);
            posicion--;
            return generarPalindromo(cadena,posicion);

        } else {
            return cadena;
        }

    }
}
