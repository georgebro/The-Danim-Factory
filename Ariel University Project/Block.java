
public class Block {

	private int Board_num;
	private int position;
	
	
	Block(int Board_num){
		this.Board_num=Board_num;
		this.position=0;
	}

	public int getBoard_num() {
		return Board_num;
	}

	public void setBoard_num(int board_num) {
		Board_num = board_num;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public void move(int m){
		setPosition(getPosition()+m);
	}
}
