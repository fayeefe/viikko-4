package task;
import java.util.Scanner;

public class Player {
    String name;

    public void attack(Monster target){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valitse hirviö, johon hyökätä:");
        
        boolean monsterState = target.takeDamage(10);
        switch (monsterState ? 1:0) {
            case 0:
                
                break;
            case 1:
                break;
        }

        scanner.close();
    }
}
