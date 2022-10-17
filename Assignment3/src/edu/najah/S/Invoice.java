package edu.najah.S;

import edu.najah.S.intrf.IaddInvoice;
import edu.najah.S.intrf.IdeleteInvoice;
import edu.najah.S.intrf.IsendMail;

import java.util.Date;

/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice {

    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    private IaddInvoice append;
    private IdeleteInvoice deletion;
    private IsendMail sendMail;

    public void delete()  {
        deletion.deleteFromDB(this);
    }

    public void add()  {
        append.addOnDB(this);
        // Once Invoice has been added , send mail
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        this.sendEmail(mailMessage);
    }

    public void sendEmail(MailMessage message)  {
        sendMail.InvoiceMail(message);
    }



}