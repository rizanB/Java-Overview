package OOP;

public class ConstructorExample {
    String name;

    ConstructorExample () {
        this.name= "Roshan";
    }

    ConstructorExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println(obj1.name);

        ConstructorExample obj2 = new ConstructorExample("Parameter");
        System.out.println(obj2.name);
    }
}
