package task;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void menuPrint()
    {
        System.out.println("1) Lisää luolaan hirviö");
        System.out.println("2) Listaa hirviöt");
        System.out.println("3) Hyökkää hirviöön");
        System.out.println("4) Tallenna peli");
        System.out.println("5) Lataa peli");
        System.out.println("0) Lopeta ohjelma");
    }

    public static void saveGame(){
        
    }

    public static void main(){
        Player player = new Player();
        Cave cave = new Cave();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            menuPrint();
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("Valitse hirviö, johon hyökätä:");
                    for (Monster monster : cave.caveMonsters) {
                    System.out.println(cave.caveMonsters.indexOf(monster) + ": " + monster.type + " / " + monster.health + "HP");
                    }
                    
                    int inputValue = Integer.parseInt(scanner.nextLine());
                    Monster inputMonster = cave.caveMonsters.get(inputValue);
                    player.attack(inputMonster);
                    break;
                case "3":
                    
                    break;
                case "0":
                    
                    System.exit(0);
                    break;
                default:
                    System.out.println("Väärä valinta, koeta uudelleen");
                    break;
            }
        }

    }
}