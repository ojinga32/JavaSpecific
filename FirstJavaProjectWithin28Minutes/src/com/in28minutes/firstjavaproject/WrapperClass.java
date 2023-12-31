package com.in28minutes.firstjavaproject;

public class WrapperClass {

	/*
		what is WrapperClass?
		before you know this, you need to remember about 'primitive variable', 'Reference variable'
		To put it simply, 'Primitive variable' is saved in Stack and 'Reference variable' is saved in Heap
		'Primitive variable' is can not be referenced. it means, even if you wnat to make varible1, varible2
		and value is samely 5 however this is not the same because it isnt same location of stack memory 
		even if the value is same
		but you can make it is same to use WrapperClass.
		if you make WrapperClass, the varible is the 'Primitive variable' but you can reference the value among WrapperClass
		let's see
	*/
	
	public static void main(String[] args) {
		Integer num = new Integer(17); // 박싱

		int n = num.intValue();        // 언박싱

		System.out.println(n);
		
		Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱

		char c = ch;        // char c = ch.charValue();           : 오토언박싱

		System.out.println(c);
	}
	
}
