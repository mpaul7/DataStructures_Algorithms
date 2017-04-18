package dataStructures;

public class Employee {
	public String name;
	public int salary;
	
	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
		}
	
	public String toString(){
		return "Name : '" + this.name + " -- salary " + this.salary;
		}
	}
