import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

       int planta = 0, planta_actial = 0, recorrido = 0;

       Scanner scanner = new Scanner(System.in);

        planta_actial = scanner.nextInt();
       do {

           if (planta_actial != -1){
               planta = scanner.nextInt();
               if (planta != -1){
                   if (planta < planta_actial){
                       for (int i = planta_actial; planta_actial > planta; planta_actial--){
                           recorrido++;
                       }
                       planta_actial = planta;
                   } else if (planta > planta_actial) {
                       for (int i = planta_actial; planta_actial < planta; planta_actial++){
                           recorrido++;
                       }
                       planta_actial = planta;
                   }
               }

           }

       }while (planta != -1 && planta_actial != -1);

       if (recorrido != 0){
           System.out.println(recorrido);
       }




    }

}
