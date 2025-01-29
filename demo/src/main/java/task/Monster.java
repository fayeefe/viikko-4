package task;

public class Monster {
    String type;
    int health;
    public boolean takeDamage(int dmg){
            
            health -= 10;
            if(health <= 0){
                return false;
            }
            else{
                return true;
            }
        }
    
}