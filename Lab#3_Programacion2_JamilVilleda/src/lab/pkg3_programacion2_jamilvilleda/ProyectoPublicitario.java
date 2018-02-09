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
public class ProyectoPublicitario extends Proyecto{
    ArrayList<DesinadorGrafico> Diseñador_Grafico = new ArrayList();
    ArrayList<Fotografo> Fotografo = new ArrayList();
    ArrayList<MediosAudiovisuales> Medios_Audiovisuales = new ArrayList();

    public ProyectoPublicitario() {
    }

    public ProyectoPublicitario(String Nombre, String Empresa, String Precio, String Estado, String Descripcion, String Fecah_de_Inicio, String Fecha_de_Entrega) {
        super(Nombre, Empresa, Precio, Estado, Descripcion, Fecah_de_Inicio, Fecha_de_Entrega);
    }

    

    public ArrayList<DesinadorGrafico> getDiseñador_Grafico() {
        return Diseñador_Grafico;
    }

    public void setDiseñador_Grafico(ArrayList<DesinadorGrafico> Diseñador_Grafico) {
        this.Diseñador_Grafico = Diseñador_Grafico;
    }

    public ArrayList<Fotografo> getFotografo() {
        return Fotografo;
    }

    public void setFotografo(ArrayList<Fotografo> Fotografo) {
        this.Fotografo = Fotografo;
    }

    public ArrayList<MediosAudiovisuales> getMedios_Audiovisuales() {
        return Medios_Audiovisuales;
    }

    public void setMedios_Audiovisuales(ArrayList<MediosAudiovisuales> Medios_Audiovisuales) {
        this.Medios_Audiovisuales = Medios_Audiovisuales;
    }

    @Override
    public String toString() {
        return "ProyectoPublicitario{" + "Dise\u00f1ador_Grafico=" + Diseñador_Grafico + ", Fotografo=" + Fotografo + ", Medios_Audiovisuales=" + Medios_Audiovisuales + '}';
    }
    
    
}
