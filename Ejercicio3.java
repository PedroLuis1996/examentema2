import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

       int numero, par;
       Scanner scanner =new Scanner(System.in);
       numero = scanner.nextInt();

       par = numero %2;

       if (par != 0){
           if (numero == 1){
               System.out.println("x");
           }else {
                   arribaabajo(numero);
                   medio(numero);
                   arribaabajo(numero);
           }

       }else {
           System.out.println("Numero no valido");
       }
    }

    public static void medio(int x){
        for (int i = 0; i < x; i++){
            System.out.print("x");
        }
        System.out.println();
    }

    public static void arribaabajo(int x){
        int espacio = 0, numero;

        for (int num = 1;  num < x; num = num + 2 ){
            espacio++;
        }
        numero = espacio;
        for(int j = 0; j < numero ; j++){
            for (int i = 0; i < espacio; i++ ){
                System.out.print(" ");

            }
            System.out.println("x");
        }


    }

}
