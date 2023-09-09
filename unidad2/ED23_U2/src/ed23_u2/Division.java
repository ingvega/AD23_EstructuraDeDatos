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
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println(divIterativa(25, 5));
        System.out.println(divRecursiva(25, 5, 0));
        System.out.println(divRecursiva(25, 5));
    }
    
    public static int divIterativa(int dividendo, int divisor) 
    {
        int cociente = 0;
       
        if(divisor == dividendo) return 1;
        
        while(dividendo >= divisor)
        {
            dividendo = dividendo - divisor;
            cociente++;
        }
        return cociente;
    }
    
    public static int divRecursiva(int dividendo, int divisor, int cociente)
    {
        if(dividendo < divisor) 
        {
            return cociente;
        }
        else
        {
            //return divRecursiva(dividendo - divisor, divisor, ++cociente);
            return divRecursiva(dividendo - divisor, divisor, cociente+1);
        }
        
    }
    
    public static int divRecursiva(int dividendo, int divisor)
    {
        if(dividendo < divisor) 
        {
            return 0;
        }
        else
        {
            return divRecursiva(dividendo - divisor, divisor)+1;
        }
        
    }



}
