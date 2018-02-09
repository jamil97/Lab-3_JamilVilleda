/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_programacion2_jamilvilleda;

/**
 *
 * @author Jamil
 */
public class Empresas  {
    private String nombre;
    private int telefono;
    private String listaproyectos;
    private String correoelectronico;
    private String contra;
    private String descripcion;

    public Empresas() {
    }

    public Empresas(String nombre, int telefono, String listaproyectos, String correoelectronico, String contra, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaproyectos = listaproyectos;
        this.correoelectronico = correoelectronico;
        this.contra = contra;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getListaproyectos() {
        return listaproyectos;
    }

    public void setListaproyectos(String listaproyectos) {
        this.listaproyectos = listaproyectos;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", telefono=" + telefono + ", listaproyectos=" + listaproyectos + ", correoelectronico=" + correoelectronico + ", contra=" + contra + ", descripcion=" + descripcion + '}';
    }
    
    
}
