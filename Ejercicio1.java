import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero, par;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        par = numero %2;

        if (par == 0){
            for (int i = 10; i <= numero; i = i + 5 ){
                if (i + 5 > numero){
                    System.out.print(i);
                }else {
                    System.out.print(i + ", ");
                }

            }
        } else {
            for (int i = 10; i <= numero; i = i + 3 ) {
                if (i + 3 > numero) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }


    }
}
