package map;

public class Employee {
	public int eid;
	public String name;
	public int salary;
	
		public Employee(String n, int s){
			this.name = n;
			this.salary = s;
			}
		public Employee(int eid, String n, int s){
			this.eid = eid;
			this.name = n;
			this.salary = s;
		}
	    
	public String toString(){
	        return "Name: "+this.name+"-- Salary: "+  this.salary;   
	        }
	}

