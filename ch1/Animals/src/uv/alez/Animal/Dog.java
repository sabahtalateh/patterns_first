package uv.alez.Animal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        bark();
    }

    private void bark() {
        System.out.println("Bark!!");
    }
}
