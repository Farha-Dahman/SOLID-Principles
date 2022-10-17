package edu.najah.L;


public class Customer extends GeneralCustomer {

    @Override
    public void addOffers(Offer offer) {
        offers.add(offer);
    }
}
