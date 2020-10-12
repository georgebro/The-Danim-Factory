
public class Square {
	boolean is_risk;
	costs board;
	
	protected void play(){}
	
	Square(){
		is_risk=true;
	}
	
	Square(boolean risk, costs b){
		is_risk=risk;
		board=b;
	}
	
	
}
