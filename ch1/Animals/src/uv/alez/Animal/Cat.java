package uv.alez.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        meow();
    }

    private void meow() {
        System.out.println("Meooow");
    }
}
