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
public class Ingresos {
    private ArrayList<Empresas> Empresa = new ArrayList();
    private ArrayList<Freelance> Freelance = new ArrayList();
    private int Dinero;
    private int Ingresos;

    public Ingresos() {
    }

    public ArrayList<Empresas> getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(ArrayList<Empresas> Empresa) {
        this.Empresa = Empresa;
    }

    public ArrayList<Freelance> getFreelance() {
        return Freelance;
    }

    public void setFreelance(ArrayList<Freelance> Freelance) {
        this.Freelance = Freelance;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public int getIngresos() {
        return Ingresos;
    }

    public void setIngresos(int Ingresos) {
        this.Ingresos = Ingresos;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "Empresa=" + Empresa + ", Freelance=" + Freelance + ", Dinero=" + Dinero + ", Ingresos=" + Ingresos + '}';
    }
    
    
}
