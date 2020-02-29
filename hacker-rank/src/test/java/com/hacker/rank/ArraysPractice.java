package com.hacker.rank;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class ArraysPractice {

	static class MySort implements Comparator<String> {

		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	}

	/**
	 * object[] should be sorted in ascending order before passing to Arays.binarySearch
	 * other results are undefined
	 * 
	 *  if sorted in ascending order then index of element will be returned
	 */
	@Test
	public void binarySearch() {
		String[] cities = { "Bangalore", "Pune", "San Francisco", "New York City" };
		MySort ms = new MySort();
		Arrays.sort(cities, ms);
		System.out.println(Arrays.binarySearch(cities, "New York City")); // -1
	}
}
