import java.security.AlgorithmConstraints;

public class Home {
	public static void main(String args[]){
	
	
	
	//Example for immutable
    //Call to static function for immutable example
	//System.out.println(Immutable.Validate());
		
	/*
	//Call to a static function to reverse a phrase
	System.out.println(ArrayFunctions.ReversePhrase("My Name is Prathap"));
	
	//Call to static string builder
	System.out.println(ArrayFunctions.ReversePhraseSB("My Name is Prathap using SB"));
	
	//String to validate if it is chinese character or japaneese character
	System.out.println(ArrayFunctions.ReversePhraseChinJap("ABCabc")); */
    
	/*Call Two Calls to calculate the sum
		int [] numbers={4,7,2,30};
		int [] result =TwoSumArray.twoSum(numbers, 9); 
		if (result.length!=0)
		{
		  for (int i=0;i<=result.length-1;i++)
		  { 
			  System.out.println(result[i]);			  
		  }
		}*/
		
	//Get the factorial of a number
		
   ///Check if the given no is prime 
		boolean validate=Algorithms.checkPrimNo.validate(5);
		System.out.println(validate);
 }
}
