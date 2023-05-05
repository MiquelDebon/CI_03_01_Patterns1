package S3_01_N1;

import java.util.Scanner;

public class Main { //Singleton
    /*Crea una classe que repliqui el funcionament del comando 'S3_01_N1.Undo'. Aquesta classe serà utilitzada per la classe S3_01_N1.Main,
        que permetrà introduir opcions per consola.

            La classe 'S3_01_N1.Undo' ha de guardar les últimes comandes introduïdes. Ha de permetre afegir o eliminar comandes,
             així com llistar les últimes comandes introduïdes (semblant a la comanda 'history' en Linux).
            La classe 'S3_01_N1.Undo' ha d'implementar imprescindiblement un patró Singleton. */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Undo commandos = Undo.getInstance();

        /*
        Undo commandos2 = Undo.getInstance();
        System.out.println(commandos.hashCode());
        System.out.println(commandos2.hashCode());*/

        String message = "";
        boolean exit = false;

        while(!exit){
            System.out.print("Write here: ");
            message = scanner.nextLine();
            if(!message.equalsIgnoreCase("exit")){
                commandos.addCommands(message);
            }else{
                exit = true;
            }
        }

        commandos.getListCommands();

        commandos.deleteCommandByIndex(1);

        commandos.deleteLastCommad();

        commandos.getListCommands();


    }
}
