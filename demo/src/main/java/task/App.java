package task;

import java.util.Scanner;

public class App {


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

    public static void main(String[] args){
        Cave cave = new Cave();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            menuPrint();
            switch (scanner.nextLine()) {
                case "1":
                    cave.addMonster();
                    break;
                case "2":
                    cave.listMonsters();
                    break;
                case "3":            
                    System.out.println("Valitse hirviö, johon hyökätä:");        
                    cave.listMonsters();
                    int inputValue = Integer.parseInt(scanner.nextLine());
                    Monster inputMonster = cave.caveMonsters.get(inputValue);
                    boolean monsterState = inputMonster.takeDamage(10);
                    switch (monsterState ? 1:0) {
                        case 0:
                            cave.removeMonster(inputValue);
                            break;
                        case 1:
                            
                            break;
                    }
                    
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "0":                   
                    System.out.println("Peli päättyy. Kiitos pelaamisesta!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Väärä valinta, koeta uudelleen");
                    break;
            }
        }

    }
}