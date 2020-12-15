package decorator.filterStream;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/admin/IdeaProjects/design-patterns/head-first/src/decorator/filterStream/test.txt");
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            fileInputStream));
            while ((c = inputStream.read()) >= 0) {
                System.out.println((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
