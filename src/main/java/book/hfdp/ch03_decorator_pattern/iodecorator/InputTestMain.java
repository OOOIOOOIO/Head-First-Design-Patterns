package book.hfdp.ch03_decorator_pattern.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTestMain {

    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("test.txt"))); // 파일 만들기!

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
