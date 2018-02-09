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
public class Personas {
    private int id;
    private String correo;
    private Administrador admin;
    private Freelance freelancer;

    public Personas() {
    }

    public Personas(int id, String correo, Administrador admin, Freelance freelancer) {
        this.id = id;
        this.correo = correo;
        this.admin = admin;
        this.freelancer = freelancer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Freelance getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelance freelancer) {
        this.freelancer = freelancer;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", correo=" + correo + ", admin=" + admin + ", freelancer=" + freelancer + '}';
    }
    
    
}
