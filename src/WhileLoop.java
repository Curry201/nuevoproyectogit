public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args){
        turnOnOFLight();

        int i = 1;
        while(isTurnOnLight && i<=10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println("... __ __ __ ...");
    }

    public static boolean turnOnOFLight(){
        //Otra forma de utilizar el if, con operadores ternearios:
        //isTurnOnLight = (isTurnOnLight)?false:true;
        //Es lo mismo que el if escrito abajo, pero con menos líneas de código

        if(isTurnOnLight){
            isTurnOnLight = false;
        }else{
            isTurnOnLight = true;
        }
        return isTurnOnLight;
    }
}
