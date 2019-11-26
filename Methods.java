package Calc;
import java.util.*;
public class Methods {

	public Methods() {
	}
	
	int C;
	int num1;
	int num2;
	int numSq;
	String Method;
	
	public void mathOp(int A, int B, int Sq, String C) {
		this.num1 = A;
		this.num2 = B;
		this.numSq = Sq;
		this.Method = C;
		switch (Method) {
		case "Add":
			Add AnswerA = new Add();
			AnswerA.Operation(num1, num2);
			break;
		case "Subtract":
			Subtract AnswerS = new Subtract();
			AnswerS.Operation(num1, num2);
			break;
		case "Multiply":
			Multiply AnswerM = new Multiply();
			AnswerM.Operation(num1, num2);
			break;
		case "Divide":
			Divide AnswerD = new Divide();
			AnswerD.Operation(num1, num2);
			break;
		case "Square":
			Square AnswerSq = new Square();
			AnswerSq.Operation(numSq);
			break;
		default:
			System.out.println("operation invalid");
			break;
		}
	}
	
}
