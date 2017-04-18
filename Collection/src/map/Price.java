package map;

class Price{
    
    public String name;
    public int salary;
     
    public Price(String itm, int pr){
        this.name = itm;
        this.salary = pr;
    }
     
    public int hashCode(){
        int hashcode = 0;
        hashcode = salary * 20;
        hashcode += name.hashCode();
        //System.out.println("hashcode " + hashcode);
        return hashcode;
    }
     
    public boolean equals(Object obj){
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.name.equals(this.name) && pp.salary == this.salary);
        } else {
            return false;
        }
    }
     
    public String toString(){
        return " Name: " + name + "  Salary: " + salary;
    }
}
