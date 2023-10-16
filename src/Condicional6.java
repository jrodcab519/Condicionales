import java.util.Scanner;

public class Condicional6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce número de minutos");
        int minutos = s.nextInt();

        if (minutos <=5) {
            System.out.println("El costo es de " + minutos + " euros");
        }
        if (minutos >5 && minutos<=8) {
            System.out.println("El costo es de " + (5 + 0.80*(minutos-5)) + " euros");
        }
        if (minutos >8 && minutos<= 10) {
            System.out.println("El costo es de " + (7.4 + 0.70*(minutos-8)) + " euros");
        }
        if (minutos > 10) {
            System.out.println("El costo es de " + (8.8 + 0.50*(minutos-10))+ " euros");
        }
    }
}
