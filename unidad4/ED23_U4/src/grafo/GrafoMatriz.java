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
    private boolean dirigido;

    public boolean isDirigido() {
        return dirigido;
    }

    public GrafoMatriz(boolean dirigido) {
        this(maxVerts, dirigido);
    }

    public GrafoMatriz(int mx, boolean dirigido) {
        this.dirigido = dirigido;
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

    public boolean agregarVertice(String nombre) {
        if (buscarVertice(nombre) == -1) {
            Vertice v = new Vertice(nombre);
            v.setNumVertice(numVerts);
            verts[numVerts++] = v;
            return true;
        }
        return false;
    }

    public void agregarArco(String nomVerticeA, String nomVerticeB) throws Exception {
        int va, vb;
        va = buscarVertice(nomVerticeA);
        vb = buscarVertice(nomVerticeB);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
        if (!dirigido) {
            matAd[vb][va] = 1;
        }
    }

    public void agregarArco(String nomVerticeA, String nomVerticeB, int peso) throws Exception {
        int va, vb;
        va = buscarVertice(nomVerticeA);
        vb = buscarVertice(nomVerticeB);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = peso;
        if (!dirigido) {
            matAd[vb][va] = peso;
        }
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
