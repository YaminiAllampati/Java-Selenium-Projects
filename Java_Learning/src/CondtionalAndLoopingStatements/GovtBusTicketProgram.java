package CondtionalAndLoopingStatements;

public class GovtBusTicketProgram {
	static char gender1 ='M';
	static char gender2 ='F';
	
	static void male(int age) {
		if(gender1=='M') {
			if(age<2)  {
       	 System.out.println("free ticket for infants");
			}
			else if(age>2 && age <=12) {
				System.out.println("Half Ticket");
			}
			else if(age>12 && age <=60) {
				System.out.println("full ticket");
			}
			else {
				System.out.println("Half ticket due to Sr citizen");
			}
			
        }
	}
		
	static void female(int age) {
		if(gender2=='F') {
			System.out.println("Free Ticket fror Women");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		male(3);
		female(1);
	}
}

