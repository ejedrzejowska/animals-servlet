package pl.ewa.animal.model;

import java.util.UUID;

import static java.util.UUID.randomUUID;

/**
 * Created by ej on 03/02/2019.
 */
public class Animal {

    String id;
    Species species;
    String name;
    int age;
    String pictureUrl;
//    String description;

    public Animal(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getId(){
        return id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setPictureUrl(String url){
        this.pictureUrl = url;
    }

    public String getPictureUrl(){
        return pictureUrl;
    }

    public String toString(){
        return name + "; " + age + "years old";
    }
}
