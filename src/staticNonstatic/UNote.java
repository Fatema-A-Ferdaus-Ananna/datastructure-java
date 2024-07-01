package staticNonstatic;

public class UNote {
    //static variable, method, blocks
    //Java 'static' property is shared to all objects.


    //static variable:
    // The static variable gets memory only once in the class area at the time of class loading.
    //It makes your program memory efficient

    //static method:
    //A static method belongs to the class rather than the object of a class.
    //can be invoked without the need for creating an "instance" of a class.
    //can access static data member and can change the value of it.
    //it can use/access only static fields(variable and methods)

    //non-static variable:
    //can no be use in static method
    // non-static variable's value can be used in static method by
    // storing the variable's value into a static variable(by using non-static method

    // non-static method :
    // it can access both static & nonstatic  variable,methods
    // need to create/ instantialize instance first.
}
