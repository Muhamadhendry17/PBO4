class HewanMakan {
    public void eat() {
        System.out.println("Peliharaanku sedang makan");
    }

    public void eat(String food) {
        System.out.println("Peliharaanku sedang makan" + food);
    }
}

class Dog extends HewanMakan {
    @Override
    public void eat() {
        System.out.println("Anjing sedang makan");
    }

    public void eat(String food) {
        System.out.println("Anjing sedang makan " + food);
    }
}

class Cat extends HewanMakan {
    @Override
    public void eat() {
        System.out.println("Kucing sedang makan");
    }

    public void eat(String food) {
        System.out.println("Kucing sedang makan " + food);
    }
}

public class Animal {
    public static void main(String[] args) {
        HewanMakan animal = new HewanMakan();
        animal.eat();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.eat("Ikan Sarden");

        Cat cat = new Cat();
        cat.eat();
        cat.eat("Ikan Salmon");
    }
}
