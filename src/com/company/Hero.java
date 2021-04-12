package com.company;

public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String superAbilities;

    public Hero() {
    }

    public String getSuperAbilities() {
        return superAbilities;
    }

    public void setSuperAbilities(String superAbilities) {
        this.superAbilities = superAbilities;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}


