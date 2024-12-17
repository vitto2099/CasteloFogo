package GameStuff;

public class Player {
    private int Health;
    private int Damage;
    private int Defense;
    private boolean Shield;
    private boolean Sword;
    private boolean Armor;

    public Player(int Health, int Damege, int Defense, boolean Shield, boolean Sword, boolean Armor) {
        this.Health = Health;
        this.Damage = Damege;
        this.Defense = Defense;
        this.Shield = Shield;
        this.Sword = Sword;
        this.Armor = Armor;
    }

    public Player() {
        this.Health = 3;
        this.Damage = 5;
        this.Defense = 12;
        this.Shield = false;
        this.Sword = false;
        this.Armor = false;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public int getDefense() {
        return Defense;
    }

    public boolean hasShield() {
        return Shield;
    }

    public void setShield(boolean Shield) {
        this.Shield = Shield;
    }

    public boolean hasSword() {
        return Sword;
    }

    public void setSword(boolean Sword) {
        this.Sword = Sword;
    }

    public boolean hasArmor() {
        return Armor;
    }

    public void setArmor(boolean Armor) {
        this.Armor = Armor;
    }

    public int getDamage() {
        return Damage;
    }
}