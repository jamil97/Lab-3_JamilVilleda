/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_programacion2_jamilvilleda;

import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class Freelance extends Personas {

    private String nombre;
    private String contra, genero;
    private int edad;
    private ArrayList<Empresas> emp = new ArrayList();
    private double dinero;
    private String ciudad;
    private int telefono;

    public Freelance() {
    }

    public Freelance(String nombre, String contra, String genero, int edad, double dinero, String ciudad, int telefono, int id, String correo) {
        super(id, correo);
        this.nombre = nombre;
        this.contra = contra;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresas> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<Empresas> emp) {
        this.emp = emp;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", contra=" + contra + ", genero=" + genero + ", edad=" + edad + ", emp=" + emp + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + '}';
    }

}
