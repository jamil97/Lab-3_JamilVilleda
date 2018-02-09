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
public class DesarolloWeb {
    private String lenguajeprogramacion;
    private String universidad;
    private String idioma;
    private ArrayList <ProyectoWeb> pw = new ArrayList();

    public DesarolloWeb() {
    }

    public DesarolloWeb(String lenguajeprogramacion, String universidad, String idioma) {
        this.lenguajeprogramacion = lenguajeprogramacion;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public String getLenguajeprogramacion() {
        return lenguajeprogramacion;
    }

    public void setLenguajeprogramacion(String lenguajeprogramacion) {
        this.lenguajeprogramacion = lenguajeprogramacion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<ProyectoWeb> getPw() {
        return pw;
    }

    public void setPw(ArrayList<ProyectoWeb> pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "DesarolloWeb{" + "lenguajeprogramacion=" + lenguajeprogramacion + ", universidad=" + universidad + ", idioma=" + idioma + ", pw=" + pw + '}';
    }
    
    
}
