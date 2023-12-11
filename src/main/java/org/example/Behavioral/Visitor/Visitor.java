package org.example.Behavioral.Visitor;

import org.example.Behavioral.Visitor.Models.Bank;
import org.example.Behavioral.Visitor.Models.Company;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

}
