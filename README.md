# Secret-Message-Encoder

![GitHub last commit](https://img.shields.io/github/last-commit/Abhinavan2004/Secret-Message-Encoder)
![GitHub top language](https://img.shields.io/github/languages/top/Abhinavan2004/Secret-Message-Encoder)
![GitHub repo size](https://img.shields.io/github/repo-size/Abhinavan2004/Secret-Message-Encoder)

## Overview

This repository hosts a simple command-line tool designed for basic text encryption and decryption using the **Caesar Cipher** algorithm. Developed as a foundational project for cybersecurity beginners, it demonstrates the core concepts of symmetric encryption in an easy-to-understand manner.

Whether you want to send a "secret" note to a friend or simply explore how early ciphers worked, this tool provides a hands-on introduction to classical cryptography.

## Features

* **Encryption:** Transform readable plaintext into scrambled ciphertext.
* **Decryption:** Convert ciphertext back into its original readable form using the correct key.
* **Caesar Cipher Algorithm:** Utilizes the classic shift cipher for simplicity and educational purposes.
* **User-Friendly Interface:** Interactive command-line prompts for easy input and output.
* **Case Preservation:** Maintains the original casing of alphabetic characters.
* **Non-Alphabetic Character Handling:** Non-letters (numbers, spaces, symbols) remain unchanged.
## Technology Stack

* **Language:** Java
* **JDK:** [Java JDK x] *(e.g., Java JDK 17 or Java JDK 21)*

## Getting Started

Follow these steps to get the project up and running on your local machine.

### Prerequisites

* **Java Development Kit (JDK)**:
    * Ensure you have a Java JDK (e.g., JDK 17 or newer) installed.
    * You can download it from: `https://www.oracle.com/java/technologies/downloads/`

### Installation

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Abhinavan2004/Secret-Message-Encoder.git](https://github.com/Abhinavan2004/Secret-Message-Encoder.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Secret-Message-Encoder
    ```

### How to Run

1.  **Compile the Java code:**
    ```bash
    javac CaesarCipher.java # Assuming your main Java file is named CaesarCipher.java
    ```
2.  **Run the compiled program:**
    ```bash
    java CaesarCipher # Assuming your main class is named CaesarCipher
    ```

### Usage

Once the program is running, you will be prompted to choose an action:

Caesar Cipher Program (Java)
Do you want to (E)ncrypt, (D)ecrypt, or (Q)uit?


* Enter `E` to **Encrypt** a message.
* Enter `D` to **Decrypt** a message.
* Enter `Q` to **Quit** the program.

You will then be asked for the message and the integer shift key.

**Example Interaction:**

Do you want to (E)ncrypt, (D)ecrypt, or (Q)uit? E
Enter the message to encrypt: HELLO WORLD
Enter the shift key (an integer): 3
Encrypted message: KHOOR ZRUOG

Do you want to (E)ncrypt, (D)ecrypt, or (Q)uit? D
Enter the message to decrypt: KHOOR ZRUOG
Enter the shift key (an integer): 3
Decrypted message: HELLO WORLD

Do you want to (E)ncrypt, (D)ecrypt, or (Q)uit? Q
Exiting program.


## How the Caesar Cipher Works

The Caesar cipher is a simple substitution cipher where each letter in the plaintext is replaced by a letter some fixed number of positions down or up the alphabet. The number of positions shifted is called the "key".

* **Encryption:** $C_i = (P_i + \text{Key}) \pmod{26}$
* **Decryption:** $P_i = (C_i - \text{Key}) \pmod{26}$

Where:
* $C_i$ is the numerical position of the ciphertext character (A=0, B=1, ... Z=25).
* $P_i$ is the numerical position of the plaintext character.
* $\text{Key}$ is the shift value.
* $\pmod{26}$ ensures the result wraps around the alphabet.

## Future Enhancements (Ideas)

* **GUI (Graphical User Interface):** Implement a desktop application using libraries like Swing or JavaFX.
* **Advanced Ciphers:** Add support for other classical ciphers (e.g., Vigenere Cipher, Atbash Cipher).
* **File I/O:** Allow users to encrypt/decrypt text directly from files.
* **Brute-Force Attack:** Include an option to attempt brute-force decryption for known weak ciphers like the Caesar cipher.
* **Input Validation:** More robust error handling for user inputs.

## Contributing

This project is a personal learning endeavor, but feel free to explore, fork, and experiment with the code. If you have suggestions or find issues, you can open an issue on this repository.

## License

This project is open-source and available under the [MIT License](LICENSE.md). *(You'll need to create a `LICENSE.md` file in your repository with the MIT License text if you choose this.)*

## Contact

* **GitHub:** [Abhinavan2004](https://github.com/Abhinavan2004)
* **Email:** [Your Email (Optional)]
* **LinkedIn:** [Your LinkedIn Profile URL (Optional)]