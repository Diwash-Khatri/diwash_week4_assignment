class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo Moo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
