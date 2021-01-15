package lab2.ch2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        Animal animalCat= cat;
        ((Cat)animalCat).play();
        cat.play();
        System.out.println(cat.getName());
    }
}
