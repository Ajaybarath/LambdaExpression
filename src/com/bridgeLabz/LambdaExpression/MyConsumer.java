package com.bridgeLabz.LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

interface Consumer<T> {
	public void accept(Integer t);
}

public class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer imp value " + t);
	}

	public static void main(String args[]) {

		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(6);
		myList.add(8);

		Iterator<Integer> iterator = myList.iterator();

		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println("Iterator value " + i);
		}

		MyConsumer myConsumer = new MyConsumer();
		
		java.util.function.Consumer<? super Integer> myConsumerList = n -> {
			System.out.println(n);
		};
		
		myList.forEach(myConsumerList);
		
		myList.forEach(n -> System.out.println(n));
		
		Function<Integer, Double> doubleFunction = Integer::doubleValue;
		
		myList.forEach(n -> {
			System.out.println(doubleFunction.apply(n));
		});

	}

}
