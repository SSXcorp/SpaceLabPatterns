package org.example.Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        CDCheckerChain CDCheckerChain = new CDCheckerChain();

        Disc d1 = new CDDisc(200);
        d1.discInfo();
        CDCheckerChain.process(d1);
        Disc d2 = new CDDisc(800);
        d1.discInfo();
        CDCheckerChain.process( d2);
        Disc d3 = new CDDisc(2000);
        d1.discInfo();
        CDCheckerChain.process(d3);
    }
}
