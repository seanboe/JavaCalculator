public class Runner {

    public static void main(String[] args) {

        Function variable = new Function("x"); 
        Function actualFunction = new Function(variable, "^"); 

        System.out.println(Calculus.computeLeftSideLimitNOUNDEFINEDCHECK(actualFunction, 3.0)); 


    }


    
}
