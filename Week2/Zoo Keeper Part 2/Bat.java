public class Bat extends Mammal{
    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("The sound a bat taking off");
        this.energyLevel -= 50;

    }

    public void eatHumans() {
        System.out.println("the so-well, never mind");
        this.energyLevel += 25;

    }

    public void attackTown() {
        System.out.println("The sound of a town on fire");
        this.energyLevel -= 100;

    }
    
}
