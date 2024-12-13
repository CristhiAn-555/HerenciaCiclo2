/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.herenciaa;

import ec.edu.espoch.herenciaa.Clases.Cordinador;
import ec.edu.espoch.herenciaa.Clases.Estudiantes;
import ec.edu.espoch.herenciaa.Clases.Profesor;


/**
 *
 * @author PERSONAL
 */
public class Herenciaa {

    public static void main(String[] args) {
        
        Estudiantes objEstudiantes= new Estudiantes("3016","Cristhian","Valencia","2200370365","Masculino","20");
        System.out.println(objEstudiantes.toString());
        
        
        Profesor  objProfesor= new Profesor("2515","Sistema de software");
        System.out.println(objProfesor.toString());
        
        Cordinador objCordinador= new Cordinador("2515","ING","Sistema software");
        System.out.println(objCordinador.toString());
                
    }   
    
    
}
