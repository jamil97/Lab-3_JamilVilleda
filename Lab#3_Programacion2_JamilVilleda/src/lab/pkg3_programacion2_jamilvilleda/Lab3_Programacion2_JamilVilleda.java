/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_programacion2_jamilvilleda;

import javax.swing.JOptionPane;

/**
 *
 * @author Jamil
 */
public class Lab3_Programacion2_JamilVilleda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario, contra, correo;
        int id;

        ConnectiveLine CL = new ConnectiveLine();
        String opcion = "", opcion2 = "", opcion3 = "";
        while (!opcion.equals("4")) {
            opcion = JOptionPane.showInputDialog("Bienvenido a Connective Line! Elija la opcion que mas guste: \n"
                    + "1- Registrar. \n"
                    + "2- LogIn. \n"
                    + "3- Salir. \n");
            
            if (opcion.equals("1")) {
                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de identidad: "));
                correo = JOptionPane.showInputDialog("Ingrese un correo: ");
                CL.getPersonas().add(new Personas(id, correo));
                opcion2 = JOptionPane.showInputDialog("Bienvenido, elija al usuario que desea registrar: \n"
                        + "a-) Administador \n"
                        + "b-) Freelance \n"
                        + "c-) Empresa \n");
                
                if (opcion2.equals("a")) {
                    usuario = JOptionPane.showInputDialog("Ingrese su nuevo nombre de usuario: ");
                    contra = JOptionPane.showInputDialog("Ingrese su nuevo nombre de usuario: ");
                    CL.getPersonas().add(new Administrador(usuario, contra));
                    

                }
                if (opcion2.equals("b")) {
                    opcion3 = JOptionPane.showInputDialog("Elija el tipo de Freelancer que desea agregar: \n"
                            + "a-) Desarollador Web \n"
                            + "b-) Fotografo \n"
                            + "c-) Disenador Grafico \n"
                            + "d-) Medios Audiovisuales \n"
                            + "e-) Marketing \n"
                            + "f-) Contador \n");
                }

                if (opcion2.equals("c")) {
                    opcion3 = JOptionPane.showInputDialog("Ingrese el tipo de empresa a ingresar: \n"
                            + "a-) Nacional \n"
                            + "b-) Extranjera \n");

                }
            }
            if (opcion.equals("2")) {
                opcion2 = JOptionPane.showInputDialog("Ingrese el usuario que desea hacer LogIn: \n"
                        + "a-) Administrador \n"
                        + "b-) Freelancer \n"
                        + "c-) Empresa \n");
                if (opcion2.equals("a")) {
                    usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: \n");
                    contra = JOptionPane.showInputDialog("Ingrese la contra: \n");
                    if (true) {
                        opcion3 = JOptionPane.showInputDialog("a-) Visualizar todos los ingresos de la empresa: \n"
                                + "b-) Modificar sus datos. \n"
                                + "c-) Eliminarse del sistema. \n");
                        if (opcion3.equals("a")) {

                        }
                        if (opcion3.equals("b")) {

                        }
                        if (opcion3.equals("c")) {

                        }
                    }
                }
                if (opcion2.equals("b")) {
                    opcion3 = JOptionPane.showInputDialog("Elija el tipo de Freelancer que desea hacer LogIn: \n"
                            + "a-) Desarollador Web \n"
                            + "b-) Fotografo \n"
                            + "c-) Disenador Grafico \n"
                            + "d-) Medios Audiovisuales \n"
                            + "e-) Marketing \n"
                            + "f-) Contador \n");
                    if (opcion3.equals("a")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                    if (opcion3.equals("b")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                    if (opcion3.equals("c")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                    if (opcion3.equals("d")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                    if (opcion3.equals("e")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                    if (opcion3.equals("f")) {
                        usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                        contra = JOptionPane.showInputDialog("Ingrese la contra: ");
                    }
                }
                if (opcion2.equals("c")) {
                    usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario: \n");
                    contra = JOptionPane.showInputDialog("Ingrese la contra: \n");
                    if (true) {
                        opcion3 = JOptionPane.showInputDialog("a-) Crear un dato de proyecto: \n"
                                + "b-) Modificar un dato de proyecto. \n"
                                + "c-) Eliminarse un dato de proyecto. \n"
                                + "d-) Modificar los datos actuales de la empresa. \n"
                                + "e-) Eliminar la empresa. \n");
                        if (opcion3.equals("a")) {

                        }
                        if (opcion3.equals("b")) {

                        }
                        if (opcion3.equals("c")) {

                        }
                        if (opcion3.equals("d")) {

                        }
                        if (opcion3.equals("e")) {

                        }
                    }
                }
            }
            if (opcion.equals("3")) {
                System.exit(0);
            }
        }

    }

}
