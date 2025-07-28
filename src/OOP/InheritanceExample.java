package OOP;

public class InheritanceExample {
    public static void main(String[] args) {
        Cat biralo = new Cat();
        biralo.speak();
        System.out.println(biralo.isAlive);
    }
}

class Animal {
    Animal() {
        this.isAlive = true;
    }
    final boolean isAlive;
}

class Cat extends  Animal {
    public void speak() {
        System.out.println("Meow....");
    }
}
