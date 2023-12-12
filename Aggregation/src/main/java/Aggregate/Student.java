package Aggregate;

public class Student {
	String name;
	int rollno;
	Address a;//creating an entity of Address class

	public Student(String name,int rollno,Address a) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollno=rollno;
		this.a=a;
		
	}
	public void display()
	{
		System.out.println("name is"+" "+name);
		System.out.println("rollnois"+" "+rollno);
		System.out.println("houseno is"+" "+a.houseno);
		System.out.println("housename is"+" "+a.housename);
		System.out.println("pincode is"+" "+a.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address obj=new Address(101,"kuthathayil",685512);
        Student s1=new Student("abcy",1,obj);
        s1.display();
	}

}
