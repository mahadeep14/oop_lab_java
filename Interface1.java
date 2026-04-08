interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Cat implements Pet {
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void play() {
        System.out.println("Cat plays with ball");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.play();
    }
}