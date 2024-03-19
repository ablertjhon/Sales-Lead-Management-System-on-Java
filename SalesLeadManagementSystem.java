package com.salesmanagement;

import com.salesmanagement.model.Lead;
import com.salesmanagement.model.Opportunity;
import com.salesmanagement.model.Pipeline;

public class SalesLeadManagementSystem {
    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline();

        // Adding leads and opportunities
        Lead lead1 = new Lead("John Doe", "john@example.com", "123-456-7890");
        Lead lead2 = new Lead("Jane Smith", "jane@example.com", "987-654-3210");

        Opportunity opportunity1 = new Opportunity("Opportunity 1", 5000.0);
        Opportunity opportunity2 = new Opportunity("Opportunity 2", 8000.0);

        pipeline.addOpportunity(opportunity1);
        pipeline.addOpportunity(opportunity2);

        // Displaying opportunities
        System.out.println("Opportunities in Pipeline:");
        for (Opportunity opportunity : pipeline.getOpportunities()) {
            System.out.println("Name: " + opportunity.getName());
            System.out.println("Amount: $" + opportunity.getAmount());
            System.out.println("Closed: " + (opportunity.isClosed() ? "Yes" : "No"));
            System.out.println();
        }

        // Closing an opportunity
        opportunity1.markClosed();
        System.out.println("Opportunity 1 closed.");
    }
}
