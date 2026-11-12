# Contract installment simulator

Java console application that calculates contract installments from the contract value, date and number of payments.

## Features

- Reads contract details from the terminal.
- Calculates installment due dates and amounts.
- Separates entities, contract processing and fee calculation.
- Defines a payment strategy through the OnlinePaymentService interface.

## Run locally

Requires JDK 17 or a version compatible with the APIs used.

```bash
javac -encoding UTF-8 -d out src/application/Program.java src/entities/*.java src/services/*.java
java -cp out application.Program
```

Enter dates as dd/MM/yyyy and use a decimal point for amounts.

## Structure

- `entities/`: contracts and installments.
- `services/`: processing and fee strategy.
- `application/Program.java`: terminal entry point.

## Scope

An exercise in object-oriented programming and dependency injection. PaypalService simulates fee rules; it does not call the PayPal API or generate contract documents.
