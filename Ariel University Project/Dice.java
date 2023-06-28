import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dice {
	int[] dice;
	public Dice() {
		dice = new int[3];
		dice[0] = (int) (Math.random() * 6);
		dice[1] = (int) (Math.random() * 6);
		dice[2] = (int) (Math.random() * 6);
		Arrays.sort(dice);
	}
	public int[] Choices() throws DiceException {
		System.out.println("how would you like to move?");
		while(true){
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		try {
			int[] choice=null;
			StringTokenizer st = new StringTokenizer(s);
			if (st.countTokens() > 3) {
				throw new DiceException("more than 3 choices");
			}
			if (st.countTokens() == 3) {
				choice = new int[3];
				choice[0] = Integer.parseInt(st.nextToken());
				choice[1] = Integer.parseInt(st.nextToken());
				choice[2] = Integer.parseInt(st.nextToken());
				Arrays.sort(choice);
				if (!Arrays.equals(dice, choice)) {
					throw new DiceException("bad combination");
				}
			}
			if (st.countTokens() == 2) {
				choice = new int[2];
				choice[0] = Integer.parseInt(st.nextToken());
				choice[1] = Integer.parseInt(st.nextToken());
				if (choice[0] + choice[1] != dice[0] + dice[1] + dice[2]
						|| (choice[0] != dice[0] && choice[0] != dice[1] && choice[0] != dice[2])) {
					throw new DiceException("bad combination");
				}
			}
			if (st.countTokens() == 1) {
				choice = new int[1];
				if (choice[0] != dice[0] + dice[1] + dice[2]) {
					throw new DiceException("bad combination");
				}
			}
			return choice;
		} catch (NumberFormatException e) {
			throw new DiceException("invalid format");
		}
		catch(DiceException d){
			System.out.println("choose again!");
			
		}
	    }
	}
	public void ShowDices(){
		System.out.println(dice[0]+", "+dice[1]+", "+dice[2]);
	}
}
