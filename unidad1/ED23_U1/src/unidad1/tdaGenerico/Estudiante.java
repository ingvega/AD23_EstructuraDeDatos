/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1.tdaGenerico;

/**
 *
 * @author paveg
 */
public class Estudiante {

    private String noControl;
    private String nombre;
    private String apellidos;
    private int Semestre;

    public Estudiante(){}

    public Estudiante(String noControl, String nombre, String apellidos, int Semestre) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Semestre = Semestre;
    }
    
    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }
    
    @Override
    public String toString(){
        return getNoControl() + " - " + getNombre() + " " + 
                    getApellidos() + " - " + getSemestre();
    }
    @Override
    public boolean equals(Object obj){
        //Revisa si es la misma instancia
        if(obj==this) return true;
        
        //Identificar que obj sea un objeto y no null
        if(obj==null) return false;
        
        //Identificar que obj sea de tipo estudiante
        if(obj instanceof Estudiante){
            //Convertir obj a Estudiante
            Estudiante otroEstudiante=(Estudiante)obj;
//"S22120001"="s22120001"            
//Comparar los números de control
            if(otroEstudiante.getNoControl().equalsIgnoreCase(this.noControl)){
                return true;
            }
        }
        return false;
    }

}
