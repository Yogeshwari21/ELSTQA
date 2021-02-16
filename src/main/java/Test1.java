import java.util.StringTokenizer;
public class Test1 {
    public static void main(String[] args) {
        String s = "prefix/dir1/dir2/dir3/dir4/..";
        StringTokenizer tokenizer = new StringTokenizer(s, "/");
        String dir1 = tokenizer.nextToken();
        String dir2 = tokenizer.nextToken();
        System.out.println("Dir 1  : " + dir1);
        System.out.println("Dir 2 : " + dir2);

        String s1 = "one @the other some jsdksf @wewe\", \"@\"";
        String prefix = "pre/fix";
        String[] tokens = s1.substring(prefix.length()).split("@");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println("printing token" + tokens[i]);
        }
    }
}