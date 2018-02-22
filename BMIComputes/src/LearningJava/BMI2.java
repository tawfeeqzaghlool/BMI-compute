// This program finds the body mass index (BMI) for two
// individuals

package LearningJava;

import java.util.*;

public class BMI2 {

	public static void main(String[] args) {
		
		System.out.println("This program reads data for two");
		System.out.println("People and computes their body");
		System.out.println("Mass index and weight status");
		System.out.println();
		
		
		Scanner console = new Scanner (System.in);
		
		System.out.println("Enter next person's information:\n");
		System.out.print("Height (in inches)?  ");
		double height1 = console.nextDouble();
		System.out.print("Weight (in pounds)?  ");
		double weight1 = console.nextDouble();
		double bmi1 = weight1 / (height1 * height1) * 703;
		
		System.out.println("\nEnter next person's information:\n");
		System.out.print("Height (in inches)?  ");
		double height2 = console.nextDouble();
		System.out.print("Weight (in pounds)?  ");
		double weight2 = console.nextDouble();
		double bmi2 = weight2 / (height2 * height2) * 703;
		
		System.out.printf("\nPerson #1 body mass index = %5.2f\n", bmi1);
		if(bmi1 < 18.5){
			System.out.println("Underweight");
		}else if(bmi1 < 25){
			System.out.println("Normal");
		}else if(bmi1 < 30){
			System.out.println("Overweight");
		}else{ // bmi1 >= 30 
			System.out.println("Obese");
		}
		
		System.out.printf("\nPerson #2 body mass index = %5.2f\n", bmi2);
		if(bmi2 < 18.5){
			System.out.println("Underweight");
		}else if(bmi2 < 25){
			System.out.println("Normal");
		}else if(bmi2 < 30){
			System.out.println("Overweight");
		}else{ // bmi2 >= 30 
			System.out.println("Obese");
		}

		console.close();
	}

}
