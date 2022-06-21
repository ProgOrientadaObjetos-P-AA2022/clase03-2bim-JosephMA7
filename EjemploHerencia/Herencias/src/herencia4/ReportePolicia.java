/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Estudiante;
import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String codigo){
        super(codigo);
    }
    
    public void establecerLista(ArrayList<Policia> listado){
        lista = listado;
    }
    
    public void establecerPromedioEdades(){
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + 
                    lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }
    
    public ArrayList<Policia> obtenerLista(){
        return lista;
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n", codigo);
        for(int i = 0; i < lista.size();i++){
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Matriculas: %.2f\n", cadena,
                obtenerPromedioEdades());
        return cadena;
    }
}

