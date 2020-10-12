
public class Automated_Capacity extends Square {
	int FACTORY_CAPACITY;
	int FACTORY_PERIOD;
	int FACTORY_REVENEUE;
	
	Automated_Capacity(boolean risk, costs b){
		super(risk,b);
		FACTORY_CAPACITY=b.AUTOMATED_FACTORY_CAPACITY;
		FACTORY_PERIOD=b.AUTOMATED_FACTORY_PERIOD;
		FACTORY_REVENEUE=b.AUTOMATED_FACTORY_REVENUE;
	}
	
}
