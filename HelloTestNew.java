import java.io.IOException;
/**
 * @author Bhaskar Singh
 * @date 11/9/2021 4:42 PM
 */
public class HelloTestNew {
	
	private static String testVariable = "TEST";

    public static void main(String[] args) {
        System.out.println("Hello World");
		try {
            Runtime.getRuntime().exec("export HelloTest = " +testVariable);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

}
