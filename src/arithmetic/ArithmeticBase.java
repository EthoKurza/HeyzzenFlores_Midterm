/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
 public double x,y;
    double calculate(double x, double y) {
        /*Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String s= sc.next();
        switch (s.toUpperCase()) {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
        */
        
        Operators op[] = new Operators[4];
        int count=0;
        for(Operators.Operator o: Operators.Operator.values() ){
            op[count] = new Operators(o);
            count++;
        }
        
        int randNum = (int)(Math.random()*(3-0)+1); //generate random number
        
        if(op[randNum].getOP().equals(Operators.Operator.PLUS)){
            return x + y;
        }
        else if(op[randNum].getOP().equals(Operators.Operator.MINUS)){
            return x - y;
        }
        else if(op[randNum].getOP().equals(Operators.Operator.TIMES)){
            return x * y;
        }
        else if(op[randNum].getOP().equals(Operators.Operator.DIVIDE)){
            return x / y;
        }
        else{
            return 0;
        }

        
        
        
        
        
    }//end of function
   
}
