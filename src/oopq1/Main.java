package oopq1;

public class Main {
	public static void main(String[] args) {
		
		student stu1 = new student("111221333", "jose",200.50 );
		stu1.enroll("Math");
		stu1.setPhone("5558887777");
		stu1.setCity("some City");
		stu1.setState("Some state");
		stu1.pay(100.85);
		System.out.println(stu1.toString());
		stu1.checkBalance();
		stu1.enroll("Computer");
		stu1.showCourses();
	}
}

class student {
	private String ssn;
	private String name;
	private String email;
	private static int id = 1000;
	private String userid;
	public String course = "";
	private double amount;
	private double balance = 0;
	private Contact contact;
	private String phone;
	private String city;
	private String state;
	private String courseList= "";
		
	public student(String ssn, String name, double amount) {
		this.ssn = ssn;
		this.name = name;
		email = name + "@school.com";
		id++;
		int random = (int) (Math.random()*10000);
		userid = id + "" + random + "" + ssn.substring(5, 9);
		this.userid = userid; 
		balance = amount;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll(String course) {
		
		System.out.println("Course added : " + course);
		courseList = courseList + "\n" + course;
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Available Balance : $" + balance);
	}
	
	public void checkBalance() {
		System.out.println("Available Balance : $" + balance);
	}
	
	public void showCourses() {
		System.out.println("Enrolled Courses : " + courseList);
	}

	@Override
	public String toString() {
		String tempOut = "User ID: " + userid + "\n" + "Student's Name: " + name + "\n" + "email: " + email + "\n" + "City: " + "\n" + "State: " +state+ "\n"+"Phone Number: "+ phone;
		return tempOut;
	}
	
}

		

