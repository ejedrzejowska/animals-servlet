package pl.ewa.animal.service;

import pl.ewa.animal.model.Animal;
import pl.ewa.animal.model.Species;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ej on 03/02/2019.
 */
public class AnimalService {

    private static Map<String, Animal> animals = new HashMap<>();

    static {
        Animal owl = new Animal("Owl");
        Animal salmon = new Animal("Salmon");
        Animal wolf = new Animal("Wolf");
        Animal turtle = new Animal("Turtle");
        Animal grasshopper = new Animal("Grasshopper");
        Animal snake = new Animal("Snake");
        Animal lynx = new Animal("Lynx");
        animals.put(owl.getId(), owl);
        animals.put(salmon.getId(), salmon);
        animals.put(wolf.getId(), wolf);
        animals.put(turtle.getId(), turtle);
        animals.put(grasshopper.getId(), grasshopper);
        animals.put(snake.getId(), snake);
        animals.put(lynx.getId(), lynx);
    }

    public static Map<String, Animal> findAll(){
        return animals;
    }

    public static Animal findById(String id){
        return animals.get(id);
    }

    public static void add(String name, int age, String url, Species species) {
        Animal newAnimal = new Animal(name);
        newAnimal.setAge(age);
        newAnimal.setPictureUrl(url);
        newAnimal.setSpecies(species);
        animals.put(newAnimal.getId(), newAnimal);
    }
}
