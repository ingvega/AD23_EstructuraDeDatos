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
public class InvertirDigitos {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(invertir(n));
        System.out.println(invertirConModulo(n));
    }

    /*Con String*/
    public static String invertir(int numero) {
        //Caso base
        if (numero < 10) {
            return numero + "";
        } else {
            //Caso recursivo
            //Armar el nuevo número
            //123

            //obtener el dígito de la derecha
            String strNumero = (numero + "");
//            int nuevo=Integer.parseInt(strNumero.substring(0, strNumero.length()-1));
//            String digito=strNumero.charAt(strNumero.length()-1)+"" + invertir(nuevo);
//            return digito;//invertir(nuevo);
            String digito = strNumero.charAt(strNumero.length() - 1) + "";
            int nuevo = Integer.parseInt(strNumero.substring(0, strNumero.length() - 1));
            return digito + invertir(nuevo);
        }
    }
    //Con módulo

    public static String invertirConModulo(int numero) {
        //Caso base
        if (numero < 10) {
            return numero + "";
        } else {
            //Caso recursivo
            //Armar el nuevo número
            //123

            //obtener el dígito de la derecha
            int digito = numero%10;
            int nuevo = numero/10;
            return digito + invertir(nuevo);
        }

    }
}
