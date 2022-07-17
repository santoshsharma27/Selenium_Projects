package OOP1;

public class Encapsulation {

	// private data variables
	// If a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding the fields within the class

	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {

		Encapsulation emp = new Encapsulation();
		emp.setEmpName("Santosh");
		emp.setEmpAge(26);
		emp.setSsn(123456);
		System.out.println("Employee name is: " +emp.getEmpName());
		System.out.println("Employee age is: " +emp.getEmpAge());
		System.out.println("Employee ssn is: " +emp.getSsn());
	}

	// getter and setter methods
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
