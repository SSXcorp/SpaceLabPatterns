package org.example.Behavioral.ChainOfResponsibility;

class LessThan1GBProcessor extends DiscProcessor {
    public LessThan1GBProcessor(DiscProcessor nextDiscProcessor) {
        super(nextDiscProcessor);
    }

    public void process(Disc request) {
        if (request.getSize() < 1000) {
            System.out.println("Processed by LessThan1GBProcessor : " + request.getSize());
        }
        else {
            super.process(request);
        }
    }
}

