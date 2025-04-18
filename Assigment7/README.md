In this project, we created a calculator that performs basic arithmetic operations using the Model-View-Controller (MVC) pattern. First, we created a project in IntelliJ IDEA and configured it to work with JavaFX. Then, using Scene Builder, we designed the graphical user interface (GUI) of the calculator. In the interface, we added a field to display the input and results, buttons for numbers from 0 to 9, operation buttons (+, -, *, /, =), and a clear button "C". After that, we linked Scene Builder with the Java code so that the processing of the buttons works correctly.

Next, we structured the code by dividing the project into three logical components: Model, View, and Controller.
View is an FXML file created in Scene Builder that defines all the elements of the interface. This file was linked to the controller so that button clicks can be processed.
Controller is responsible for the communication between View and Model. In the CalculatorController class, we implemented handlers for the buttons: when numbers or operators are pressed, they are added to the expression and displayed in the input field, when the "=" button is pressed, the calculate() method is called, which calculates the expression and displays the result, and when "C" is pressed, the expression is cleared. Error handling was also added, for example, when dividing by zero. After writing all the classes, we tested the calculator, made sure that the buttons work correctly, expressions are calculated correctly, errors are processed, and the final project is ready for use. We created a calculator with a convenient graphical interface, implemented using JavaFX and Scene Builder, and also used the MVC pattern, which made the code more understandable, easier to maintain and expand.

Screenshots of my program working
![Screenshot](FirstInput.png)

First input 458

![Screenshot](SecondInput.png)

Second input is 862

![Screenshot](SumResult.png)

I add this two numbers and get result 1320

![Screenshot](Cleared.png)

And finally i cleared all the numbers int the output label.






