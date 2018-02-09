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
public class ConnectiveLine {

    private ArrayList<Empresas> Empresas;
    private ArrayList<Personas> Personas;
    private ArrayList<Ingresos> Ingresos;

    public ConnectiveLine() {
    }

    public ConnectiveLine(ArrayList<Empresas> Empresas, ArrayList<Personas> Personas, ArrayList<Ingresos> Ingresos) {
        this.Empresas = Empresas;
        this.Personas = Personas;
        this.Ingresos = Ingresos;
    }

    public ArrayList<Empresas> getEmpresas() {
        return Empresas;
    }

    public void setEmpresas(ArrayList<Empresas> Empresas) {
        this.Empresas = Empresas;
    }

    public ArrayList<Personas> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Personas> Personas) {
        this.Personas = Personas;
    }

    public ArrayList<Ingresos> getIngresos() {
        return Ingresos;
    }

    public void setIngresos(ArrayList<Ingresos> Ingresos) {
        this.Ingresos = Ingresos;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "Empresas=" + Empresas + ", Personas=" + Personas + ", Ingresos=" + Ingresos + '}';
    }
    
    
}
