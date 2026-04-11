# E-commerce Test Automation Project

## Project Description
This project is a UI test automation framework built for Automation Exercise.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven

## Framework Features
- Page Object Model
- BaseTest structure
- Driver singleton management
- ConfigReader
- Explicit Wait

## Test Scenarios
- Successful login test
- Product search test
- Search results validation

## Project Structure
- pages
- tests
- utils

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Install Maven dependencies
4. Run TestNG test classes


## 🧪 Test Scenarios

| Test ID       | Test Name                      | Steps                                                                 | Expected Result                                             |
|---------------|--------------------------------|-----------------------------------------------------------------------|-------------------------------------------------------------|
| TC_LOGIN_001  | Successful Login               | Go to homepage → Click Login → Enter valid email & password → Login   | User logs in successfully and sees "Logged in as username"  |
| TC_LOGIN_002  | Username Verification          | Login with valid credentials                                          | Username is displayed correctly after login                 |
| TC_SEARCH_001 | Product Search                 | Go to Products → Enter "tshirt" → Click Search                        | "Searched Products" title is displayed                      |
| TC_SEARCH_002 | Search Result Visibility       | Search for a product                                                  | At least one product is listed                              |
| TC_NAV_001    | Navigate to Products Page      | Click on Products menu                                                | User is redirected to Products page (/products URL visible) |