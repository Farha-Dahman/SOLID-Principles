package edu.najah.L;

public class Main {

    public static void main(String[] args) {

        GeneralCustomer cum2 = new LimitedCustomer();
        LimitedCustomer cum3 = new LimitedCustomer();


        Offer offer = new Offer();

        cum2.addOffers(offer);
        cum2.addOffers(offer);
        cum2.addOffers(offer);
        cum2.addOffers(offer);

        cum3.addOffers(offer);
        cum3.addOffers(offer);
        cum3.addOffers(offer);
        cum3.addOffers(offer);



        System.out.println("LimitedCustomer from father: "+ cum2.getOffers());
        System.out.println("LimitedCustomer from son: " + cum3.getOffers());

    }
}
