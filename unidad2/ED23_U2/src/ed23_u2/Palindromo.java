/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u2;

/**
 *
 * @author paveg
 */
public class Palindromo {
    public static void main(String[] args) {
        //String cadena="r";
        //System.out.println(cadena.substring(1,cadena.length()-1));
        System.out.println(esPalindromo("palaBAlaP",0));
        /*Recursividad
        Parametros: cadena, posicion
        Retorno: boolean
        Caso base
            Solo cadena: cuando ya no hay más cadena que revisar
            Con posicion: cuando haya llegado al centro de la cadena
            Cuando ya se detecta que no es palíndromo
        Caso recursivo
            Solo cadena: hacer la revisión de la cadena disminuida por el primer y último caracter
            Con posicion: hacer la revisión con la cadena original y la posición aumentada en 1
        */
    }
    //anna length()=4/2=2
        //anana length()=5/2=2
    public static boolean esPalindromo(String cadena,int posicion){
        System.out.println(cadena + "-" + posicion);
        
        if(cadena.length()/2==posicion){
            return true;
        }else{
            int posFin=cadena.length()-1-posicion;
//            if((""+cadena.charAt(posicion)).
//                    equalsIgnoreCase((""+cadena.charAt(posFin)))){
//            }
            System.out.println(cadena.substring(posicion,posicion+1) + "-" +
                    cadena.substring(posFin,posFin+1));
            if(cadena.substring(posicion,posicion+1).
                    equalsIgnoreCase(cadena.substring(posFin,posFin+1))){
                //hacer la revisión con la cadena original y la posición aumentada en 1
                return esPalindromo(cadena,posicion+1);
            }else{
                return false;
            }
        }
    }
    
    public static boolean esPalindromo(String cadena){
        //cuando ya no hay más cadena que revisar
        if(cadena.isEmpty()){
            return true;
        }else{
            //hacer la revisión de la cadena disminuida por el primer y último caracter
            //String inicio=cadena.charAt(0)+"",fin=cadena.charAt(cadena.length()-1)+"";
            String inicio=cadena.substring(0,1),fin=
                    cadena.substring(cadena.length()-1,cadena.length());
            if(inicio.equalsIgnoreCase(fin)){
                //palaralap
                //alarala
                //laral
                //ara
                //r
                if(cadena.length()>1)
                    return esPalindromo(cadena.substring(1,cadena.length()-1));
                else
                    return true;
            }else{
                return false;
            }
        }
    }
}
