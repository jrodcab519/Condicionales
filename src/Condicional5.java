import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce número de alumnos");
        int alumno = s.nextInt();

        if (alumno > 100) {
            System.out.println("El costo es de 65 euros");
        }
        if (alumno >= 50 && alumno <= 99) {
            System.out.println("El costo es de 70 euros");
        }
        if (alumno >= 30 && alumno <= 49) {
            System.out.println("El costo es de 95 euros");
        }
        if (alumno >= 1 && alumno <= 29) {
            System.out.println("El costo es de " + 4000 / alumno + " euros");
        }
    }
}
