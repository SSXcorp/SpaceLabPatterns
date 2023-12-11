package org.example.Behavioral.ChainOfResponsibility;

class LessThan500MBProcessor extends DiscProcessor
{
    public LessThan500MBProcessor(DiscProcessor nextDiscProcessor) {
        super(nextDiscProcessor);

    }

    public void process(Disc request) {
        if (request.getSize() < 500) {
            System.out.println("Processed by LessThan500MBProcessor : " + request.getSize());
        }
        else {
            super.process(request);
        }
    }
}

