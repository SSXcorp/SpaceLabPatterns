package org.example.Behavioral.Visitor;

import org.example.Behavioral.Visitor.Models.Bank;
import org.example.Behavioral.Visitor.Models.Client;
import org.example.Behavioral.Visitor.Models.Company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("BCR_bank", "Tomahawk 293 street", "Number 12", 10),
                new Company("SSX_company", "Heroes 13 street", "Number 8", 1000)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
    }
}
