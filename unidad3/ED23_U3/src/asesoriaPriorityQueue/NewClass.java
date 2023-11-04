/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesoriaPriorityQueue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author paveg
 */
public class NewClass {
//    public static void main(String[] args) {
//        ArrayList<Integer> numeros=new ArrayList<>();
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        numeros.add((int)(Math.random()*100));
//        
//        PriorityQueue<Integer> pqNumeros=new PriorityQueue<>();
//        for (Integer numero : numeros) {
//            pqNumeros.add(numero);
//            System.out.println(numero);
//        }
//        System.out.println("--------------------");
//        for (Integer numero : pqNumeros) {
//            System.out.println(numero);
//        }
//        System.out.println("--------------------");
//        while(pqNumeros.isEmpty()==false){
//            System.out.println(pqNumeros.poll());
//        }
//    }
    
    public static void main(String[] args) {
        Comparator<Cliente> comparadorCompleto=
                Comparator.comparing(Cliente::getSaldo,Comparator.reverseOrder())
                        .thenComparing(Cliente::getEstado)
                        .thenComparing(Cliente::getIncioContrato);
        PriorityQueue<Cliente> pq=new PriorityQueue<>(comparadorCompleto);
        ArrayList<Cliente> lista=new  ArrayList<Cliente>();
        
        Cliente c=new Cliente("i",30000,LocalDate.of(2000,1,1),"Guanajuato");
        pq.add(c);
        lista.add(c);
        c=new Cliente("X",30000,LocalDate.of(2000,1,1),"Zacatecas");
        pq.add(c);
        lista.add(c);
        c=new Cliente("q",500000,LocalDate.of(1990,1,1),"Aguascaliente");
        pq.add(c);
        lista.add(c);
        c=new Cliente("y",5000000,LocalDate.of(2023,1,1),"Guanajuato");
        pq.add(c);
        lista.add(c);
        c=new Cliente("c",300000,LocalDate.of(1990,1,1),"Guanajuato");
        pq.add(c);
        lista.add(c);
        
        lista.sort(comparadorCompleto);
        
        c=new Cliente("g",4000000,LocalDate.of(2010,1,1),"Campeche");
        pq.add(c);
        lista.add(c);
        
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
        System.out.println("--------------------------");
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
        }
        
    }
}
/*
    Agrupar por ciudad a los cliente que tengan más saldo y considerando 
    la mayor antiguedad
    Guanajuato 1000000 01-01-2010
    Guanajuato 1000000 01-01-2023 
    Michoacán 2000000 01-01-2020
    Michoacán 1500000 01-01-2020
*/
class Cliente{
    private String nombre;
    private int saldo;
    private LocalDate incioContrato;
    private String estado;

    public Cliente(String nombre, int saldo, LocalDate incioContrato, String estado) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.incioContrato = incioContrato;
        this.estado = estado;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public LocalDate getIncioContrato() {
        return incioContrato;
    }

    public void setIncioContrato(LocalDate incioContrato) {
        this.incioContrato = incioContrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estado=" + estado +" saldo=" + saldo + ", incioContrato=" + incioContrato + "nombre=" + nombre  +  '}';
    }
    
    
    
}
