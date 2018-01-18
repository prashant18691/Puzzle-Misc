package com.puzzle.PlayingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDeck {
	
	 private List<Card> deck;
	 private int remainingCards;
	
	

	public TestDeck() {
		super();
		this.deck = new ArrayList<Card>();
		
		for(Suit s: Suit.values()){
			if(s!=Suit.JOKER){
			for(Rank r : Rank.values()){
				if(r!=Rank.ZERO){
				Card c = new Card(s,r);
				this.deck.add(c);
				}
				}
			}
		}
		this.deck.add(new Card(Suit.JOKER, Rank.ZERO));
		
		remainingCards=deck.size();
		
	}
	
	void shuffle(){
		Collections.shuffle(deck);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDeck tdeck = new TestDeck();
		tdeck.shuffle();
		System.out.println("*************************");
		printDeck(tdeck);
		System.out.println("*************************");
		Card c1 = tdeck.drawCard();
		
		System.out.println(c1.getSuit()+" "+c1.getRank());
		
		Card c2 = tdeck.drawCard();
		System.out.println(c2.getSuit()+" "+c2.getRank());
		System.out.println(tdeck.remainingCards);

	}

	private  Card drawCard() {
		// TODO Auto-generated method stub
		Card c = deck.get(deck.size()-remainingCards);
		remainingCards--;
		return c;
	}

	private static void printDeck(TestDeck tdeck) {
		for(Card c : tdeck.deck)
			System.out.println(c.getSuit()+" "+c.getRank());
	}

}

enum Suit{
	SPADE,CLUB,DIAMOND,HEART,JOKER;
}

enum Rank{
	ZERO,ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
}

class Card{
	
	private Suit suit;
	private Rank rank;
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	
	
}
