package OnlineCourseRegistrationSystem;
import java.util.*;
import java.util.function.*;
import java.util.Scanner;

interface EligibilityChecker{
	boolean checkEligibility(double Average);
}


class Student{
	private int studentId;
	private String studentName;
	private int[]marks =new int[3];
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int index,int marks) {
		if(marks<0 || marks>100) {
			throw new IllegalArgumentException("Marks should be between 0 and 100");
		}
		else {
			this.marks[index] = marks;
		}
	}
	public double calculateTotal() {
		return  marks[0] + marks[1] + marks[2];

	}
	public double calculateAverage() {
		return marks[0] + marks[1] + marks[2]/3;
	}

}

public class RegistrationSystem {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student students[] = new Student[3];

		Predicate<Double> passCheck = avg -> avg >= 35;

		Function<Double,String> grade= avg->{
			if(avg>75) {
				return "Grade A";
			}
			else if(avg>60&&avg<70) {
				return "Grade B";
			}
			else if(avg>50&&avg<60) {
				return "Grade c";
			}
			else {
				return "grade D";
			}
		};

		Consumer<Student> display=s->{
			double avg=s.calculateAverage();
			double total=s.calculateTotal();

			System.out.println("Student Id: "+s.getStudentId());
			System.out.println("Student Name:"+s.getStudentName());

			System.out.print("marks :");
			for(int m :s.getMarks()) {
				System.out.print(m+" ");
			}
			System.out.println("Total marks :"+total);
			System.out.println("Average marks :"+ avg);

			System.out.println("Result : " +
					(passCheck.test(avg) ? "PASS" : "FAIL"));


			System.out.println("grade :"+ grade.apply(avg));
		};
		EligibilityChecker eligibility =
				avg -> avg >= 40;

				try {
					for(int i=0;i<students.length;i++) {
						students[i]=new Student();
						System.out.println("Enter Student Id:");
						students[i].setStudentId(sc.nextInt());
						sc.nextLine();
						System.out.println("Enter Student name: ");
						students[i].setStudentName(sc.nextLine());


						System.out.println("Enter marks");
						for(int j=0;j<3;j++) {
							System.out.print("Module "+(j+1)+" ");
							int mark=sc.nextInt();
							students[i].setMarks(j,mark);

						}

					}

					for(Student s : students) {
						display.accept(s);

						double avg =s.calculateAverage();


						System.out.println("Eligibility : " +
								(eligibility.checkEligibility(avg) ?
										"Eligible for Certificate" :
										"Not Eligible"));
						System.out.println(" ");
					}
				}
				catch(IllegalArgumentException ee){
					System.out.println(ee.getMessage());
				}
				catch(Exception e) {
					System.out.println("Invaild Error");
				} 


				sc.close();

	}

}
