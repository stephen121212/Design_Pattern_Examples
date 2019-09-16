/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpattern;

/**
 *
 * @author Stephen
 */
public class InterpreterPattern {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");
        
        Expression alternation1 = new AndExpression(terminal2, terminal3);
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        
        return new AndExpression(terminal3, alternation2);
    }
    
    public static void main(String[] args) {
        //String context = "Lions";
        //String context = "Tigers";
        //String context = "Bears";
        String context = "Tigers Bears";
        
        Expression define = buildInterpreterTree();
        
        System.out.println(context + "is" + define.interpret(context));
    }
    
}
