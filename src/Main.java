import java.util.ArrayList;
import java.util.Stack;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Main {

  public static Stack<Function> RPNQueue = new Stack<Function>();
  public static ArrayList<Function> funcs = new ArrayList<Function>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//////////

    // Function num1 = new Function("x");
    // Function num2 = new Function(2);
    // Function func = new Function(num1, num2, "^");

    // Function a = new Function("x");
    // Function b = new Function(3);
    // Function c = new Function(a, b, "^");
    // Function d = new Function(10);
    // Function e = new Function(c, d, "-");
    // Function f = new Function(3);
    // Function g = new Function(e, f, "^");


    Function q = new Function("x");
    Function w = new Function(2);
    Function k = new Function("-", true);
    Function func = new Function(q, w, k);

    try {
      System.out.println(func.compute(10));
    } catch (ArithmeticException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }





    String input = InfixParser.parse("x");

    Stack<Function> blaze = InfixParser.stringRPNToStack(input);

    blaze = InfixParser.reverseStack(blaze);

    try {
      InfixParser.crunchRPNStack(blaze);
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

      Function f = blaze.pop();

      try {
        System.out.println(Algebra.bisectionZeros(f, -5, -1));
      } catch (InvalidInputsException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (ArithmeticException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (OperatorOnlyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

	}
			



}
