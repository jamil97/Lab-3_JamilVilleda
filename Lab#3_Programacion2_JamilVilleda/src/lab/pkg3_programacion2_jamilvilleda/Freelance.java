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
    private ArrayList <Empresas> emp = new ArrayList();
    private double dinero;
    private String ciudad;
    private int telefono;
    private DesarolloWeb desarollador;
    private DesinadorGrafico DG;
    private Fotografo f;
    private MediosAudiovisuales ma;
    private Marketing m;
    private Contador c;

    public Freelance() {
    }

    public Freelance(String nombre, String contra, String genero, int edad, double dinero, String ciudad, int telefono, DesarolloWeb desarollador, DesinadorGrafico DG, Fotografo f, MediosAudiovisuales ma, Marketing m, Contador c) {
        this.nombre = nombre;
        this.contra = contra;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.desarollador = desarollador;
        this.DG = DG;
        this.f = f;
        this.ma = ma;
        this.m = m;
        this.c = c;
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

    public DesarolloWeb getDesarollador() {
        return desarollador;
    }

    public void setDesarollador(DesarolloWeb desarollador) {
        this.desarollador = desarollador;
    }

    public DesinadorGrafico getDG() {
        return DG;
    }

    public void setDG(DesinadorGrafico DG) {
        this.DG = DG;
    }

    public Fotografo getF() {
        return f;
    }

    public void setF(Fotografo f) {
        this.f = f;
    }

    public MediosAudiovisuales getMa() {
        return ma;
    }

    public void setMa(MediosAudiovisuales ma) {
        this.ma = ma;
    }

    public Marketing getM() {
        return m;
    }

    public void setM(Marketing m) {
        this.m = m;
    }

    public Contador getC() {
        return c;
    }

    public void setC(Contador c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", contra=" + contra + ", genero=" + genero + ", edad=" + edad + ", emp=" + emp + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + ", desarollador=" + desarollador + ", DG=" + DG + ", f=" + f + ", ma=" + ma + ", m=" + m + ", c=" + c + '}';
    }
    
    
}
