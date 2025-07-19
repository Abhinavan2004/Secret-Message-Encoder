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

* **Language:** [PYTHON/JAVA] *(Please specify which language you used, e.g., Python or Java)*
* **Runtime/JDK:** [Python 3.x / Java JDK x] *(e.g., Python 3.9 or Java JDK 17)*

## Getting Started

Follow these steps to get the project up and running on your local machine.

### Prerequisites

* **[Python/Java]**:
    * Ensure you have the correct version installed for the language you used (e.g., Python 3.x or Java JDK x) or newer.
    * You can download it from:
        * For Python: `https://www.python.org/downloads/`
        * For Java: `https://www.oracle.com/java/technologies/downloads/`

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

#### If you used [Python]:

1.  **Execute the script:**
    ```bash
    python caesar_cipher.py # Adjust filename if different, e.g., main.py
    ```

#### If you used [Java]:

1.  **Compile the Java code:**
    ```bash
    javac CaesarCipher.java # Adjust filename if different, e.g., Main.java
    ```
2.  **Run the compiled program:**
    ```bash
    java CaesarCipher # Adjust class name if different
    ```

### Usage

Once the program is running, you will be prompted to choose an action:



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

* **GUI (Graphical User Interface):** Implement a desktop application using libraries like Tkinter (Python) or Swing/JavaFX (Java).
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