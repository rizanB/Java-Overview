package OOP;

public enum Size {

    SMALL("This is small size"),
    MEDIUM("This is medium size")
    ;

    public String getName() {
        return this.pizzaSize;
    }

    private final String pizzaSize;
    private Size(String size) {
        this.pizzaSize = size;
    }
}
