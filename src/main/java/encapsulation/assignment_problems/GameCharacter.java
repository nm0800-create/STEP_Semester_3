package encapsulation.assignment_problems;

public class GameCharacter {
    private int health;
    private final int maxHealth;

    public GameCharacter(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        int newHealth = health - amount;
        health = Math.max(newHealth, 0);
    }

    public void heal(int amount) {
        int newHealth = health + amount;
        health = Math.min(newHealth, maxHealth);
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        GameCharacter c = new GameCharacter(100);
        c.takeDamage(30);
        System.out.println("health = " + c.getHealth());   // 70
        c.heal(50);
        System.out.println("health = " + c.getHealth());   // 100 (capped)
        c.takeDamage(150);
        System.out.println("health = " + c.getHealth());   // 0 (floored)
    }
}
