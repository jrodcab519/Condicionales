import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un año: ");

        int año = s.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");

    }


}
