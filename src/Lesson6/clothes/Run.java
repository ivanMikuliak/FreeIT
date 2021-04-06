package Lesson6.clothes;

import Lesson6.clothes.jacket.ArmaniJacket;
import Lesson6.clothes.pants.BossPants;
import Lesson6.clothes.shoes.ArmaniShoes;

public class Run {
    public static void main(String[] args) {
        Human human = new Human("Alen", new ArmaniJacket(), new BossPants(), new ArmaniShoes());
        human.getDressed();
        human.undressed();

    }
}