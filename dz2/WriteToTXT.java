package dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteToTXT extends WriterToFile {

    @Override
    public void WriteToFile(HashMap<String, Double> students) {
        try {
            FileWriter fw = new FileWriter("Student.txt");
            for (HashMap.Entry<String, Double> item : students.entrySet()) {
                fw.append(item.getKey() + "=" + item.getValue()+ "\n");
            }
        fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        
        }
    }
}






    

