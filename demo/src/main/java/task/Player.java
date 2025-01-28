package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;

    public void attack(ArrayList<Monster> monsterList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valitse hirviö, johon hyökätä:");
        for (Monster monster : monsterList) {
            System.out.println(monsterList.indexOf(monster) + ": " + monster.type + " / " + monster.health + "HP");
        }
        String inputValue = scanner.nextLine();
        

        scanner.close();
    }
}
