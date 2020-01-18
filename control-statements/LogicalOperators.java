 // Logical operators
public class LogicalOperators {

    public static void main(String[] args) {
        // creates truth tables for logical AND
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Conditional AND (&&)", "false && false", (false && false),
             "false && true", (false && true), 
             "true && false", (true && false), 
             "true && true", (true && true));

             // OR operators
             System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Conditional OR (||)", "false || false", (false || false),
             "false || true", (false || true), 
             "true || false", (true || false), 
             "true || true", (true || true));    
             
             // Boolean logical 
             System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Boolean logical &", "false & false", (false & false),
             "false & true", (false & true), 
             "true & false", (true & false), 
             "true & true", (true & true));    
             
             // Boolean logical inclusive
             System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Boolean logical inclusive |", "false | false", (false | false),
             "false | true", (false | true), 
             "true | false", (true | false), 
             "true | true", (true | true));      
             
             // Boolean logical exclusive
             System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Boolean logical exclusive OR ^", "false ^ false", (false ^ false),
             "false ^ true", (false ^ true), 
             "true ^ false", (true^ false), 
             "true ^ true", (true ^true));
             
             System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
            "!false", (!false), "!true", (!true));
    }
}