package main;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		List<? extends Number> a = new ArrayList<Number>();
//		List<? super Number> b = new ArrayList<Number>();
		
//		nghia n =()->System.out.print("hello lambda");
//		n.run();
		
		nghia n =()->System.out.print("hello lambda");
		n.run();
		
		List<Dog> dogs = new ArrayList<>();
        LowerBoundExample.addDogs(dogs);	//chỉ ghi
        UpperBoundExample.makeAllSpeak(dogs); // chỉ đọc
		
	}
	

	
}
