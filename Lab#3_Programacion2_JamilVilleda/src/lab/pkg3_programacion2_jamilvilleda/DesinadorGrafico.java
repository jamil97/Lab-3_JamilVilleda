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
public class DesinadorGrafico extends Freelance {

    private ArrayList<ProyectoPublicitario> pp = new ArrayList();
    private String universidad;
    private String hobbies;

    public DesinadorGrafico() {
    }

    public DesinadorGrafico(String universidad, String hobbies) {
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<ProyectoPublicitario> getPp() {
        return pp;
    }

    public void setPp(ArrayList<ProyectoPublicitario> pp) {
        this.pp = pp;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "DesinadorGrafico{" + "pp=" + pp + ", universidad=" + universidad + ", hobbies=" + hobbies + '}';
    }

}
