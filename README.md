#
Learning Java

## Java basic
This is the content of java basics

### Hello world

This is the **how** you write a *hello world*. In this program, we will print the `Hello world` in the terminal.

```
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}
```

### Addition

```
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want? add or subtract?");
        String operation = scanner.nextLine();
        
        if (operation.equals("add")) {
            // Adding here.
            System.out.println("Type first number to add: ");
            int a = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Type second number to add: ");
            int b = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Bro, your addition is: " + (a + b));
        } else if (operation.equals("subtract")) {
            // Subtract here.
            System.out.println("Type first number to subtract: ");
            int a = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Type second number to subtract: ");
            int b = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Bro, your subtraction is: " + (a + b));
        } else {
            // Not supported operation.
            System.out.println("Unsupported operation: " + operation);
        }
    }
```

#### Tota app
```
import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tota App: I repeat what you says. Say something");
        String input = scan.nextLine();
        
        System.out.println(input);
    }
}
```

### Editor, Debugger, Compiler, Runner
JDK
JRE

Language -> Assembly language
Java is a high level language -> low level language (Assembly language)

Java(high) -> Java compiled file (intermediate) -> Assembly(low level)

Build -> Java file ko class file me convert karta hai
.class is the intermediate part

javac HelloWorld.java -> Build aka Compile -> Conversion to intermediate language
java HelloWorld -> Run the HelloWorld.class file
java HelloWorld.java -> Build and run the HelloWorld.java

## Java advanced
this is the content
