/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author paveg
 */
public class GrafoMatriz {
    private int numVerts;
    public static int maxVerts = 20;
    private Vertice[] verts;
    private int[][] matAd;

    public GrafoMatriz() {
        this(maxVerts);
    }

    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = -1;
            }
        }
    }

    private int buscarVertice(String nombre) {
        Vertice v = new Vertice(nombre);

        for (int i = 0; i < numVerts; i++) {
            if (verts[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarVertice(String nombre) {
        if (buscarVertice(nombre) == -1) {
            Vertice v = new Vertice(nombre);
            v.setNumVertice(numVerts);
            verts[numVerts++] = v;
        }
    }

    public void agregarArco(String nomVerticeA, String nomVerticeB) throws Exception {
        int va, vb;
        va = buscarVertice(nomVerticeA);
        vb = buscarVertice(nomVerticeB);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
    }

    public void agregarArco(String nomVerticeA, String nomVerticeB, int peso) throws Exception {
        int va, vb;
        va = buscarVertice(nomVerticeA);
        vb = buscarVertice(nomVerticeB);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = peso;
    }
    
    public int adyacente(String nomVerticeA, String nomVerticeB) throws Exception {
        int va, vb;
        va = buscarVertice(nomVerticeA);
        vb = buscarVertice(nomVerticeB);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb];
    }
}
