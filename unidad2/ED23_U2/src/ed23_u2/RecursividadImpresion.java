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
public class RecursividadImpresion {

    public static void main(String[] args) {
        m(4);
    }

    static void m(int n) {
        if (n > 0) {
            m(n - 1);
            m(n - 2);
            m(n - 3);
            System.out.print(n);
            
        }
    }
}
