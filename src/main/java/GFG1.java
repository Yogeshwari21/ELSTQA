 // Java method to show Calling main() method
// externally from another class

 class GFG1 {

        static int count = 0;

        // The method that calls the main() method
        static void mainCaller()
        {

            System.out.println("mainCaller!");
            count++;

            // Calling the main() only 3 times
            if (count < 3) {

                // Calling the main() method
                Test1.main(null);
            }
        }
    }

    class Test {

        // main() method
        public static void main(String[] args)
        {
            System.out.println("main");

            // Calling the mainCalller() method
            // so that main() methiod is called externally
            GFG.mainCaller();
        }
    }
