package session16;

public class TestGreetingService {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonymouseGrettingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonymouseGrettingService.greet("Maria");

        //lambda
        GreetingService lambdaGrettingService = message -> System.out.println("Hello " + message);
        lambdaGrettingService.greet("Maria");
    }
}
