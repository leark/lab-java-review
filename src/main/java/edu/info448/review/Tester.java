package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Husky husk = new Husky("Husk");
		husk.bark();
		husk.pullSled();

		Dog v1 = new Husky("v1");
		// Husky v2 = new Dog();
		// Huggable v2 = new Husky();
		Huggable v3 = new TeddyBear();
		// Husky v4 = new TeddyBear();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>();
		hugList.add(new Husky("Husk2"));
		hugList.add(new TeddyBear());

		for (Huggable thing : hugList) {
			thing.hug();
		}

		// Animal ani = new Animal();

		GiftBox<Husky> huskBox = new GiftBox<Husky>(husk);
	}
}