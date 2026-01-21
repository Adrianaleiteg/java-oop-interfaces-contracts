# Contract Installments Processing - Java

This project is a simple Java application developed to practice **interfaces and object-oriented programming** concepts.

The application processes a contract and generates its installments based on a chosen number of months, using an online payment service.

## 🧠 Concepts Practiced

- Interfaces
- Object-Oriented Programming (OOP)
- Dependency inversion
- Date manipulation
- Simple interest and payment fees calculation

## 📋 Problem Description

A company wants to automate the processing of its contracts.

Each contract must be divided into monthly installments.  
An online payment service is used to calculate fees and interest.

For this project, the PayPal service is used with the following rules:
- 1% simple monthly interest per installment
- 2% payment fee per installment

The program reads:
- Contract number
- Contract date
- Total contract value
- Number of installments

Then it generates the installments with their respective dates and values.

## 🛠️ Technologies Used

- Java
- LocalDate
- Interfaces

## 📦 Project Structure

- `Contract` – Represents the contract data
- `Installment` – Represents each contract installment
- `OnlinePaymentService` – Interface for payment services
- `PaypalService` – Implementation of the payment service
- `ContractService` – Handles the installment generation logic

## 🚀 How to Run

1. Clone the repository
2. Compile and run the application
3. Enter the contract data as requested in the console

## 🎯 Purpose

This project was created for **learning purposes**, focusing on applying interfaces and clean design in Java.

---

👨‍💻 Developed by Adriana
