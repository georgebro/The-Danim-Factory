
public class Materials extends Square {
int MATERIAL_BLOCK;
	
	
	Materials(boolean risk, costs b){
		super(risk,b);
		MATERIAL_BLOCK=b.MATERIAL_BLOCK;
	}
}
