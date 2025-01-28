package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Cave {
    private ArrayList<Monster> caveMonsters = new ArrayList<Monster>();
    Scanner scanner = new Scanner(System.in);

    public void addMonster(){
        Monster addedMonster = new Monster();

        System.out.println("Anna hirviön tyyppi:");
        addedMonster.type = scanner.nextLine();
        System.out.println("Anna hirviön elämän määrä numerona:");
        addedMonster.health = Integer.parseInt(scanner.nextLine());
        caveMonsters.add(addedMonster);
    }

}
