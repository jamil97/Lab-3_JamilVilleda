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
        ConnectiveLine CL = new ConnectiveLine();
        String opcion = "", opcion2 = "";
        while (!opcion.equals("4")) {
            opcion = JOptionPane.showInputDialog("Bienvenido a Connective Line! Elija la opcion que mas guste: \n"
                    + "1- Registrar. \n"
                    + "2- LogIn. \n"
                    + "3- Eliminar un empleado activo. \n"
                    + "4- Salir del sistema.");

            if (opcion.equals("1")) {
                opcion2 = JOptionPane.showInputDialog("Bienvenido, elija al usuario que desea registrar: \n"
                        + "a-) Administador"
                        + "b-) Freelance"
                        + "Empresa" );
            }
            if (opcion.equals("2")) {

            }
            if (opcion.equals("3")) {

            }
            if (opcion.equals("4")) {
                System.exit(0);
            }
        }

    }

}
