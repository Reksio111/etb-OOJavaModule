package com.example.enums;

public class CardTester {

	public static void main(String[] args) {
		Card threeofDiamond = new Card(Suit.DIAMOND, Value.TREE);
		Card acefSpades = new Card(Suit.SPADES, Value.ACE);
		System.out.println(acefSpades);
		System.out.println(threeofDiamond);

		if (threeofDiamond.getSuit() == acefSpades.getSuit()) {
			System.out.println("Same siut");
		} else {
			System.out.println("Different suit");
		}

	}

}
