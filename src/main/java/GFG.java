// Java method to show Calling main() method
// externally from the same class

import java.io.*;

class GFG {

    static int count = 0;

    // The method that calls the main() method
    static void mainCaller()
    {

        System.out.println("mainCaller!");
        count++;

        // Calling the main() only 3 times
        if (count < 3) {

            // Calling the main() method
            main(null);
        }
    }

    // main() method
    public static void main(String[] args)
    {
        System.out.println("main");

        // Calling the mainCalller() method
        // so that main() methiod is called externally
        mainCaller();
    }
}
