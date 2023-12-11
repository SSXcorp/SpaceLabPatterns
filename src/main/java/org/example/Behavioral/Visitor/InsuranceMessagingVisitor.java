package org.example.Behavioral.Visitor;

import org.example.Behavioral.Visitor.Models.Bank;
import org.example.Behavioral.Visitor.Models.Client;
import org.example.Behavioral.Visitor.Models.Company;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    public void visit(Bank bank) {
        System.out.println("Sending mail about theft insurance to " + bank.getName());
    }

    public void visit(Company company) {
        System.out.println("Sending employees and equipment insurance mail to " + company.getName());
    }

}
