package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        Player player = new Player();
        System.out.println("Вас вітає Player з функцією Record.");

        do{
            System.out.print("Стан Player: ");
            player.getState();

            char stateKey;
            do{
                System.out.print("Виберіть дію ('l' - play, 'p' - pause, 'r' - rec, 's' - stop, 'g' - go to track): ");
                stateKey = scInput.nextLine().toLowerCase().charAt(0);
            }while(player.setState(stateKey));

            if(player.getStateKey() == 'g'){
                System.out.print("Введіть номер трека: ");
                player.goToTrack(scInput.nextInt());
            }

        }while (player.getStateKey() != 's');



    }
}
