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
public class Contador extends Freelance{
    ArrayList <ProyectoComercial> pc = new ArrayList();
    private String universidad;
    private boolean pm; //Boolean perito mercantiles
    private String hobbies;

    public Contador() {
    }

    public Contador(String universidad, boolean pm, String hobbies, String nombre, String contra, String genero, int edad, double dinero, String ciudad, int telefono, int id, String correo) {
        super(nombre, contra, genero, edad, dinero, ciudad, telefono, id, correo);
        this.universidad = universidad;
        this.pm = pm;
        this.hobbies = hobbies;
    }

    

    public ArrayList<ProyectoComercial> getPc() {
        return pc;
    }

    public void setPc(ArrayList<ProyectoComercial> pc) {
        this.pc = pc;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean isPm() {
        return pm;
    }

    public void setPm(boolean pm) {
        this.pm = pm;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Contador{" + "pc=" + pc + ", universidad=" + universidad + ", pm=" + pm + ", hobbies=" + hobbies + '}';
    }
    
    
    
}
