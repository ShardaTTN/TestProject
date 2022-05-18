//Question 3

final class Immutable {

    private String name;

    Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Driver {
    public static void main(String[] args) {
        Immutable immutable = new Immutable("Sharda");
        System.out.println(immutable.getName());
    }
}