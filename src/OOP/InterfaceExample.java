package OOP;

// Interface - more like a abstract class, supports multiple inheritance

public class InterfaceExample {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Lion lion = new Lion();
        Rabbit rabbit = new Rabbit();

        fish.flee();
        fish.hunt();

        rabbit.flee();

        lion.hunt();
    }

}

class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("The Fish is swimming away!");
    }

    @Override
    public void hunt() {
        System.out.println("The Fish is eating small fishes.");
    }
}

class Lion implements  Predator {
    @Override
    public void hunt() {
        System.out.println("The Lion is hunting!");
    }
}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("Rabbit is running away!");
    }
}


interface Prey {
    void flee();
}

interface Predator {
    void hunt();
}

