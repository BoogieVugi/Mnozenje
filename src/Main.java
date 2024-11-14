import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;




public class Main {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("Marko", "Marić", "index123");
        Student student2 = new Student("Ana", "Marković", "index374");
        Student student3 = new Student("Toni", "Ivić", "index565");

        FileWriter writer = new FileWriter("studenti.txt");
        writer.write(student1.getStudentInfo() + "\n");
        writer.write(student2.getStudentInfo() + "\n");
        writer.write(student3.getStudentInfo() + "\n");
        writer.close();


    }
}