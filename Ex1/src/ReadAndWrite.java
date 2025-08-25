import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String fileName) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(fileName);
            }
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while((line = br.readLine())!=null){
                list.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public void writeFile(String fileName, List<String> list){
        try {
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(writer);
            for(String line : list){
                bw.write(line);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
