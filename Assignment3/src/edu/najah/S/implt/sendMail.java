package edu.najah.S.implt;

import edu.najah.S.MailMessage;
import edu.najah.S.intrf.IsendMail;

public class sendMail implements IsendMail {

    public void InvoiceMail(MailMessage message) {

        if (message.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
        }
    }

}
