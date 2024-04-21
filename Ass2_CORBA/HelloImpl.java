// Import statements

import HelloModule.HelloPOA;



// Class definition

public class HelloImpl extends HelloPOA {



    // Constructor

    public HelloImpl() {

        super();

        System.out.println("Ready");

    }



    // Method implementation

    public String print_hello(String s) {

        return "Hello " + s;

    }

}

