import java.util.Scanner;

public class Condicional7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce peso del paquete en  kilogramos: ");
        int peso = s.nextInt();
        System.out.println(" Introduce zona de destino: America del Norte(N), America central(C), America del Sur(S), Europa (E) o Asia(A):");
        char zona = s.next().charAt(0);


        if (zona == 'N' && peso <= 5) {
            System.out.println("El costo es de " + peso * 24 + " euros");
        }
        if (zona == 'C' && peso <= 5) {
            System.out.println("El costo es de " + peso * 20 + " euros");
        }
        if (zona == 'S' && peso <= 5) {
            System.out.println("El costo es de " + peso * 21 + " euros");
        }
        if (zona == 'E' && peso <= 5) {
            System.out.println("El costo es de " + peso * 10 + " euros");
        }
        if (zona == 'A' && peso <= 5) {
            System.out.println("El costo es de " + peso * 18 + " euros");
        }
        if (peso >= 5) {
            System.out.println("Entrega rechazada por exceso de peso (máximo 5 kilos)");
        }
        if (zona != 'N' || zona != 'C' || zona != 'S' || zona != 'E' || zona != 'A' ) {
            System.out.println("Error al indicar zona");
        }
    }
}
