package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbInput1 = new Scanner(System.in);
        System.out.println("type in a word");
        String nombre= kbInput1.next();

        word myCryptObj = new word(nombre, 0);
        String encryptSntnc = myCryptObj.encrypt(sntnc);
        System.out.println(encryptSntnc);

        String decryptSntnc = myCryptObj.decrypt(encryptdSntnc);
        System.out.println(decryptSntnc);
    }
}
