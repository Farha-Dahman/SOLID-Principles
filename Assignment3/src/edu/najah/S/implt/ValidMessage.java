package edu.najah.S.implt;

import edu.najah.S.MailMessage;
import edu.najah.S.intrf.IValidMessage;

public class ValidMessage implements IValidMessage {

    public boolean validation(MailMessage message) {
        if(message.getMailAddressFrom() == null || message.getMailAddressFrom().isEmpty() || !message.getMailAddressFrom().contains("@") || !message.getMailAddressFrom().contains(".")){
            return false;
        }
        if(message.getMailAddressTo() == null ||  message.getMailAddressTo().isEmpty() ||  !message.getMailAddressTo().contains("@") ||  !message.getMailAddressTo().contains(".")){
            return false;
        }
        if(message.getMailSubject() == null ||  message.getMailSubject().isEmpty() ||  message.getMailSubject().length() > 30){
            return false;
        }
        if(message.getMailBody() == null || message.getMailBody().isEmpty() ){
            return false;
        }
        return true;
    }

}
