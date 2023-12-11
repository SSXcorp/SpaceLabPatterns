package org.example.Behavioral.ChainOfResponsibility;

public class CDCheckerChain {
    DiscProcessor chain;

    public CDCheckerChain() {
        buildChain();
    }

    private void buildChain() {
        System.out.println("Creating new chain");
        chain = new LessThan500MBProcessor(new LessThan1GBProcessor(new MoreThan1GBProcessor(null)));
    }

    public void process(Disc request) {
        chain.process(request);
    }

}