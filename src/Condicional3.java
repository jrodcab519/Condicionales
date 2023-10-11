import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce dos números: ");

        int numero1 = s.nextInt();
        int numero2 = s.nextInt();

        if (numero2 != 0)
            System.out.println(numero1/numero2);
        else
            System.out.println("Error");

    }
}
