import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileWriter writer = null;
        try {
            in = new FileInputStream("test.txt");
            Scanner sc = new Scanner(in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            writer = new FileWriter("result.txt");
            writer.write("" + sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

