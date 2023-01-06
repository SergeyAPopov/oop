package dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteToXML extends WriterToFile{

    @Override
    public void WriteToFile(HashMap<String, Double> students) {
        try {
            FileWriter fw = new FileWriter("Student.xml");
            fw.append("<?xml version="+'"'+"1.0"+'"' + " encoding="+'"'+"utf-8"+'"'+" ?>\n");
            fw.append("<students>\n");
            for (HashMap.Entry<String, Double> item : students.entrySet()) {
                fw.append("<student>\n");
                fw.append("<name>"+ item.getKey() +"</name>\n"+ "<grade>" + item.getValue()+"</grade>\n");  
                fw.append("</student>\n");      
            }
            fw.append("</students>");
        fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        
        }
    }
}


    

