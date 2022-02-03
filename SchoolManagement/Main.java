package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        Teacher Geetha = new Teacher(1, "Geetha",500);
	        Teacher Priya = new Teacher(2, "Priya", 800);
	        Teacher Kumar = new Teacher(3,"Kumar",600);

	        List<Teacher> teacherList = new ArrayList<>();
	        teacherList.add(Geetha);
	        teacherList.add(Priya);
	        teacherList.add(Kumar);

			Student Manas = new Student(1, "Manas", 4);
	        Student Preethi = new Student(2, "Preethi", 12);
	        Student Reshma = new Student(3, "Reshma", 5);
	        List<Student> studentList = new ArrayList<>();

	        studentList.add(Manas);
	        studentList.add(Preethi);
	        studentList.add(Reshma);

	        School gms  = new School(teacherList,studentList);

	        Teacher Varun= new Teacher(6,"Varun", 900);

	        gms.addTeacher(Varun);

	        Manas.payfees(5000);
	        Preethi.payfees( 6000);
	        System.out.println("gms has earned $"+ gms.getTotalMoneyEarned());

	        System.out.println("Making GMS PAY SALARY");
	        Geetha.receiveSalary(Geetha.getSalary());
	        System.out.println("GMS has spent for salary to " + Geetha.getName()
	        +" and now has $" + gms.getTotalMoneyEarned());

	        Priya.receiveSalary(Priya.getSalary());
	        System.out.println("GMS has spent for salary to " + Priya.getName()
	                +" and now has $" + gms.getTotalMoneyEarned());


	        System.out.println(Preethi);

	        Kumar.receiveSalary(Kumar.getSalary());

	        System.out.println(Kumar);
	    }


}
