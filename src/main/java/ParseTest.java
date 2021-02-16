public class ParseTest {
    public static void main(String[] args) {

        String phrase = "parce(\"open asdgkuha #sdfkflsl !klflksdfj @sffdl fhhfgh !asfsf\", \"#\" )";
        String delims = "[ !]+";
        String[] tokens = phrase.split(delims);
        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

    }
}
