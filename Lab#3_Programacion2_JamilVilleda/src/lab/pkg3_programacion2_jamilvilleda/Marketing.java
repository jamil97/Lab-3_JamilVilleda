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
public class Marketing extends Freelance{
    private ArrayList <ProyectoComercial> pc = new ArrayList();
    private String redsocial;

    public Marketing() {
    }

    public Marketing(String redsocial, String nombre, String contra, String genero, int edad, double dinero, String ciudad, int telefono, int id, String correo) {
        super(nombre, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.redsocial = redsocial;
    }

    

    public ArrayList<ProyectoComercial> getPc() {
        return pc;
    }

    public void setPc(ArrayList<ProyectoComercial> pc) {
        this.pc = pc;
    }

    public String getRedsocial() {
        return redsocial;
    }

    public void setRedsocial(String redsocial) {
        this.redsocial = redsocial;
    }

    @Override
    public String toString() {
        return "Marketing{" + "pc=" + pc + ", redsocial=" + redsocial + '}';
    }
    
    
}
