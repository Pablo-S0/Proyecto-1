/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {

    public static void main(String[] args) {

        String nombre;
        String medicina;

        ListaPacientes paciente = new ListaPacientes();
        ListaMedicamentos medicinas = new ListaMedicamentos();


        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("\nSistema de la Clinica "
                    + "\n\t1.Agregar Paciente "
                    + "\n\t2.Agregar Medicamentos "
                    + "\n\t3.Asignar Medicamentos"
                    + "\n\t4.Consultar Pacientes "
                    + "\n\t5.Consultar Medicamentos "
                    + "\n\t6.Borrar Medicamentos "
                    + "\n\t7.Reportes de pacientes sin Medicamentos "
                    + "\n\t8.Salir");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n*********Agregando Paciente*********");
                    System.out.println("Ingrese el nombre del paciente que desea agregar");
                    nombre = teclado.next();
                    Paciente persona = new Paciente(nombre);
                    paciente.InsertarPaciente(persona);

                    break;

                case 2:
                    System.out.println("\n*********Agregando Medicamento*********");
                    System.out.println("Ingrese el nombre del medicamento que desea agregar");
                    nombre = teclado.next();
                    Medicamento medicamento = new Medicamento(nombre);
                    medicinas.InsertarMedicamento(medicamento);

                    break;

                case 3:
                    System.out.println("\n*********Asignando Medicamento*********");
                    System.out.println("Ingrese el nombre del medicamento que desea asignar");
                    medicina = teclado.next();
                    System.out.println("Ingrese el nombre del paciente que desea asignarle el medicamento");
                    nombre = teclado.next();
                    paciente.AsignarMedicamento(medicinas.Buscar(medicina), nombre);

                    break;

                case 4:
                    System.out.println("\n*********Lista de pacientes con sus medicamentos*********");
                    paciente.Verlista();
                    break;

                case 5:
                    System.out.println("\n*********Lista Medicamentos*********");
                    medicinas.Verlista();
                    break;

                case 6:
                    System.out.println("\n*********Eliminar Medicamento*********");
                    System.out.println("Ingrese el nombre del medicamento que desea eliminar");
                    medicinas.Eliminar(medicina = teclado.next());
                    break;

                case 7:
                    System.out.println("\n*********Pacientes sin Medicamentos*********");
                    paciente.ListaVacia();
                    break;
            }
        } while (opcion != 8);

    }
}
