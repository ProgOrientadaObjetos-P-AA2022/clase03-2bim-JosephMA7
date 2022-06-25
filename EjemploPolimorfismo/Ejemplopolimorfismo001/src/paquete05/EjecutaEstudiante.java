package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.Estudiante;
import paquete04.EstudianteDistancia;
import paquete04.EstudiantePresencial;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        do {
            System.out.println("=======================================");
            System.out.println("|| Tipo de Estudiante a ingresar\n"
                    + "|| Ingrese  [1] para Estudiante Presencial\n"
                    + "|| Ingrese  [2] para Estudiante Distancia");
            System.out.println("=======================================");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese los Nombres del Estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los Epellidos del Estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del Estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del Estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                EstudiantePresencial estudiantePresencial = new EstudiantePresencial();

                System.out.println("Ingrese Número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese costo de cada crédito");
                costoCred = entrada.nextDouble();

                estudiantePresencial.establecerNombresEstudiante(nombresEst);
                estudiantePresencial.establecerApellidoEstudiante(apellidosEst);
                estudiantePresencial.establecerIdentificacionEstudiante(identificacionEst);
                estudiantePresencial.establecerEdadEstudiante(edadEst);
                estudiantePresencial.establecerNumeroCreditos(numeroCreds);
                estudiantePresencial.establecerCostoCredito(costoCred);

                estudiantes.add(estudiantePresencial);
            } else {

                EstudianteDistancia estudianteDistancia = new EstudianteDistancia();

               
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();

                estudianteDistancia.establecerNombresEstudiante(nombresEst);
                estudianteDistancia.establecerApellidoEstudiante(apellidosEst);
                estudianteDistancia.establecerIdentificacionEstudiante(identificacionEst);
                estudianteDistancia.establecerEdadEstudiante(edadEst);
                estudianteDistancia.establecerNumeroAsginaturas(numeroAsigs);
                estudianteDistancia.establecerCostoAsignatura(costoAsig);

                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudianteDistancia
                estudiantes.add(estudianteDistancia);

            }

            System.out.println("Quiere seguir ingresando mas estudiantes, digite la "
                    + "letra S para seguir o digite la letra N para salir "
                    + "del proceso");

            continuar = entrada.nextLine();

        } while (continuar.equals("S"));

        for (int i = 0; i < estudiantes.size(); i++) {

            estudiantes.get(i).calcularMatricula();

            System.out.printf("\nDatos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
