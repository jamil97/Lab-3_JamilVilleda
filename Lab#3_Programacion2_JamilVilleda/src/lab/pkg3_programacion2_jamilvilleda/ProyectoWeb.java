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
public class ProyectoWeb extends Proyecto{
    ArrayList<DesarolloWeb> Desarrollador_Web;

    public ProyectoWeb() {
    }

    public ProyectoWeb(String Nombre, String Empresa, String Precio, String Estado, String Descripcion, String Fecah_de_Inicio, String Fecha_de_Entrega) {
        super(Nombre, Empresa, Precio, Estado, Descripcion, Fecah_de_Inicio, Fecha_de_Entrega);
    }

    public ProyectoWeb(ArrayList<DesarolloWeb> Desarrollador_Web) {
        this.Desarrollador_Web = Desarrollador_Web;
    }

    public ArrayList<DesarolloWeb> getDesarrollador_Web() {
        return Desarrollador_Web;
    }

    public void setDesarrollador_Web(ArrayList<DesarolloWeb> Desarrollador_Web) {
        this.Desarrollador_Web = Desarrollador_Web;
    }

    @Override
    public String toString() {
        return "ProyectoWeb{" + "Desarrollador_Web=" + Desarrollador_Web + '}';
    }
    
    
}
