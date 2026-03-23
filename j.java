
 class Student {
	 
	 String name;
	 int age;
	 String course;
	 
	 public Student(String n,int a, String c){
		 
		 name = n;
		 age = a;
		 course = c;
		 
	 }
	 
	 public void displayDetails() {
		 System.out.println("Name : " + name);
		 System.out.println("Age : " +  age);
		 System.out.println("Course : " + course);
	 }
	 
	 public static void main(String[] args) {
		
		 Student s1 = new Student("Karthik", 21, "Information Science");
		 s1.displayDetails();

		 Student s2 = new Student("Hemanth", 21, "Computer Science");
		 s2.displayDetails();

	}

}
