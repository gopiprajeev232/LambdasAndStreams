/* Lambdas are blocks of code that represent behaviour which can be passed around to other methods.
Helps us write functional code.
They are anonymous functions, which means they don't have to have a name.

Lambda syntax:

-> Input arguments, body and return
    (input arguments) -> body
-> Left hand side is inputs
-> Right hand side is logic
-> Arrow token (->) is separator

Examples:
    (Integer i) -> i*i
    (String a) -> notify(a);
    Concatenating 2 strings:
    (String s1, String s2) -> s1+s2;

To create lambdas, interfaces should have only one method, which is a limitation.
 */

public class FirstLambda {
    interface IGreeting {
        String greet(String name);
    }

    public void greetPerson(String name, IGreeting g) {
        String result = g.greet(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new FirstLambda().greetPerson("Gopi Prajeev", (String s) -> "Hello, "+s);
    }
}
