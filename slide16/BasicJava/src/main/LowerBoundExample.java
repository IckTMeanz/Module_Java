package main;

import java.util.List;

public class LowerBoundExample {
	public static void addDogs(List<? super Dog> list) {
        list.add(new Dog()); // OK 

        // Object obj = list.get(0); Only safe nếu là Object
        // Dog d = list.get(0);  Not safe 
        
    }
	
	
}
