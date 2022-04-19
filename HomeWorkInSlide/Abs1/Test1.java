package HomeWorkInSlide.Abs1;

import Study_WebJava.main;

public class Test1 {
    public static void main(String[] args) {
        Animals a1 = new Dog("BI");
        Dog a2 = new Dog("BI1");

        a1.greets();

        a2.greets(a2);
    }
}
