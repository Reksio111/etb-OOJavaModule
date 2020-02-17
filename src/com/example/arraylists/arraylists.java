package com.example.arraylists;

import java.util.ArrayList;
import java.util.List;

public class arraylists {

	public static void main(String[] args) {

//		ArrayList<String> words = new ArrayList<>();
//		words.add("poland");
//		words.add("ireland");
//		words.add("spain");
//		words.add("italy");
//		words.add("sweeden");
//
//		for (String str : words) {
//			System.out.println(str);
//		}
//
//		System.out.println(words.get(1).charAt(1));
//		words.remove(4);
//		for (String str : words) {
//			System.out.println(str);
//		}
//		words.set(0, "grecee");
//
//		for (String str : words) {
//			System.out.println(str);
//		}
//		words.add(0, "Poland");
//
//		for (String str : words) {
//			System.out.println(str);
//		}
//		System.out.println(words);
//
//		ArrayList<Integer> numbers = new ArrayList<>();
//
//		for (int i = 10; i <= 100; i += 10) {
//			numbers.add(i);
//		}
//
//		System.out.println(numbers);
//
//		for (int i = 0; i < numbers.size(); i++) {
//			numbers.remove(i);
//		}
//		System.out.println(numbers);

		List<String> words = new ArrayList<>();
		words.add("the");
		words.add("quick");
		words.add("brown");
		words.add("fox");

		System.out.println(words);

		addStarr(words);
		System.out.println(words);
		removeStarr(words);
		System.out.println(words);
	}

	public static void addStarr(List<String> list) {
		for (int i = 1; i <= list.size(); i += 2) {
			list.add(i, "*");
		}

	}
	public static void removeStarr(List<String> list) {
		for (int i = 0; i <= list.size(); i ++ ) {
			if(list.get(i).charAt(0) =='*')
			list.remove(i);
		}
	}

}
