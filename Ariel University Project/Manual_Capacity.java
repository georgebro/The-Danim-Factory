
public class Manual_Capacity extends Square {
	int FACTORY_CAPACITY;
	int FACTORY_PERIOD_ONE;
	int FACTORY_PERIOD_TWO;
	int FACTORY_REVENEUE;
	
	Manual_Capacity(boolean risk, costs b){
		super(risk,b);
		FACTORY_CAPACITY=b.MANUAL_FACTORY_CAPACITY;
		FACTORY_PERIOD_ONE=b.MANUAL_FACTORY_PERIOD_ONE;
		FACTORY_PERIOD_TWO=b.MANUAL_FACTORY_PERIOD_TWO;
		FACTORY_REVENEUE=b.MANUAL_FACTORY_REVENUE;
	}
	
	public void play(){
		
	}
	
	public static void main(String[] args){
		Manual_Capacity m=new Manual_Capacity(true, new denim_costs());
		System.out.println(m.board.AUTOMATED_FACTORY_CAPACITY);
	}
	
	
}
