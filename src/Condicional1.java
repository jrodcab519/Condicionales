import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int numero = s.nextInt();

        if (numero%2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");


    }
}
