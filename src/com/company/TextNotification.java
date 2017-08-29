package com.company;


public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;


    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printSomeText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
    }
}
