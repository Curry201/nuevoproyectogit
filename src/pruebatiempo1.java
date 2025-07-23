public class pruebatiempo1 {
    public static void main(String args[])
    {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print("La hora universal incial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar incial es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        tiempo.establecerTiempo(13, 27, 6);
        System.out.print("La hora universal despues de establecerTiempo es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar despues de establecerTiempo es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        tiempo.establecerTiempo(99, 99, 99);
        System.out.print("Despues de realizar ajustes invalidos");
        System.out.print("Hora Universal: ");
        System.out.print(tiempo.aStringUniversal());
        System.out.println("Hora estandar: ");
        System.out.println(tiempo.toString());
    }
}
