import java.io.*;
import java.util.ArrayList;
import java.util.List;

//ЕЩЕ БУДЕТ ДОРАБАТЫВАТЬСЯ, ПОБЛЕМЫ С ВНЕДРЕНИЕМ СЕРИАЛИЗАЦИИ И ПОДСЧЁТОМ ФАЙЛОВ В ДИРЕКТОРИИ

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
        task04();
//        task05();
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
        List<Contact> contactInfos = new ArrayList<Contact>();
        contactInfos.add(new Contact("Денис", "Орлов",
                "+380664837908"));
        contactInfos.add(new Contact("Егор", "Немой",
                "+380667737908"));
        contactInfos.add(new Contact("Антон", "Грек",
                "+380664887952"));
        contactInfos.add(new Contact("Сергей", "Болотный",
                "+380994812911"));
        contactInfos.add(new Contact("Андрей", "Стадник",
                "+380684877708"));
        contactInfos.add(new Contact("Даниил", "Пристав",
                "+380754814868"));
        contactInfos.add(new Contact("Анна", "Элинсон",
                "+380674815678"));
        contactInfos.add(new Contact("Кристина", "Фещенко",
                "+380664166908"));
        contactInfos.add(new Contact("Евгений", "Работа",
                "+380954831698"));
        contactInfos.add(new Contact("Михаил", "Соколов",
                "+380964885908"));

        for (int i = 0; i < contactInfos.size(); i++) {
            try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("NamesCollection.bin"))) {
                stream.writeUTF(contactInfos.get(i).getName() + " | "
                        + contactInfos.get(i).getSurname() + " | "
                        + contactInfos.get(i).getPhoneNumber());
            }
            try (DataInputStream in = new DataInputStream(new FileInputStream("NamesCollection.bin"))) {
                System.out.println(in.readUTF());
            }
        }
    }

//    private void task05() throws IOException {
//
//        List<ContactSerial> contactInfos = new ArrayList<ContactSerial>();
//        contactInfos.add(new ContactSerial("Денис", "Орлов",
//                "+380664837908", 1));
//        contactInfos.add(new ContactSerial("Егор", "Немой",
//                "+380667737908", 2));
//        contactInfos.add(new ContactSerial("Антон", "Грек",
//                "+380664887952", 3));
//        contactInfos.add(new ContactSerial("Сергей", "Болотный",
//                "+380994812911", 4));
//        contactInfos.add(new ContactSerial("Андрей", "Стадник",
//                "+380684877708",5));
//        contactInfos.add(new ContactSerial("Даниил", "Пристав",
//                "+380754814868",6));
//        contactInfos.add(new ContactSerial("Анна", "Элинсон",
//                "+380674815678",7));
//        contactInfos.add(new ContactSerial("Кристина", "Фещенко",
//                "+380664166908",8));
//        contactInfos.add(new ContactSerial("Евгений", "Работа",
//                "+380954831698",9));
//        contactInfos.add(new ContactSerial("Михаил", "Соколов",
//                "+380964885908",10));
//
//        for (int i = 0; i < contactInfos.size(); i++) {
//            FileOutputStream outputStream = new FileOutputStream("SerialContact.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
//            oos.writeUTF(contactInfos.get(i).getName() + " | "
//                    + contactInfos.get(i).getSurname() + " | "
//                    + contactInfos.get(i).getPhoneNumber());
//            oos.close();
//
//            FileInputStream fileInputStream = new FileInputStream("SerialContact.bin");
//            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
//            ois.readUTF();
//            System.out.println("\nВывод с сериализацией: ");
//            System.out.println(ois.readUTF());
//        }
//    }
//    private void task06(){
//        new File("C:/Users/Vlad/IdeaProjects/BinaryInputOutput").listFiles();
//        int count = 0;
//        getFile("C:/Users/Vlad/IdeaProjects/BinaryInputOutput");
//
//        private void getFile(String dirPath;
//        dirPath) {
//            File f = new File(dirPath);
//            File[] files = f.listFiles();
//
//            if (files != null)
//                for (int i = 0; i < files.length; i++) {
//                    count++;
//                    File file = files[i];
//
//                    if (file.isDirectory()) {
//                        getFile(file.getAbsolutePath());
//                    }
//                }
//        }
//
//    }
}




