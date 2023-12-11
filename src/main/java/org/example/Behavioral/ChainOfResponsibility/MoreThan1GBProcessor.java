package org.example.Behavioral.ChainOfResponsibility;

class MoreThan1GBProcessor extends DiscProcessor {

    public MoreThan1GBProcessor(DiscProcessor nextDiscProcessor) {
        super(nextDiscProcessor);
    }

    public void process(Disc request) {
        if (request.getSize() > 1000) {
            System.out.println("Processed by MoreThan1GBProcessor : " + request.getSize());
        }
        else {
            super.process(request);
        }
    }
}
