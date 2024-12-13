/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herenciaa.Clases;

/**
 *
 * @author PERSONAL
 */
public class Estudiantes extends Persona{
    
    private String codigo;

    public Estudiantes(String codigo, String nombre, String apellido, String cedula, String genero, String edad) {
        super(nombre, apellido, cedula, genero, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiantes{" + "codigo=" + codigo + '}';
    }
    
    
    
    
    
}
