package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Cave {
    Player player = new Player();
    public ArrayList<Monster> caveMonsters = new ArrayList<Monster>();
    Scanner scanner = new Scanner(System.in);

    public void addMonster(){
        Monster addedMonster = new Monster();

        System.out.println("Anna hirviön tyyppi:");
        addedMonster.type = scanner.nextLine();
        System.out.println("Anna hirviön elämän määrä numerona:");
        addedMonster.health = Integer.parseInt(scanner.nextLine());
        caveMonsters.add(addedMonster);
    }

    public void removeMonster(int targetIndex){
        
    }
    public void listMonsters(){
        for (Monster monster : caveMonsters) {
            int num = caveMonsters.indexOf(monster);
            monster.printInfo(num);
            }
    }

}
