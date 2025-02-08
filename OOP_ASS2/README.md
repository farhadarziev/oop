In this code we created the Amount class is used to represent a transaction. It has three attributes: amount for the transaction value, timestamp for the date and time when the transaction occurs, and transaction_type to indicate whether the transaction is a deposit or a withdrawal. The class has a constructor that initializes these attributes, and a __str__ method that returns a readable string combining the transaction type, amount, and timestamp.

The PersonalAccount class represents a bank account. It includes attributes like account_number, account_holder, balance, and a list of transactions. The class provides several methods: deposit to add money to the account, withdraw to subtract money (if there's enough balance), and printTransactionHistory to display all transactions. There are also methods to retrieve the account number and holder name, as well as methods to add and subtract amounts from the balance using shortcuts addAmount and subtractAmount.

In the main program, the user inputs their account details, and the program presents a menu with options to deposit money, withdraw money, check the balance, view the transaction history, or exit. Based on the user's choice, the corresponding action is performed. The program continues running until the user chooses to exit. This code simulates basic banking functionality for managing an account's balance and transactions.







