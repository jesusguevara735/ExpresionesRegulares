package expresiones;

import java.util.Scanner;

public class cualquiera {
    public static void main (String[] args){

        //programa que recibe palabra
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte una palabra");
        String palabra = leer.nextLine();
        System.out.println("La palabra es : " + palabra);
        if(validarpalabra(palabra)){
            System.out.println("Palabra encontrada");
        }else{
            System.out.println("Palabra no encontrada");
        }

    }
    public static boolean validarpalabra(String texto){
        return texto.matches("(?i)(\\W|^)(Java||Python||Pascal||Perl)(\\W|$)");

    }
}