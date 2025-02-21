import java.io.*;
public class ImageToByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }
        fis.close();
        byte[] imageBytes = baos.toByteArray();
        System.out.println("Image converted to byte array of size: " + imageBytes.length);
    }
}
