import java.util.ArrayList;
import java.util.Stack;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Main {

  public static Stack<Function> RPNQueue = new Stack<Function>();
  public static ArrayList<Function> funcs = new ArrayList<Function>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    String input = InfixParser.parse("1/x");

    Stack<Function> blaze = InfixParser.stringRPNToStack(input);

    blaze = InfixParser.reverseStack(blaze);

    try {
      InfixParser.crunchRPNStack(blaze);
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // try {
    //   System.out.println(blaze.pop().compute(5));
    // } catch (ArithmeticException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // } catch (OperatorOnlyException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    Function a = blaze.pop();

    try {
      System.out.println(a.compute(5));
    } catch (ArithmeticException | OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // try {
    //   System.out.println(Algebra.bisectionZeros(a, -3, -1));
    // } catch (InvalidInputsException | ArithmeticException | OperatorOnlyException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    // try {
    //   System.out.println(Algebra.computeZeros(a, 1));
    // } catch (InvalidInputsException | ArithmeticException | OperatorOnlyException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

	}
			



}
