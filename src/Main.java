import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("test.txt");

        if(file.exists()) {
//            System.out.println("The file has "+ file.length());
//            System.out.println("The file can be read: "+file.canRead());
//            System.out.println("The file can be written: "+file.canWrite());
//            System.out.println("Is it a directory? "+file.isDirectory());
//            System.out.println("Is it a file? "+file.isFile());
//            System.out.println("Is it absolute? "+file.isAbsolute());
//            System.out.println("Is it hidden? "+file.isHidden());
//            System.out.println("Path Name: "+file.getAbsolutePath());
//            System.out.println("File Name: "+file.getName());

//            try(PrintWriter output = new PrintWriter(file)) {
//                output.println("Hello World!");
//                output.println("Welcome to BTPR1103 Java Programming II!");
//                output.println("Hello World!");
//            } catch (FileNotFoundException e) {
//                System.out.println(e.getMessage());
//            }
////
//            try (Scanner input = new Scanner(file)) {
//                while (input.hasNext()) {
//                    String line = input.nextLine();
//                    System.out.println(line);
//                }
//            } catch (FileNotFoundException e) {
//                System.out.println(e.getMessage());
//            }
            try (FileOutputStream output = new FileOutputStream(file)){
                for (int i=1;i<=10;i++) {
                    output.write(i);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try(FileInputStream input = new FileInputStream(file)) {
                byte[] values = input.readAllBytes();
                for(byte value: values) {
                    System.out.print((value) + " ");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try(DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))) {
                for (int i=1;i<=10;i++) {
                    output.writeInt(i);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try (DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))){
                while (input.available() != 0) {
                    int value = input.readInt();
                    System.out.print(value+" ");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("The file does not exist!");
        }
    }





}

