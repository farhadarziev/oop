In this code, I created a User class that represents user data. This class has several attributes: userID, name, surname, email, password, and birthday. These attributes allow us to store all the necessary information about the user, including their unique identifier, first name, last name, email, password, and date of birth. In the constructor, we initialize the object by passing it userID, name, surname, birthday, email, and password. The class has a getDetails method that returns a formatted string with basic user information, and a getAge method that calculates the user's age based on their date of birth.

Then we created a UserService class that is responsible for managing users. It has a users attribute that is a dictionary where the key is the userId and the value is the user object. This allows us to conveniently store and quickly find users by their identifier. This class has several methods: addUser allows you to add a new user to the system, findUser searches for a user by userID and returns its object, deleteUser removes a user from the system. This class acts as a storage and user manager.

To make it easier to work with users, we have added the UserUtil class, which contains helper methods. There is a generateUserID method that creates a unique user ID using the current year and random numbers. The generatePassword method generates a secure password containing uppercase and lowercase letters, numbers, and special characters. To check passwords, there is an isStrongPassword method that evaluates whether the specified password meets security requirements. We also have a generateEmail method that creates an email in the format firstname.lastname@domain.com, and a validate_email method that checks whether the email is in the correct format.

All of these classes work together to form a complete user management system. User represents a single user, UserService stores and manages users, and UserUtil helps with data generation. For example, when creating a new user, generateUserID is called first, then generateEmail, after which generatePassword creates a strong password. This object is added to UserService, from where it can be retrieved at any time. If we need to find a user, we simply call findUser, and if we need to delete one, we call deleteUser. The result is a convenient and flexible system where user data is securely stored and easily managed, and helper methods automate routine tasks.


![Diagram](UML%20Diagram%20User.png)

![Diagram](UML%20Diagram%20USerService.png)

![Diagram](UML%20Diagram%20UserUtil.png)





