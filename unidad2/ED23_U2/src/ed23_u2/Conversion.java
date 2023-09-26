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
public class Conversion {
    private static char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    public static void main(String[] args) {
        //System.out.println(decToHex(1000));
        System.out.println(m2(5));
    }
    public static String decToHex(int decimal){
        if(decimal<16)
            return ""+hex[decimal];
        return decToHex(decimal/16)+hex[decimal%16];
    }

    public static int m(int x){
        if(x<=1){
            return x;
        }else{
            return x*m(x-1)*x;
        }
    }
    
    
    public static int m2(int x){
        if(x<=1){
            return x;
        }else{
            return x*m(x-1)*x;
        }
    }
    
    //public static ArrayList metodo(){}
}
