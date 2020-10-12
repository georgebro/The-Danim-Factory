import java.util.Scanner;
import java.util.Vector;


public class Team {
	Vector<Block> block_vector;
	int money;
	
	Team(){
		block_vector=new Vector<Block>();
		money=2000000;
	}
	
	void RollDice() throws DiceException{
		Scanner sc=new Scanner(System.in);
		Dice dice=new Dice();
		dice.ShowDices();
		System.out.println("would you like to add a block? (Y/N)");
		while(sc.next().equals("Y")){
			addBlock();
		}
		int[] choices=dice.Choices();
		for (int i = 0; i < choices.length; i++) {
			System.out.println("with which block would you like to move "+choices[i]+" squares?");
			block_vector.get(sc.nextInt()).move(choices[i]);
		}
	}
	
	void addBlock(){
		System.out.println("on which board would you like to add the block?");
		Scanner sc=new Scanner(System.in);
		block_vector.add(new Block(sc.nextInt()));
	}
	
	
	
}
