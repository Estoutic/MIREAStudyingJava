package org.estoutic.solution_two.dogs;

class DogRoom {
    private Dog[] dogs;
    private int numberOfDogs;

    public DogRoom(int dogRoomSize) {
        dogs = new Dog[dogRoomSize];
        numberOfDogs = 0;
    }

    public void addDog(Dog dog) {
        if (numberOfDogs < dogs.length) {
            dogs[numberOfDogs] = dog;
            numberOfDogs++;
        } else {
            System.out.println("Dog room is full");
        }
    }

    public void printAllDogs() {

        for (Dog dog : dogs) {
            System.out.println(dog.toString() + "\n");
        }
    }
}