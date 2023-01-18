package net.bangieff.design_patterns.iterator;

import java.util.Iterator;

public class IteratorApp {

	public static void main(String[] args) {
		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		repo.addBike("BMX");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		for(String bike : repo) {
			System.out.println(bike);
		}
		System.out.println(repo.getLength());

		while(bikeIterator.hasNext()) {
			System.out.println(bikeIterator.next());
			bikeIterator.remove();
		}
		System.out.println(repo.getLength());
	}

}
