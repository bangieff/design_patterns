package net.bangieff.design_patterns.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {
	private String[] bikes;
	private int index;
	
	public BikeRepository() {
		bikes = new String[10];
		index = 0;
	}
	
	public int getLength() {
		int result = 0;
		for(String bike : bikes) {
			if(bike!=null) {
				result++;
			}
		}
		return result;
	}
	
	public void addBike(String bike) {
		if(index == bikes.length) {
			String[] largerBikes = new String[bikes.length + 5];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes = null;
		}
		
		bikes[index] = bike;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> result = new Iterator<String>() {
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}
			
			@Override
			public void remove() {
				int bikesLength = getLength();
				currentIndex--;
				
				String[] newBikes = new String[bikesLength-1];
				System.arraycopy(bikes, 0, newBikes, 0, currentIndex);
				if(hasNext()) {
					System.arraycopy(bikes, currentIndex + 1, newBikes, currentIndex, bikesLength - currentIndex - 1);
				}
				bikes = newBikes;
			}
		};
		return result;
	}
}
