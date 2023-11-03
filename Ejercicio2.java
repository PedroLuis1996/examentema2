import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int nota = 0, total = 0, suspenso = 0, aprovado = 0;
        float media = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            nota = scanner.nextInt();
            if (nota >= 0){
                media = media + nota;
                total++;
                if (nota < 5){
                    suspenso++;
                }else {
                    aprovado++;
                }

            }
        } while ( nota != -1);

        if (total == 0 ){
            System.out.println("No se han introducido notas");
        } else {
            media = media / total;
            System.out.printf("la media es %f%n ", media);

            System.out.println("Aprovados " + aprovado + ": - Suspensos:" + suspenso );
        }

    }
}
