package edu.najah.S;

import edu.najah.S.implt.ValidMessage;

public class MailMessage {

    public String getMailAddressFrom() {
        return mailAddressFrom;
    }

    public void setMailAddressFrom(String mailAddressFrom) {
        this.mailAddressFrom = mailAddressFrom;
    }

    private String mailAddressFrom;

    public String getMailAddressTo() {
        return mailAddressTo;
    }

    public void setMailAddressTo(String mailAddressTo) {
        this.mailAddressTo = mailAddressTo;
    }

    private String mailAddressTo;

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    private String mailSubject;

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    private String mailBody;

    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        //Validate the input (email)
        if(mailAddressFrom != null && !mailAddressFrom.isEmpty() && mailAddressFrom.contains("@") && mailAddressFrom.contains(".")){
            this.mailAddressFrom =  mailAddressFrom;
        }

        //Validate the input (email)
        if(mailAddressTo != null && !mailAddressTo.isEmpty() && mailAddressTo.contains("@") && mailAddressTo.contains(".")){
            this.mailAddressTo =  mailAddressTo;
        }

        //Validate the input
        if(mailSubject != null && !mailSubject.isEmpty() && mailSubject.length() <= 30){
            this.mailSubject =  mailSubject;
        }

        //Validate the input
        if(mailBody != null && !mailBody.isEmpty() ){
            this.mailBody =  mailBody;
        }
    }

    private ValidMessage isValidMessage;

    public boolean isValidMessage() {
        return isValidMessage.validation(this);
    }

}