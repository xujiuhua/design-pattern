package com.behavior.interpreter;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    //规则：Robert 和 John 是男性
    public static Expression maleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = maleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println(isMale.interpret("John"));
        System.out.println(isMarriedWoman.interpret("Married Julie"));
    }
}
