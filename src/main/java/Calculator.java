public class Calculator {

    // Overload 1: method for integers
    int add (int a, int b){
        return a + b;
    }

    //Overload 2: method for Strings
    int add (String numbers){
        String [] numberArray = numbers.split(","); // Split String using commas
        int sum = 0;
        for (String num : numberArray){
            sum += Integer.parseInt(num.trim()); //Convert each part of the String to a number and add them together
        }
        return sum;
    }

    //overload 3: method for array
    int add (int [] numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }

    int subtract (int a, int b){
        return a - b;
    }

    int multiply (int a, int b){
        return a * b;
    }

    int divide (int a, int b){
        return a / b;
    }
}
