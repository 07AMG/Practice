package controlStatmentPrac;

public class AssigmnetNestedIF {

	public static void main(String[] args) 
	{
		int Card_no=1111;
		int pass=123;
		int withdraw=7000;
		
		if (Card_no==1111) 
		{
			System.out.println("CORRECT NO PLZ ENTER PAAWORD");
		
		    if (pass==123) 
		   {
			System.out.println("CORRECT PASSWORD PLZ ENTER WITHDRAWAL AMMOUNT");
			
		       if (withdraw<=7000) 
		       {
			      System.out.println("HERE IS YOUR PAYMENT");
		        }     
		       else {
			      System.out.println("PLZ ENTER AMMOUNT LESS THAN 7000");
		            }
		}
		else 
		 {
			System.out.println("INCORRECT PASSWORD");
		 }
	    }
		else {
			System.out.println("INCORRRECT USERNAME");
		}
	}
	}
		

