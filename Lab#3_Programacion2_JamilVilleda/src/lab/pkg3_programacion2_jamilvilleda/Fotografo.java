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
public class Fotografo extends Freelance{
    private ArrayList <ProyectoPublicitario> pp = new ArrayList();
    private String marca;
    private String modelocamara;

    public Fotografo() {
    }

    public Fotografo(String marca, String modelocamara) {
        this.marca = marca;
        this.modelocamara = modelocamara;
    }
    
    

    public ArrayList<ProyectoPublicitario> getPp() {
        return pp;
    }

    public void setPp(ArrayList<ProyectoPublicitario> pp) {
        this.pp = pp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelocamara() {
        return modelocamara;
    }

    public void setModelocamara(String modelocamara) {
        this.modelocamara = modelocamara;
    }

    @Override
    public String toString() {
        return "Fotografo{" + "pp=" + pp + ", marca=" + marca + ", modelocamara=" + modelocamara + '}';
    }
    
}

