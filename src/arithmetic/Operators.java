/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 *
 * @author EthoKurza
 */
public class Operators {
    public enum Operator {PLUS,MINUS,TIMES,DIVIDE};
    private final Operator operator;
    
    public Operators(Operator op){
        this.operator = op;
    }
    
    public Operator getOP(){
        return this.operator;
    }
    
    
}
