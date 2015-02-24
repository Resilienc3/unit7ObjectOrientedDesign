/**
 * This is a class that tests the Card class.
 */
public class CardTester{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		 Card card1 = new Card("two", "diamonds", 2);
		 Card card2 = new Card("two", "diamonds", 2);
		 Card card3 = new Card("ace", "spades", 1);
		 
		 System.out.print("\n\ncard1.matches(card2):\n Expected: true\nActual: " + card1.matches(card2)) ;
		 System.out.print("\n\ncard1.rank():\n Expected: two\nActual: "+card1.rank());
		 System.out.print("\n\ncard1.suit():\n Expected: diamonds\nActual: "+card1.suit());
		 System.out.print("\n\ncard1.pointValue():\n Expected: 2\nActual: "+card1.pointValue());
		 System.out.print("\n\ncard1.toString():\n Expected: two of diamonds (Point Value 2)\nActual: "+card1.toString());

		 System.out.print("\n\ncard2.matches(card3):\n Expected: false\nActual: "+card2.matches(card3)) ;
		 System.out.print("\n\ncard2.rank():\n Expected: two\nActual: "+card2.rank());
		 System.out.print("\n\ncard2.suit():\n Expected: diamond\nActual: "+card2.suit());
		 System.out.print("\n\ncard2.pointValue():\n Expected: 2\nActual: "+card2.pointValue());
		 System.out.print("\n\ncard2.toString():\n Expected: two of diamonds (Point Value 2)\nActual: "+card2.toString());
		 
		 System.out.print("\n\ncard3.matches(card1):\nExpected: false\nActual: "+card3.matches(card2)) ;
		 System.out.print("\n\ncard3.rank():\nExpected: ace\nActual: "+card3.rank());
		 System.out.print("\n\ncard3.suit():\nExpected: spades\nActual: "+card3.suit());
		 System.out.print("\n\ncard3.pointValue():\nExpected: 1\nActual: "+card3.pointValue());
		 System.out.print("\n\ncard3.toString():\nExpected: ace of spades (Point Value 1)\nActual: "+card3.toString());
		 
	}
}
