import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Bhaskar Singh
 * @date 11/9/2021 4:42 PM
 */
public class HelloTestNew {

    private static String testVariable = "TEST";

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Working Directory = "+ System.getProperty("user.dir"));
        File file = new File("deviceToken.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("testing");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        try {
            Runtime.getRuntime().exec("export HelloTest = " +testVariable);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

}
