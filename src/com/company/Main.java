package com.company;

public class Main {

    public static void main(String[] args) {
        EmailNotification email = new EmailNotification("email subject", "email body", "email recipient", "email smtp Provider");
        TextNotification text = new TextNotification("text subject", "text body", "text recipient", "text sms Provider");

        Object clone = email.clone();

        email.transport();
        text.transport();
        email.showStatus();
        text.showStatus();
        email.printSomeText();
        System.out.println(clone);

        System.out.println(email.equals(clone));
    }


}
