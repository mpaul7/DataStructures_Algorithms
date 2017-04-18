package set;

public class Emp {
	
	public int id; 
	public String name; 
	public int salary;
	
	 public Emp(int id, String n, int s){
	        this.id = id;
	        this.name = n;
	        this.salary = s;
	    }
	 
	 public String toString(){
		 return "Id: "+this.id+" -- Name: "+this.name+" -- Salary: "+this.salary;
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}
