import java.util.Scanner; // Import the Scanner class for user input

public class encrypt{

    /**
     * Encrypts a given text using the Caesar cipher.
     *
     * @param text The plaintext to be encrypted.
     * @param key  The integer shift key.
     * @return The encrypted ciphertext.
     */
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) { // Check if the character is an alphabet letter
                char startChar;
                if (Character.isUpperCase(character)) {
                    startChar = 'A';
                } else {
                    startChar = 'a';
                }

                // Calculate the shifted character
                // (character - startChar) converts char to 0-25 range
                // + key applies the shift
                // % 26 ensures wrap-around
                // + startChar converts back to ASCII value of shifted char
                char shiftedChar = (char) (startChar + (character - startChar + key) % 26);
                result.append(shiftedChar);
            } else {
                result.append(character); // Non-alphabetic characters remain unchanged
            }
        }
        return result.toString(); // Convert StringBuilder to String and return
    }

    /**
     * Decrypts a given text using the Caesar cipher.
     * Decryption is essentially encryption with a negative key,
     * or more specifically, (26 - key % 26) to handle wrap-around correctly for decryption.
     *
     * @param text The ciphertext to be decrypted.
     * @param key  The integer shift key used for encryption.
     * @return The decrypted plaintext.
     */
    public static String decrypt(String text, int key) {
        // A simple way to decrypt is to encrypt with a key that shifts in the opposite direction.
        // (26 - key % 26) ensures we get a positive shift equivalent for decryption.
        // For example, if key is 3, (26 - 3) = 23. Shifting forward by 23 is same as shifting backward by 3.
        return encrypt(text, (26 - (key % 26)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Caesar Cipher Program (Java)");
        System.out.println("----------------------------");

        while (true) {
            System.out.print("Do you want to (E)ncrypt, (D)ecrypt, or (Q)uit? ");
            String choice = scanner.nextLine().toUpperCase(); // Read user choice and convert to uppercase

            if (choice.equals("Q")) {
                System.out.println("Exiting program.");
                break; // Exit the loop
            } else if (choice.equals("E")) {
                System.out.print("Enter the message to encrypt: ");
                String message = scanner.nextLine();
                System.out.print("Enter the shift key (an integer): ");
                try {
                    int shiftKey = Integer.parseInt(scanner.nextLine()); // Parse string input to int
                    String encryptedMessage = encrypt(message, shiftKey);
                    System.out.println("Encrypted message: " + encryptedMessage);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid key. Please enter an integer.");
                }
            } else if (choice.equals("D")) {
                System.out.print("Enter the message to decrypt: ");
                String message = scanner.nextLine();
                System.out.print("Enter the shift key (an integer): ");
                try {
                    int shiftKey = Integer.parseInt(scanner.nextLine());
                    String decryptedMessage = decrypt(message, shiftKey);
                    System.out.println("Decrypted message: " + decryptedMessage);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid key. Please enter an integer.");
                }
            } else {
                System.out.println("Invalid choice. Please enter E, D, or Q.");
            }
            System.out.println(); // Add a newline for better readability between turns
        }

        scanner.close(); // Close the scanner to release resources
    }
}