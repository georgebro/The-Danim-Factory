import java.util.Vector;


public class Board {
	Vector<Square> squares;
	
	Board(){
		squares=new Vector<Square>();
	}
	
	void addSquare(Square s){
		squares.add(s);
	}
}
