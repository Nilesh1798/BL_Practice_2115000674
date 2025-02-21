import java.io.*;
public class DataStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John");
            dos.writeDouble(3.8);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
