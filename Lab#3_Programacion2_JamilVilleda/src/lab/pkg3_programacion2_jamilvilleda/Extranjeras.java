/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_programacion2_jamilvilleda;

/**
 *
 * @author Jamil
 */
public class Extranjeras extends Empresas{
    private String pais;
    private String paginaweb;
    private String ciudad;

    public Extranjeras() {
    }

    public Extranjeras(String pais, String paginaweb, String ciudad) {
        this.pais = pais;
        this.paginaweb = paginaweb;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Extranjeras{" + "pais=" + pais + ", paginaweb=" + paginaweb + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
