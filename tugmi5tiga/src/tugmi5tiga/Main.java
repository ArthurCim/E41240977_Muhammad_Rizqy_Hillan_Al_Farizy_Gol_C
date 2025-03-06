/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugmi5tiga;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }

        if (animaldog instanceof Dog) {
            System.out.println("animaldog is Dog");
        }
    }
}
