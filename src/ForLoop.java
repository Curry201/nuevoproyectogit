public class ForLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
            turnOnOFLight();

        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
    }

        public static void printSOS(){
            System.out.println("... __ __ __ ...");
        }

        public static boolean turnOnOFLight(){
            //Otra forma de utilizar el if, con operadores ternearios:
            isTurnOnLight = (isTurnOnLight)?false:true;
            //Es lo mismo que el if escrito abajo, pero con menos líneas de código
            return isTurnOnLight;
        }
    }


