import java.util.List;

public class CopyText {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<String> list = readAndWrite.readFile("D:\\1. Project\\JavaProjects\\ExerciseJV_TextIO_2508\\Ex1\\source.txt");
        readAndWrite.writeFile("D:\\1. Project\\JavaProjects\\ExerciseJV_TextIO_2508\\Ex1\\target.txt", list);
    }
}
