package org.estoutic.solution_two.dogs;

public class DogRoomTester {
    public static void main(String[] args) {
        DogRoom dogRoom = new DogRoom(3);

        Dog dog1 = new Dog("Kelli", 3);
        Dog dog2 = new Dog("Lora", 5);
        Dog dog3 = new Dog("Barni", 2);

        dogRoom.addDog(dog1);
        dogRoom.addDog(dog2);
        dogRoom.addDog(dog3);

        dogRoom.printAllDogs();
    }
}
