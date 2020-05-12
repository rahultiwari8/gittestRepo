package com.test.lambdafunction;

import java.util.function.Function;

public class FuncationChaining {
	
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		
		System.out.println(f1.andThen(f2).apply("AishwaryaAbhi"));
		System.out.println(f2.compose(f1).apply("AishwaryaAbhi"));
	}

}
