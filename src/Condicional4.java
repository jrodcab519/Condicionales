import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" Introduce un número");
        int numero = s.nextInt();
        System.out.println(" Introduce el exponente");
        int exponente = s.nextInt();

        if (exponente > 0 ){
            System.out.println(Math.pow(numero, exponente));
        }
        if (exponente == 0){
            System.out.println(" El resultado es 1");
        }
        if (exponente < 0){
            System.out.println(1/Math.pow(numero, -exponente));
        }
    }
}
