package org.example.Behavioral.Interpreter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("Oleg");
        Expression person2 = new TerminalExpression("Kirill");
        Expression ORcorrectName = new OrExpression(person1, person2);
        System.out.println(ORcorrectName.interpreter("Oleg"));

        System.out.println("==================================================");

        Expression person3 = new TerminalExpression("Oleg");
        Expression person4 = new TerminalExpression("Oleg");

        Expression ANDcorrectName = new AndExpression(person3, person4);
        System.out.println(ANDcorrectName.interpreter("Oleg"));
        List ld = List.of("23");
        System.out.println("==================================================");

        Expression person5 = new TerminalExpression("Vasil");
        Expression person6 = new TerminalExpression("Kirill");
        Expression ORcorrectNameNegative = new OrExpression(person5, person6);
        System.out.println(ORcorrectNameNegative.interpreter("Oleg"));

        System.out.println("==================================================");

        Expression person8 = new TerminalExpression("Vasil");
        Expression person7 = new TerminalExpression("Kirill");
        Expression ANDcorrectNameNegative = new AndExpression(person7, person8);
        System.out.println(ANDcorrectNameNegative.interpreter("Vasil"));
    }
}
