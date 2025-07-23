public class MathOperations {
    public static void main(String[] args){
        //develve un entero hacia arriba
        double x = 2.9;
        double y = 3;
        // devuelve el número elevado a l potencia
        System.out.println(Math.pow(x,y));
        System.out.println(Math.ceil(y));
        // raiz cuadrada
        System.out.println(Math.sqrt(y));
        //área de un círculo
        //PI*r^2
        System.out.println(Math.PI*(Math.pow(y,2)));
        //Volúmen de una esfera
        //(4/3)(PI)(r^3)
        System.out.println((4/3)*Math.PI*Math.pow(y,3));

        double z = 4/3D;
        System.out.println(z);

        System.out.println((z)*Math.PI*Math.pow(y,3));
    }
}
