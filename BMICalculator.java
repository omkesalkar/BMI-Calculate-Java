package Dec_28_MultithreadingExam.BMICalculator;

public class BMICalculator
{
	 public static double calculateBMI(double weight, double height) throws NumberFormatException, IllegalArgumentException, RuntimeException 
	 {
	        if (weight <= 0 || height <= 0)
	        {
	            throw new IllegalArgumentException("Invalid input: Weight and height must be positive values.");
	        }
	        
	        if (height > 3)
	        {
	            throw new RuntimeException("Invalid input: Height exceeds realistic human range.");
	        }
	       
	        double bmi = weight / (height * height);
	        return Math.round(bmi * 100.0) / 100.0; 
	    }

}
