
public class Outsourced_Costs extends Square {
	int GOODS_CAPACITY;
	int OPERATION;
	int REVENUE;
	
	Outsourced_Costs(boolean risk, costs b){
		super(risk,b);
		GOODS_CAPACITY=b.OUTSOURCED_GOODS_CAPACITY;
		OPERATION=b.OUTSOURCED_OPERATION;
		REVENUE=b.OUTSOURCED_GOODS_REVENUE;
	}
}
