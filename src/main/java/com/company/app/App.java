package com.company.app;

/**
 * Hello world!
 * Glad to say that
 */
public class App
{

    private final String message = "Hello World!";
    private final String pass = "qa !";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
