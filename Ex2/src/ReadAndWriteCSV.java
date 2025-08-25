import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteCSV {
    public static void main(String[] args) {
        List<String[]> data = ReadAndWriteCSV.readCSV("D:\\1. Project\\JavaProjects\\ExerciseJV_TextIO_2508\\Ex2\\country.csv");
        for  (String[] line : data) {
            System.out.println(Arrays.toString(line));
            System.out.println();
        }
        System.out.println();

    }
    public static List<String[]> readCSV(String filePath) {
        List<String[]> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException(filePath);
            }
            String line= "";
            while ((line = br.readLine()) != null) {
                list.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
