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

public class Administrador extends Personas {

    private String username;
    private String contra;
    private int id;

    public Administrador() {
    }

    public Administrador(String username, String contra) {
        this.username = username;
        this.contra = contra;
    }

    public Administrador(int id, String correo) {
        super(id, correo);
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Administrador{" + "username=" + username + ", contra=" + contra + '}';
    }
    
    
}
