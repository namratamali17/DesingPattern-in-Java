package designpattern;
import java.util.Scanner;

// Handler interface
interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(int request);
}

// Concrete Handler 1
class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1 handles the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can process the request.");
        }
    }
}

// Concrete Handler 2
class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 handles the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can process the request.");
        }
    }
}

// Client class
public class ChainOfResponsibilityDesignPattern {
    public static void main(String[] args) {
        // Create handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // Set up the chain
        handler1.setNextHandler(handler2);

        // Client code
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Send the request to the first handler in the chain
        handler1.handleRequest(userInput);

        scanner.close();
    }
}
