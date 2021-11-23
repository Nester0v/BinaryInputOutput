import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            new Main().run();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private void run() throws IOException {
        task01();
        task02();
        task03();
    }

    private void task01() throws IOException {
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("data.bin"))) {
            stream.writeInt(123321);
            stream.writeFloat(2.1f);
            stream.writeDouble(3.124235);
            stream.writeUTF("Hello World!!!");
        }
    }

    private void task02() throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println("int: " + in.readInt());
            System.out.println("Float: " + in.readFloat());
            System.out.println("Double: " + in.readDouble());
            System.out.println("String: " + in.readUTF());
        }
    }

    private void task03() throws IOException {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Олег");
        name.add("Сергей");
        name.add("Андрей");
        name.add("Кирилл");
        name.add("Влад");

        for (String person : name) {

            try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("NamesCollection.bin"))) {
                stream.writeUTF(person);
            }
            try (DataInputStream in = new DataInputStream(new FileInputStream("NamesCollection.bin"))) {
                System.out.println("Имя в коллекции: " + in.readUTF());
            }
        }
    }

    private void task04() throws IOException {
        Contact contact = new Contact();
        ArrayList<String> contactInfo = new ArrayList<String>();
        contactInfo.add(contact.name);
        contactInfo.add(contact.surname);
        contactInfo.add(contact.phoneNumber);
    }
}

