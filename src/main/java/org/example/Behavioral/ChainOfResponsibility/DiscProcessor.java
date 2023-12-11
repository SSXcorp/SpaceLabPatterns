package org.example.Behavioral.ChainOfResponsibility;

abstract class DiscProcessor {
    private DiscProcessor nextDiscProcessor;

    public DiscProcessor(DiscProcessor nextDiscProcessor) {
        this.nextDiscProcessor = nextDiscProcessor;
    }

    public void process(Disc request) {
        if(nextDiscProcessor != null)
            nextDiscProcessor.process(request);
    }
}
