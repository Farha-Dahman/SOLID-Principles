package edu.najah.L;

import java.util.ArrayList;

public abstract  class GeneralCustomer {
    protected ArrayList<Offer> offers = null;

    public GeneralCustomer(){
        offers = new ArrayList<>();
    }

    public abstract void addOffers(Offer offer);

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

}
