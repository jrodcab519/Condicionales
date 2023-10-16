import java.util.Scanner;

public class Condicional6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce número de minutos");
        int minutos = s.nextInt();
        System.out.println(" Introduce día: Lunes(L), Martes (M), Miércoles(X), Jueves(J), Viernes(V), Sábado(S) ó Domingo(D):");
        char dia = s.next().charAt(0);
        System.out.println(" Introduce turno: Turno de mañana(M) o Tarde(T)");
        char turno = s.next().charAt(0);

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
