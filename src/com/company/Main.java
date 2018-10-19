package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner stringReaderForEncryption = new Scanner(System.in);
        Scanner stringReaderForDecryption = new Scanner(System.in);
        Scanner stringReaderForDecryptionTwo = new Scanner(System.in);
        Scanner intReader = new Scanner (System.in);
        int userLoop = -1;
        while (true) {

            System.out.println("\nEnter 0 to exit, 1 to encrypt a phrase, or 2 to decrypt a phrase.");
            userLoop = intReader.nextInt();


            if (userLoop == 1){
                System.out.println("Enter the phrase you want encrypted.");
                encryption userInput = new encryption(stringReaderForEncryption.nextLine());

                System.out.println(userInput.getEncryptedPhrase());
            }
            else if (userLoop == 2){
                encryption userDecrypt = new encryption(stringReaderForDecryption.nextLine());
                System.out.println("Enter the phrase you want decrypted.");
                String encryptedPhrase = stringReaderForDecryptionTwo.next();
                System.out.println("Enter the key to decrypt your phrase.");
                int userKey = intReader.nextInt();

                System.out.println(userDecrypt.getDecryptedPhrase(encryptedPhrase, userKey));
            }
            else {
                break;
            }



        }
        System.out.println("cya");
        System.exit(0);
    }
}
