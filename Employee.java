public class Employee {
	private int empId;
	private String name;
	private String gender;
	private int age;
	public Employee(int empId, String name, String gender, int age) {
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Gender: "+gender);
		System.out.println("Employee Age: "+age);
	}
}


