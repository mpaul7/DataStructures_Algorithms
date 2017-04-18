
public class Person implements Comparable<Person> {
	
	public String name; 
	public int age; 
	
	public Person(String name, int age){
		this.name = name; 
		this.age = age;
		}
	
	/*public int compareTo(Person o){
		return name.compareTo(o.name); // sort alphabatically
		}*/
	
	public int compareTo(Person o){
		int myLength  = name.length();
		int oLength = o.name.length();
		if (oLength == myLength) return 0; // sort on number of characters 
		if (myLength < oLength) return -1;
		return 1;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	}
