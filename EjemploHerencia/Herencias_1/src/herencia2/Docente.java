/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author reroes
 */
public class Docente extends Persona{
    private double sueldo;
    
    public Docente(String n, String a, int e, double mat){
        super(n, a, e);
        establecerSueldo(mat);
    }
    
        
    public void establecerSueldo(double mat){
        sueldo = mat;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
        
    @Override
    public String toString(){
    
        return String.format("%s"
                + "Sueldo: %.2f\n", super.toString(), obtenerSueldo());
    }
}
