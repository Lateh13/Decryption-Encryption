package encryptdecrypt;

import java.util.Scanner;

public class Main {

    // Encryption method, uses the Basic Latin unicode table

    public static void encryption(String message, int key) {
        String decrypt = "";
        for (char character : message.toCharArray()) {
            character += key;
            if (character > 126) {
                character -= 26;
            }
            decrypt += character;
        }
        System.out.println(decrypt);
    }

    // Decryption method, uses the Basic Latin unicode table

    public static void decryption(String message, int key) {
        String encrypt = "";
        for (char character : message.toCharArray()) {
            character -= key;
            if (character > 126) {
                character -= 26;
            }
            encrypt += character;
        }
        System.out.println(encrypt);
    }

    public static void main(String[] args) {

        // Initiating the scanner to be used for user input
        Scanner scanner = new Scanner(System.in);

        // User chooses between encrypting and decrypting a message
        System.out.println("If you would like to encrypt, please write enc.");
        System.out.println("If you choose to decrypt please write dec.");
        String function = scanner.nextLine().toLowerCase();

        // User chooses the integer number to be used as a key
        System.out.println("Choose a number to be used the key for encrypting or decrypting.");
        int key = Integer.valueOf(scanner.nextLine());

        // The message that needs to be encrypted or decrypted
        String message = scanner.nextLine();

        // If the user chose encryption, message and key will be used in the encryption method
        // Likewise, if the user chose decryption, the same information will be passed on to the decryption method
        if (function.equals("enc")) {
            encryption(message, key);
        } else if (function.equals("dec")) {
            decryption(message, key);
        } else {
            System.out.println("You did not choose encryption or decryption.");
        }
    }
}
