package com.inheritance;
public class StudentApp {

	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("Student result App...");
		System.out.println("************************");
		principal P=new principal();
		P.addsubject();
		P.addMarks();
		P.showResult();
		P.showcredit_score();
		//one more method
		
		/*System.out.println("menu");
		System.out.println("1.Add Subject");
		System.out.println("2.Add Marks");
		System.out.println("3.show result");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			P.addsubject();
			break;
		case 2:
			P.addMarks();
			break;
		case 3:
			P.showResult();
			System.out.println(P.credit_score);
			break;
		}*/
	}

}
