package main;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		List<? extends Number> a = new ArrayList<Number>();
//		List<? super Number> b = new ArrayList<Number>();
		
//		nghia n =()->System.out.print("hello lambda");
//		n.run();
		String a=new String("a");
		String b="a";
		System.out.println(a==b);
		
	}
	
//	public double callTestThrows(int a, int b) {
//		return testThrows(a, b);
//	}
	
	public double testThrows(int a, int b) throws Exception{
		return a/b;
	}
	
	public double testThrow(int a, int b) {
		if(b==0) throw new ArithmeticException();
		return a/b;
		
	
	}
}
