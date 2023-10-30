# Selenium Automation with Java

This repository contains a Java class (`Selenium.java`) that demonstrates basic web automation using Selenium WebDriver.

## Description

The `Selenium` class showcases typical actions conducted in an e-commerce scenario using Selenium. It includes methods for logging in, selecting items, accessing the shopping cart, and initiating the checkout process.

## Prerequisites

To run this automation script, ensure you have the following installed:

- Java Development Kit (JDK)
- Selenium WebDriver
- Firefox browser
- GeckoDriver (for Firefox)

## Setup

1. **Environment Configuration:**
   - Install the JDK.
   - Download the Selenium WebDriver Java bindings.
   - Set up GeckoDriver for Firefox.

2. **Usage:**
   - Modify the `System.setProperty` line within the main method to point to the location of the GeckoDriver executable on your system.

   Example:
   ```java
   System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
