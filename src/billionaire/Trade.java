package billionaire;

public class Trade {

	private Integer quantity;
	private Type type;
	
	public Trade(Integer n, Type type){
		this.quantity = quantity;
		this.type = type;
	}
	
	boolean matches(Trade t){
		return this.quantity == t.quantity;
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public Type getType() {
		return type;
	}	

}
