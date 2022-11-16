package expresiones;
import java.util.Scanner;

public class correo {
    public static void main (String[] args){
        System.out.println("Ingrese correo");
        System.out.println((new Scanner(System.in).next().matches("[a][0-9]{9}[@](unison.mx||uson.mx)"))?"correo valido":"correo invalido");



    }
}
