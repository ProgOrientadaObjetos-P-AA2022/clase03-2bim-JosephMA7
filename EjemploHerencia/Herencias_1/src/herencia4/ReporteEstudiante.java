/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String codigo){
        super(codigo);
    }
    
    public void establecerLista(ArrayList<Estudiante> listado){
        lista = listado;
    }
    
    public void establecerPromedioMatriculas(){
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + 
                    lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas / lista.size();
    }
    
    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n", codigo);
        for(int i = 0; i < lista.size();i++){
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Matriculas: %.2f\n", cadena,
                obtenerPromedioMatriculas());
        return cadena;
    }
}
