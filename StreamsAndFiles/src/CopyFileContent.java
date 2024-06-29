import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
        BufferedInputStream inputStream = new BufferedInputStream(fis);
        BufferedOutputStream outputStream = new BufferedOutputStream(fos)) {


            int b = inputStream.read();
            while (b != -1) {
                outputStream.write(b);


                b = inputStream.read();
            }
        }

    }
}
