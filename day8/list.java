package day8;
import java.util.Arrays;
import java.util.List;
class Employee{
		String name;
		String department;
		int salary;
		Employee(String name, String department, int salary){
			this.name = name;
			this.department =department;
			this.salary = salary;
		}
		public String toString() {
			return name+"-"+ department +"-"+salary;
		}
	}
	public class list{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>employees = Arrays.asList(
				new Employee("Ravi","IT",60000),
				new Employee("Anil","HR",50000),
				new Employee("Priya","IT",50000),
				new Employee("Amit","HR",60000),
				new Employee("Rahul","AT",50000)
				);
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

}
