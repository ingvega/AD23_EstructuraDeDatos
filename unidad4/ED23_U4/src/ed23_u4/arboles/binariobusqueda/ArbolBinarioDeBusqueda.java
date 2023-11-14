/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed23_u4.arboles.binariobusqueda;

/**
 *
 * @author paveg
 */
public class ArbolBinarioDeBusqueda<T> {

    private Nodo raiz;

    public ArbolBinarioDeBusqueda() {
    }

    public ArbolBinarioDeBusqueda(T dato) {
        Comparable cDato = (Comparable) dato;
        raiz = new Nodo(dato);
    }

    public boolean agregar(T dato) {
        //Verificar que dato pueda compararse
        Comparable cDato = (Comparable) dato;
        if (estaVacio()) {
            raiz = new Nodo(dato);
            return true;
        } else {
            return agregar(cDato, raiz);
        }
    }
    
    public boolean buscar(T dato) {
        Comparable cDato = (Comparable) dato;
        if (estaVacio()) {
            return false;
        } else {
            return buscar(cDato, raiz);
        }
    }
    
    private boolean buscar(Comparable cDato, Nodo raiz) {
        int comparacion = cDato.compareTo(raiz.getDato());
        //El dato ya existe en el árbol
        if (comparacion == 0) {
            return true;
        } else if (comparacion < 0) {
            if (raiz.izdo == null) {
                return false;
            } else {
                return buscar(cDato, raiz.getIzdo());
            }
        } else {
            if (raiz.dcho == null) {
                return false;
            } else {
                return buscar(cDato, raiz.getDcho());
            }
        }
        //Verificar que el dato no exista en el árbol
        //Añadirlo donde CORRESPONDA
    }

    private boolean agregar(Comparable cDato, Nodo raiz) {
        int comparacion = cDato.compareTo(raiz.getDato());

        //El nuevo nodo ya existe en el árbol
        if (comparacion == 0) {
            return false;
        } else if (comparacion < 0) {
            if (raiz.izdo == null) {
                raiz.setIzdo(new Nodo((T) cDato));
                return true;
            } else {
                return agregar(cDato, raiz.getIzdo());
            }
        } else {
            if (raiz.dcho == null) {
                raiz.setDcho(new Nodo((T) cDato));
                return true;
            } else {
                return agregar(cDato, raiz.getDcho());
            }
        }
        //Verificar que el dato no exista en el árbol
        //Añadirlo donde CORRESPONDA
    }

    public void imprimir() {
        if (raiz != null) {
            raiz.recorrerPreorden();
            System.out.println("--------------");
            raiz.recorrerInorden();
            System.out.println("--------------");
            raiz.recorrerPostorden();
        }
    }

    public int contarNodos() {
        if (raiz != null) {
            return raiz.contarNodos();
        } else {
            return 0;
        }
    }

    public T getRaiz() {
        return raiz.getDato();
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    private class Nodo {

        private T dato;
        private Nodo izdo;
        private Nodo dcho;

        public Nodo(T dato) {
            this.dato = dato;
            //izdo=dcho=null;
        }

        public Nodo(Nodo izdo, T dato, Nodo dcho) {
            this(dato);
            this.izdo = izdo;
            this.dcho = dcho;
        }

        public void recorrerPreorden() {
            System.out.println(this.dato);
            if (izdo != null) {
                izdo.recorrerPreorden();
            }

            if (dcho != null) {
                dcho.recorrerPreorden();
            }

        }

        public void recorrerInorden() {

            if (izdo != null) {
                izdo.recorrerInorden();
            }
            System.out.println(this.dato);
            if (dcho != null) {
                dcho.recorrerInorden();
            }

        }
        
        public void recorrerPostorden() {

            if (izdo != null) {
                izdo.recorrerPostorden();
            }
            
            if (dcho != null) {
                dcho.recorrerPostorden();
            }
            System.out.println(this.dato);
        }

        public int contarNodos() {
            int cont = 1;

            if (izdo != null) {
                cont += izdo.contarNodos();
            }

            if (dcho != null) {
                cont += dcho.contarNodos();
            }
            return cont;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo getIzdo() {
            return izdo;
        }

        public void setIzdo(Nodo izdo) {
            this.izdo = izdo;
        }

        public Nodo getDcho() {
            return dcho;
        }

        public void setDcho(Nodo dcho) {
            this.dcho = dcho;
        }

    }
}
