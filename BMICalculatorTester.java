package Dec_28_MultithreadingExam.BMICalculator;

import java.util.Scanner;

public class BMICalculatorTester 
{
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);
	        try 
	        {
	            System.out.print("Enter weight (kg): ");
	            double weight = Double.parseDouble(sc.nextLine());

	            System.out.print("Enter height (m): ");
	            double height = Double.parseDouble(sc.nextLine());

	            double bmi = BMICalculator.calculateBMI(weight, height);
	            System.out.println("Your BMI is: " + bmi);
	        } 
	        catch (NumberFormatException e) 
	        {
	            System.out.println("Invalid input: Numeric value expected for weight and height.");
	        } 
	        catch (RuntimeException e) 
	        {
	            System.out.println(e.getMessage());
	        } 
	        sc.close();
	    }
}
