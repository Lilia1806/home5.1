public class Boss {
    private int health;
    private int damage;
    private String DefenceType;

    public String getDefenceType() {
        return DefenceType;
    }

    public void setDefenceType(String defenceType) {
        DefenceType = defenceType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Boss(int health, int damage, String DefenceType) {
        this.health = health;
        this.damage = damage;
        this.DefenceType = DefenceType;
    }
}
