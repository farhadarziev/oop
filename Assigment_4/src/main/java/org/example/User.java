package org.example;

import java.time.LocalDate;;
import java.time.format.DateTimeFormatter;
import java.time.Period;



public class User {
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDate birthday;
    public User(int newUserId, String newName, String newSurname, String newEmail, String newPassword, LocalDate newBirthday) {
        userId = newUserId;
        name = newName;
        surname = newSurname;
        email = newEmail;
        password = newPassword;
        birthday = newBirthday;
    }

    public int getUserId() {
        return userId;
    }


    public String getDetails(){
        return String.format("UserId: %d, Name: %s, Surname: %s, Email: %s, Password: %sб,Age: %d", userId, name, surname, email, password,getAge());
    }
    public int getAge(){
        return Period.between(birthday, LocalDate.now()).getYears();
    }


}
