package dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteToJSON extends WriterToFile {

    @Override
    public void WriteToFile(HashMap<String, Double> students) {
        try {
            FileWriter fw = new FileWriter("Student.json");
            fw.append("{\n");
            int count =1;
            for (HashMap.Entry<String, Double> item : students.entrySet()) {
                if (count <students.size()){
                    fw.append('"'+ item.getKey() + '"'+ ":" + item.getValue()+",\n");
                    count++;
                    }
                else
                    fw.append('"'+ item.getKey() + '"'+ ":" + item.getValue()+"\n");

            }
            fw.append("}");
        fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        
        }
    }
}


    

