
//Crea un objeto LibroCalificaciones y lama a su método mostrarMesaje
import java.util.Scanner;

public class PruebaLibroCalificaciones
{

    public static void main(String args[])
    {

        Scanner entrada = new Scanner(System.in);


        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();


        System.out.printf("El nombre inicial del curso es: %s \n\n", miLibroCalificaciones.obtenerNombreDelCurso());



        System.out.println("Escriba el nombre del curso:");
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(elNombre);
        System.out.println();



        miLibroCalificaciones.mostrarMensaje();
    }

}
