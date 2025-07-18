package main;

import java.util.List;

public class UpperBoundExample {
	public static void makeAllSpeak(List<? extends Animal> list) {
        for (Animal a : list) {
            a.speak(); // OK 
        }

        // list.add(new Animal()); //KO
       
    }
}
