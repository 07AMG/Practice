package variablePrac;

public class Coach {
static String college="COLLEGE OF ENNG TECH AMRAVTI";
	public static void main(String[] args) 
	{
		System.out.println(college);
		Staff Ravi=new Staff();
		Ravi.stu_name="VIRAT";
		Ravi.stu_roll=1212;
		Ravi.stu_weight=30.23f;
		Ravi.stu_aadhar=121212121212l;
		Ravi.stu_info();
		
		Staff Sam=new Staff();
		Sam.stu_name="DHONI";
		Sam.stu_roll=07;
		Sam.stu_weight=40.52f;
		Sam.stu_aadhar=2121212121211l;
		Sam.stu_info();
		
		Staff Ram=new Staff();
		Ram.stu_name="BRAVO";
		Ram.stu_roll=1321;
		Ram.stu_weight=39.20f;
		Ram.stu_aadhar=34343434343l;
		Ram.stu_info();

	}

}
