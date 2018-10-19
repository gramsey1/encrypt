package com.company;

/**
 * Created by bb222 on 10/15/18.
 */
class encryption {
    String userPhrase = "";
    String userPhraseEncrypted = "";
    int decryptKey = -1;



    public encryption(String x){
        userPhrase = x;


        decryptKey = (int) (Math.random() * 10000);
        while ((decryptKey % 10 == 0)) {
            decryptKey = (int) (Math.random() * 10000);
        }
        //forces key to not be something that would not change the encrypted message to decrypted
    }


    private String encryptMethod(){



        for(int i = 0; i < userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userPhraseEncrypted += (char)(ASCIIchar + (decryptKey % 10));
        }

        return userPhraseEncrypted;


    }

    public String getEncryptedPhrase(){

        return "Your encrypted phrase is: " + encryptMethod() + "\nYour decrypt key for this message is: " + decryptKey;
    }


    private String decryptMethod(String userPhrase, int key){
        String userPhraseDecrypted = "";

        for(int i = 0; i < userPhrase.length(); i++){
            char currentChar = userPhrase.charAt(i);
            int ASCIIchar = (int) currentChar;
            userPhraseDecrypted += (char)(ASCIIchar - (key % 10));
        }

        return userPhraseDecrypted;
    }

    public String getDecryptedPhrase(String userPhrase, int key){
        return "Your decrypted phrase is: " + decryptMethod(userPhrase, key);
    }


}


