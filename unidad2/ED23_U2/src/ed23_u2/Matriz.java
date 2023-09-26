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
public class Matriz {
    static int[][] matriz;
    public static void main(String[] args) {
        int d=dimension(20);
        System.out.println(d);
        matriz=new int[d][d];
        
        
    }
    
    private static int dimension(int n){
        if(n>=2){
            return dimension(n/2)+1;
        }
        return 1;
    }
    public static void llenar(int n, int x){
        if(matriz.length>x){
            //Caso recursivo
            matriz[x][x]=n;
            for (int i = x+1; i < matriz.length; i++) {
                matriz[i][x]=n;
                matriz[x][i]=n;
            }
        }
        
    }
}
