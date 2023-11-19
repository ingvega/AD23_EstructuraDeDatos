/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espinosupermarket;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author CC-01
 */
public class Espino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Product> pq = new PriorityQueue<>(
                Comparator.comparing(Product::getFecha).
                        thenComparing(Product::getClave, Comparator.reverseOrder()));
        
        Scanner l = new Scanner(System.in);
        int n = Integer.parseInt(l.nextLine()), p;
        String partes[];
        LinkedList<LinkedList<Product>> almacen = new LinkedList<>();
        LinkedList<Product> columna;
        for (int i = 0; i < n; i++) {
            String linea = l.nextLine();

            if (linea.charAt(0) == 'C') {
                partes = linea.split(" ");
                p = Integer.parseInt(partes[1]);
                for (int j = 0; j < p; j++) {
                    pq.add(new Product(l.nextLine()));
                }
                int c = 5;
                columna = new LinkedList<>();
                while (!pq.isEmpty()) {
                    columna.add(pq.poll());
                    if(columna.size()==c){
                    //c--;
                    //if (c == 0) {
                        c = 5;
                        almacen.add(columna);
                        columna = new LinkedList<>();
                    }
                }
                if (!columna.isEmpty()) {
                    almacen.add(columna);
                }
            } else if (linea.charAt(0) == 'V') {
                partes = linea.split(" ");
                p = Integer.parseInt(partes[1]);
                columna = almacen.element();
                while (p > 0) {
                    if (!columna.isEmpty()) {
                        columna.poll();
                        p--;
                    }else{
                        almacen.poll();
                        columna = almacen.peek();
                    }
                }
                if (columna.isEmpty()) almacen.poll();
            }else{
                Product[][] m=new Product[5][almacen.size()];
                
                int cM,cC=0;
                for (int j = 0; j < almacen.size(); j++) {
                    cM=4;
                    columna=almacen.get(j);
                    cC=columna.size()-1;
                    for (int k = cC; k >=0; k--) {
                        m[cM--][j]=columna.get(k);
                    }
                }
                
                for (int j = 0; j < m.length; j++) {
                    for (int k = 0; k < m[0].length; k++) {
                        if(m[j][k]!=null){
                            System.out.print(m[j][k]);
                        }else{
                            System.out.print("    ");
                        }
                    }
                    System.out.println("");
                }
                
            }
            
        }
    }

}

class Product {// implements Comparable<Product>{

    LocalDate fecha;
    Integer clave;

    public Product() {
    }

    public Product(String linea) {
        String p[] = linea.split(" ");
        clave = Integer.parseInt(p[0]);
        fecha = LocalDate.parse(p[1]);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        String texto=""+clave; //"  1"
        while(texto.length()<3){
            texto=" "+texto;
        }
        return texto + " ";
    }

    
}
