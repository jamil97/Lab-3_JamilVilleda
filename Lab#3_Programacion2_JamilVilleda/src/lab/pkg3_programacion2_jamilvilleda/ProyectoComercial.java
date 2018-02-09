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
public class ProyectoComercial extends Proyecto{
    ArrayList<Contador> Contador = new ArrayList();
    ArrayList<Marketing> Marketing = new ArrayList();

    public ProyectoComercial() {
    }

    public ProyectoComercial(String Nombre, String Empresa, String Precio, String Estado, String Descripcion, String Fecah_de_Inicio, String Fecha_de_Entrega) {
        super(Nombre, Empresa, Precio, Estado, Descripcion, Fecah_de_Inicio, Fecha_de_Entrega);
    }

    public ArrayList<Contador> getContador() {
        return Contador;
    }

    public void setContador(ArrayList<Contador> Contador) {
        this.Contador = Contador;
    }

    public ArrayList<Marketing> getMarketing() {
        return Marketing;
    }

    public void setMarketing(ArrayList<Marketing> Marketing) {
        this.Marketing = Marketing;
    }

    @Override
    public String toString() {
        return "ProyectoComercial{" + "Contador=" + Contador + ", Marketing=" + Marketing + '}';
    }
    
    
}
