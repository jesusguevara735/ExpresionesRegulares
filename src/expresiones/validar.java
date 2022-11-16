package expresiones;
import java.util.Scanner;

public class validar {
    public static void main (String[] args){
        System.out.println("nombre del archivo");
        System.out.println((new Scanner(System.in).next().matches("[ISI][0-9-]{4}[-](1||2)(.txt||.csv)"))?"nombre valido":"nombre invalido");

    }
}
