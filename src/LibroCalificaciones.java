//Figur 3.1
//Declaración de una clase con un método


public class LibroCalificaciones
{
    private String nombreDelCurso; //Esto es lo que se llama variable de instancia


    public void establecerNombreDelCurso(String nombre)
    {
        nombreDelCurso = nombre;
    }


    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }


    public void mostrarMensaje()
    {

        System.out.printf("Bienvenido al Libro de Calificaciones para \n%s \n", obtenerNombreDelCurso());
    }

}
