package edu.najah.S.implt;

import edu.najah.S.Invoice;
import edu.najah.S.intrf.IdeleteInvoice;

public class deleteInvoice implements IdeleteInvoice {
    public void deleteFromDB(Invoice invoice) {
        // connect to database
        // execute delete command to delete the invoice from the database
        //close the database connection
    }
}
