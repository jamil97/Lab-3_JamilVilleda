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
public class MediosAudiovisuales {
    private ArrayList <ProyectoPublicitario> pp = new ArrayList();
    private String marca;
    private String modelovideo;

    public MediosAudiovisuales() {
    }

    public MediosAudiovisuales(String marca, String modelovideo) {
        this.marca = marca;
        this.modelovideo = modelovideo;
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

    public String getModelovideo() {
        return modelovideo;
    }

    public void setModelovideo(String modelovideo) {
        this.modelovideo = modelovideo;
    }

    @Override
    public String toString() {
        return "MediosAudiovisuales{" + "pp=" + pp + ", marca=" + marca + ", modelovideo=" + modelovideo + '}';
    }
    
}
