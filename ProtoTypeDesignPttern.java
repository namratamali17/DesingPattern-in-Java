package designpattern;

interface ProtoType {
	public ProtoType getClone();
}

class Employee implements ProtoType {

	private int id, age;
	private String name;
	private float salary;

	public Employee(int id, int age, String name, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public ProtoType getClone() {
		// TODO Auto-generated method stub
		return new Employee(id, age, name, salary);
	}

}

public class ProtoTypeDesignPttern {
	public static void main(String[] args) {
		Employee employee = new Employee(101, 23, "namu", 3055555);
		System.out.println(employee);
		Employee employee2 = (Employee) employee.getClone();
		System.out.println(employee2);

	}
}