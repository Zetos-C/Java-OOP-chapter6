package ex6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        BigDog bigDog = new BigDog("Rex");
        Cat cat = new Cat("Whiskers");

        // Dog greets
        dog1.greets(); // Output: Woof
        dog2.greets(); // Output: Woof

        // BigDog greets
        bigDog.greets(); // Output: Wooow

        // BigDog greets
        bigDog.greets(dog1); // Output: Woooooow

        // BigDog greets
        bigDog.greets(bigDog); // Output: Wooooooooow

        // Cat greets
        cat.greets(); // Output: Meow
    }
}
