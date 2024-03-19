package com.salesmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<Opportunity> opportunities;

    public Pipeline() {
        opportunities = new ArrayList<>();
    }

    public void addOpportunity(Opportunity opportunity) {
        opportunities.add(opportunity);
    }

    public List<Opportunity> getOpportunities() {
        return opportunities;
    }
}
