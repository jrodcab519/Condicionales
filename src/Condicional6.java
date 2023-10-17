import java.util.Scanner;

public class Condicional6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce número de minutos: ");
        int minutos = s.nextInt();
        System.out.println(" Introduce día: Lunes(L), Martes (M), Miércoles(X), Jueves(J), Viernes(V), Sábado(S) ó Domingo(D):");
        char dia = s.next().charAt(0);

        System.out.println(" Introduce turno: Turno de mañana(M) o Tarde(T)");
        char turno = s.next().charAt(0);

        double costeMinutos = 0.0;
        if (minutos <= 5) {
            costeMinutos = 1.0;
        } else if (minutos <= 8) {
            costeMinutos = 1.0 + (minutos - 5) * 0.8;
        } else if (minutos <= 10) {
            costeMinutos = 1.0 + 3 * 0.8 + (minutos - 8) * 0.7;
        } else {
            costeMinutos = 1.0 + 3 * 0.8 + 2 * 0.7 + (minutos - 10) * 0.5;
        }

        if (dia == 'D') {
            costeMinutos += costeMinutos * 0.03;
        } else if (turno == 'M') {
            costeMinutos += costeMinutos * 0.15;
        } else if (turno == 'T') {
            costeMinutos += costeMinutos * 0.10;
        }

        System.out.println("El coste de la llamada es de :" + costeMinutos );

    }
}
