package com.siemens;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String name = "Naveen";
       Runnable runnable = () -> {
           for (char ch : name.toCharArray()) {
               System.out.println(ch);
               try {
                   Thread.sleep(2000);
               } catch(InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       };

       Thread thread = new Thread(runnable);
       thread.start();
    }
}