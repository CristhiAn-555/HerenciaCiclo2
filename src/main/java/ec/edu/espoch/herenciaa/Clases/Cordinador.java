/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herenciaa.Clases;

/**
 *
 * @author PERSONAL
 */
public class Cordinador {
    private String id;
    private String titulo;
    private String cargos;

    public Cordinador(String id, String titulo, String cargos) {
        this.id = id;
        this.titulo = titulo;
        this.cargos = cargos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toString() {
        return "Cordinador{" + "id=" + id + ", titulo=" + titulo + ", cargos=" + cargos + '}';
    }
   
    
}
