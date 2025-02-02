package task;


public class Player {
    String name;

    public void attack(Monster target){
        
        boolean monsterState = target.takeDamage(10);
        switch (monsterState ? 1:0) {
            case 0:
                
                break;
            case 1:
            
                break;
        }

    }
}
