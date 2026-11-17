package Act1;

public class Student {

	
		    private String name;
		    private String studentId;
		    private double grade;

		    // Constructor
		    public Student(String name, String studentId, double grade) {
		        this.name = name;
		        this.studentId = studentId;
		        this.grade = grade;
		    }

		    // Getters
		    public String getName() {
		        return name;
		    }

		    public String getStudentId() {
		        return studentId;
		    }

		    public double getGrade() {
		        return grade;
		    }

		    // Setter for grade
		    public void setGrade(double grade) {
		        this.grade = grade;
		    }

		    // Display method
		    public void displayInfo() {
		        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
		    }

		    public static void main(String[] args) {
		        Student s1 = new Student("Renz Madayag", "251-0416-1", 85.0);
		        Student s2 = new Student("Jason Titum", "251-1160-1", 88.5);

		        s1.setGrade(92.0); // change one grade using the setter

		        s1.displayInfo();
		        s2.displayInfo();
		    }
		}

	


