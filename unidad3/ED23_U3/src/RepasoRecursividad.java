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
    Object[][] matriz=new Object[][]{
            {4,"Juan"},
            {7,"Luis"},
            {1,"Ana"},
            {90,"Raúl"},
            {2,"Rosa"},
            {10,"Iván"}
        };
    
    public static void main(String[] args) {   
        RepasoRecursividad r = new RepasoRecursividad();
//        System.out.println(r.generarPalindromo("Hola"));
        
        System.out.println(r.buscar(10));
    }
    
    public String buscar(int valor){
        return buscar(valor,0);
    }
    
    private String buscar(int valor,int pos){
        if(matriz.length==pos){
            //Caso base
            return "Alumno no encontrado";
        }else{
            if(matriz[pos][0].equals(valor)){
                return matriz[pos][1].toString();
            }else{
                return buscar(valor,pos+1);
            }
        }
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
