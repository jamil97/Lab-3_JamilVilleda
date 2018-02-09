/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_programacion2_jamilvilleda;




public class Proyecto {
    private String Nombre;
    private String Empresa;
    private String Precio; 
    private String Estado;
    private String Descripcion;
    private String Fecah_de_Inicio;
    private String Fecha_de_Entrega;

    public Proyecto() {
    }

    public Proyecto(String Nombre, String Empresa, String Precio, String Estado, String Descripcion, String Fecah_de_Inicio, String Fecha_de_Entrega) {
        this.Nombre = Nombre;
        this.Empresa = Empresa;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        this.Fecah_de_Inicio = Fecah_de_Inicio;
        this.Fecha_de_Entrega = Fecha_de_Entrega;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecah_de_Inicio() {
        return Fecah_de_Inicio;
    }

    public void setFecah_de_Inicio(String Fecah_de_Inicio) {
        this.Fecah_de_Inicio = Fecah_de_Inicio;
    }

    public String getFecha_de_Entrega() {
        return Fecha_de_Entrega;
    }

    public void setFecha_de_Entrega(String Fecha_de_Entrega) {
        this.Fecha_de_Entrega = Fecha_de_Entrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "Nombre=" + Nombre + ", Empresa=" + Empresa + ", Precio=" + Precio + ", Estado=" + Estado + ", Descripcion=" + Descripcion + ", Fecah_de_Inicio=" + Fecah_de_Inicio + ", Fecha_de_Entrega=" + Fecha_de_Entrega + '}';
    }
    
    
}
