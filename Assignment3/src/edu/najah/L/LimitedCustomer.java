package edu.najah.L;

public class LimitedCustomer extends GeneralCustomer {

    private static final int MAX_ALLOWED_OFFER = 3;

    public void addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()){
            System.err.println("Limited customer can not add more that " + MAX_ALLOWED_OFFER + " offers" );
            return;
        }
        offers.add(offer);
    }


    private boolean isReachedMaxAllowedOffers() {
        return this.offers.size() >= MAX_ALLOWED_OFFER;
    }

}
