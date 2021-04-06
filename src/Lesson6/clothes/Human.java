package Lesson6.clothes;

import Lesson6.clothes.jacket.Jacket;
import Lesson6.clothes.pants.Pants;
import Lesson6.clothes.shoes.Shoes;

public class Human {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public void getDressed() {
        System.out.println("человек "+this.getName()+" одел " + this.getJacket().putOn() +", "+this.getShoes().putOn()+ " и " + this.getPants().putOn());
    }

    public void undressed() {
        System.out.println("человек "+this.getName()+" снял " + this.getJacket().takeOff() +", "+this.getShoes().takeOff()+ " и " + this.getPants().takeOff());
    }
}
