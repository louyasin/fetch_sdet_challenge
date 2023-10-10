# Gold Bar Challenge Automation

This project automates the Gold Bar Challenge, a simple web-based game, using Selenium WebDriver in Java.
The Gold Bar Challenge involves weighing gold bars to find the one with a different weight using a balance scale.
The automation script interacts with the game's web interface to simulate the gameplay.

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or later)
- Maven installed
- Chrome web browser installed
- Selenium java version 3.141.59
- Webdrivermanager version 5.5.3

## Setup

1. Clone this repository to your local machine.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).
3. Make sure you have the necessary dependencies configured in your Maven `pom.xml` file.

## Usage

1. Run the `goldBar` class to start the automation script.
2. The script will open the Gold Bar Challenge web page.
3. It will enter weights for gold bars on the left and right sides.
4. It will perform a weighing operation and reset the weights.
5. Depending on the comparison result ('<', '>', or '='), the script will choose the appropriate gold bar.

## Code Structure

- `goldBar` class: The main entry point for the automation script.
- `goldBarPage` class: Contains page objects and elements for interacting with the web page.
- `Driver` class: Provides WebDriver instance setup.
- `Waiter` class: Provides utility methods for waiting.

