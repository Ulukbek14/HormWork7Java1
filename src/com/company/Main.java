package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] hav = {magic, medic, warrior};
        for ( Hero hero: hav) {
            hero.applySuperAbility("");
        }
    }
}