import java.util.ArrayList;
import java.util.Stack;


public class Main {

    public static Stack < Function > RPNQueue = new Stack < Function > ();
    public static ArrayList < Function > funcs = new ArrayList < Function > ();

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // String input = InfixParser.parse("2*(x^2+2)");

        // Stack<Function> blaze = InfixParser.stringRPNToStack(input);

        // blaze = InfixParser.reverseStack(blaze);

        // try {
        //   InfixParser.crunchRPNStack(blaze);
        // } catch (OperatorOnlyException e) {
        //   // TODO Auto-generated catch block
        //   e.printStackTrace();
        // }


        // Function a = blaze.pop();

        // try {
        //   System.out.println(a.compute(5));
        // } catch (ArithmeticException | OperatorOnlyException e) {
        //   // TODO Auto-generated catch block
        //   e.printStackTrace();
        // }

        String input = InfixParser.parse("(2*(x^2+2))/6");
        System.out.println(input);

        ArrayList < Function > ghast = stringRPNtoList(input);
        System.out.println(ghast.size());

        Function a = RPNCruncher(ghast);

        try {
            System.out.println(a.compute(5));
        } catch (ArithmeticException | OperatorOnlyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    // Updated rpn parsing stuff - will update on tuesday in class
    public static ArrayList < Function > stringRPNtoList(String rpnInput) {

        ArrayList < Function > output = new ArrayList < Function > ();

        if (!rpnInput.substring(rpnInput.length() - 1, rpnInput.length()).equals(" ")) {
            rpnInput += " ";
        }

        while (rpnInput.indexOf(" ") >= 0) {
            String section = rpnInput.substring(0, rpnInput.indexOf(" "));

            if (Character.isDigit(section.charAt(0))) {
                output.add(new Function(Double.parseDouble(section)));
            } else if (Character.isAlphabetic(section.charAt(0))) {
                output.add(new Function(section.charAt(0) + ""));
            } else if (Function.validMultiComputeOperation(section) || Function.validSingleComputeOperation(section)) {
                output.add(new Function(section, true));
            }
            rpnInput = rpnInput.substring(rpnInput.indexOf(" ") + 1);
        }

        return output;

    }

    public static Function RPNCruncher(ArrayList < Function > rpnList) {
        Stack < Function > evalStack = new Stack < Function > ();

        int startSize = rpnList.size();

        for (int x = 0; x < startSize; x++) {

            evalStack.push(rpnList.remove(0));

            int stackSize = evalStack.size();
            if (stackSize >= 2) {

                Function last = evalStack.pop();

                if (!last.isOperator()) {
                    evalStack.push(last);
                    continue;
                }

                Function secondLast = evalStack.pop();

                try {
                    if (Function.validSingleComputeOperation(last.getOperator())) {
                        evalStack.push(new Function(secondLast, last));
                    } else if (Function.validMultiComputeOperation(last.getOperator()) && stackSize >= 3) {
                        Function thirdLast = evalStack.pop();
                        evalStack.push(new Function(thirdLast, secondLast, last));
                    }
                } catch (OperatorOnlyException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return evalStack.pop();

    }



}