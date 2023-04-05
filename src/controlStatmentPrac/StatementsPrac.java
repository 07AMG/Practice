package controlStatmentPrac;

public class StatementsPrac {

	public static void main(String[] args)
	{
		// BODY BUILDING COMPITION WEIGHT CRITERA
		float weight=35f;
		if(weight>40)
		{
			System.out.println("can play for 40kg round");
		}
		else if (weight<40) 
		{
			System.out.println("can not play for 40kg round ");
		} 
		else if (weight==40) 
		{
			System.out.println("can play the 40kg round");
		}
	
	 int points=12;
	 if (points>80) 
	 {
		System.out.println("gold medal");
	 }
	 else if (points>60) 
	 {
		 System.out.println("silver medal");
	}
	 else if (points>30) 
	 {
		System.out.println("bronze medal");
	}
	 else {
		System.out.println("participation certifcate");
	} 
	
	
	}

}
