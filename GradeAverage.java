import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        
        Scanner grade1 = new Scanner(System.in);
		
		//Lessons
		
		float math , phys , chem , bio , eng , average;
		
		//Grade Inputs
		System.out.print("Math grade : ");
		math = grade1.nextFloat();
		
		System.out.print("Physics grade :");
		phys = grade1.nextFloat();
		
		System.out.print("Cemistry grade :");
		chem = grade1.nextFloat();
		
		System.out.print("Biology grade : ");
		bio = grade1.nextFloat();
		
		System.out.print("English grade :");
		eng = grade1.nextFloat();
		
        grade1.close();
        
		average = (math + phys + chem + bio + eng)/5;
		
		System.out.print("Your Average : " + average);


    }

    
}