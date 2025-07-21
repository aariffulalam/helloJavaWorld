package Topic1BasicOfJava.Lesson1IntroductionToJava;

public class Lecture2DataTypes {
    /*
     * Java is a statically and highly typed language since each type of data is predefined as part of the programming language.
     * A variable's data type is an attribute that tells the compiler how the programmer wants to utilize the variable. It specifies the actions that may perform on the data and the types of values that can be stored.
     * 
     * Java has two types of data: 
        * Primitive Data Type
        * Non-Primitive Data Type or Object Data Type
    */

    /*
     * Primitive Data Types:
     * The programming language pre-defines a primitive data type. It contains no extra sophisticated methods and specifies the size and type of variable values.
     * There are eight kinds of primitive data types supported by Java:
        * Boolean data type
            * A boolean data type comprises a single bit of data that can only contain true or false values.
        * byte data type
            * It's an 8-bit two-s complement signed integer. It stores numbers in the range of -128 to 127. A byte data type helps conserve significant quantities of memory.
        * char data type
            * A char data type is a single 16-bit Unicode character. It can store any character, including letters, digits, and symbols.
        * short data type
            * The short data type is a 16-bit signed two's complement integer. It keeps track of values ranging from -32,768 to 32767. Use a short to conserve memory in big arrays, similar to byte.
        * int data type
            * It is a 4 Bytes or 32-bit signed two's complement integer. Whole numbers between -2147483648 and 2147483647 can be stored in this data format. It is the most commonly used data type for integers.
        * long data type
            * It is an 8 Bytes, or 64-bit signed two's complement integer. It can store values ranging from -9223372036854775808 to 9223372036854775807. It is used when a wider range than int is required.
        * float data type
            * A float data type is a single-precision 32-bit IEEE 754 floating point. It is used to store decimal numbers with a precision of about 7 decimal digits.
        * double data type
            * A double data type is a double-precision 64-bit IEEE 754 floating point. It is used to store decimal numbers with a precision of about 15 decimal digits. It is the default data type for decimal values in Java.
     */
    /*
     * Non-Primitive Data Types:
     * These data types are not actually defined by the programming language but are created by the programmer. These are also called Object Data Types or Reference Data types.
     * There are four kinds of non-primitive data types supported by Java:
        * Arrays
            * In Java, arrays are objects that represent homogenous data structures. Arrays are data structures that contain one or more values of a given data type and allow for indexed access to those values.
        * Strings
            * A string is a sequence of characters. In Java, strings are objects that represent a sequence of characters. They are immutable, meaning once created, their values cannot be changed.
            Java strings do not have a null character at the end.
        * Classes
            * A class is a blueprint for creating objects. It defines the properties and behaviors of the objects created from it. Classes can contain fields (variables) and methods (functions).
            * Classes are used to create user-defined data types in Java.
        * Interfaces
            * An interface in Java is a user-defined blueprint or prototype which includes all your data just like a class, but the methods declared in the interface are all abstract. That is, it contains only definition and signature and no body.
            * Interfaces are used to achieve abstraction and multiple inheritance in Java.
            * An interface can contain only constants, method signatures, default methods, static methods, and nested types. It cannot contain instance fields or constructors.
            * An interface cannot be instantiated, but it can be implemented by classes.
    */

}

class Main {

    public static void main(String[] args) {
        //boolean
        boolean bt = true;
        System.out.println(bt);

        //byte
        byte n;
        n = 127;
        System.out.println(n); // prints 127

        //char
        char a = 'A';
        char b = 66;
        System.out.println(a); // prints A
        System.out.println(b); // Displays B

        //short
        short m = 1234;
        System.out.println(m);

        //int
        int num1 = 56782;
        System.out.println(num1);

        //long
        long num2 = 15000000000L;
        System.out.println(num2);

        //float
        float num3 = 3.14f;
        System.out.println(num3);

        //double
        double num4 = 69.784d;
        System.out.println(num4);
    }
}
