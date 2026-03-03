import java.io.*;
import java.util.Scanner;

public class StudentDataIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream fos = new FileOutputStream("student.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();
            fos.close();

            System.out.println("\nData Stored Successfully!\n");

            FileInputStream fis = new FileInputStream("student.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble());
            System.out.println("Height: " + dis.readDouble());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readLong());

            dis.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}