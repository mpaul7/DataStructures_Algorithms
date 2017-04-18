package set;

public class Price {
	public String item;
	public int price;
	
	public Price(String itm, int pr){
		this.item = itm;
		this.price = pr;
	}
	public String toString(){
		return "item: " + item + " price: " + price;
	}

	@Override
	public int hashCode() {
		//System.out.println("In hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//  System.out.println("In equals");
		if (this == obj){
			System.out.println("in this == obj");
			return true;
		}
			
		if (obj == null){
			System.out.println("in obj == null");
			return false;
		}
			
		if (getClass() != obj.getClass()){
			System.out.println("in getClass() != obj.getClass()");
			return false;
		}
			
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null){
				System.out.println("other.item != null");
				return false;
			}
				
		} else if (!item.equals(other.item)){
			System.out.println("!item.equals(other.item)");
			return false;
			
		}
			
		if (price != other.price){
			System.out.println("price != other.price");
			return false;
		}
		System.out.println("price != other.price");
		return true;
	}
}
