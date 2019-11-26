package Calc;
import java.util.*;
public class Run {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);

		int Inum1;
		int Inum2;
		int InumSq;
		String num1 = "1";
		String num2 = "1";
		String numSq = "1";
		
		Methods methodV = new Methods ();
		System.out.println("please enter the wanter operation type:");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.println("5: Square");
		String methodType = inp.nextLine();
		String operation = "5";
		switch (methodType){
			case "1":
				operation = "Add";
				break;
			case "2":
				operation = "Subtract";
				break;
			case "3":
				operation = "Multiply";
				break;
			case "4":
				operation = "Divide";
				break;
			case "5":
				operation = "Square";
				break;
		}
		
		switch (operation) {
		case "Square":
			System.out.println("please enter the number you would like to " + operation + ":");
			numSq = inp.nextLine();
			break;
		default:
			System.out.println("please enter the first number you would like to " + operation + ":");
			num1 = inp.nextLine();
			System.out.println("please enter the second number you would like to " + operation + ":");
			num2 = inp.nextLine();
			break;
		}

		
		Inum1 = Integer.parseInt(num1);
		Inum2 = Integer.parseInt(num2);
		InumSq = Integer.parseInt(numSq);
		
		methodV.mathOp(Inum1, Inum2, InumSq, operation);
		
		inp.close();
		
		
		
		
	}

}
