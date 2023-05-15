package innerclass.regular.exercise;

import innerclass.regular.exercise.Hero.Weapon;

public class Exercise {

    public static void main(String[] args) {

        Hero hero1 = new Hero(10);

        Weapon weapon1 = hero1.new Weapon();

        System.out.println(hero1.getAmmunition());

        weapon1.shoot();
        weapon1.shoot();
        weapon1.shoot();
        weapon1.shoot();

        System.out.println(hero1.getAmmunition());


    }
}
