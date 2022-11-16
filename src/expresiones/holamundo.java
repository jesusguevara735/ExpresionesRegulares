package expresiones;

import java.util.Scanner;

public class holamundo {
    public static void main (String[] args){

        //programa que recibe palabra
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte una palabra");
        String palabra = leer.nextLine();
        System.out.println("La palabra es : " + palabra);
        if(validarpalabra(palabra)){
            System.out.println("Palabra valida");
        }else{
            System.out.println("Palabra invalida");
        }

    }
    public static boolean validarpalabra(String texto){
        return texto.matches("^[A-Z][a-z]{3}\\s[a-z]{5}$");

    }
}
