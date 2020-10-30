import java.io.Serializable;
public class Empp implements Serializable {
	

	private int id;
    private String name;
    private String address;
    private transient double salary;
    public Empp() {
		
	}
	public Empp(int id, String name, String address, double salary) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() 
	{
		System.out.println( "Empp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]");
	}
}