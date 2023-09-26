/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class DoblandoLaCarta {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println(doblar(l.nextInt(),l.nextInt(),l.nextInt(),l.nextInt(),0));
        //Ana
        //AnA
    }
    
    public static int doblar(double a,double b, double c, double d){
        return doblar(a, b, c, d,0);
    }
    
    private static int doblar(double a,double b, double c, double d,int dobleces){
        if(dobleces==8){
            return -1;
        }else{
            double nA,nB,nC,nD;
            nA=Math.max(a, b);
            nB=Math.min(a, b);
            nC=Math.max(c, d);
            nD=Math.min(c, d);
            if(nA<=nC && nB<=nD){
                return dobleces;
            }else{
                return doblar(nA/2.0,nB,nC,nD,dobleces+1);
            }       
        }
    }
}


















