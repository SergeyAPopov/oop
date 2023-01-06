package dz2;

import java.util.HashMap;

public class Main {
    public static void main( String[] args ){
    
        HashMap <String, Double> students = new HashMap<>();
        students.put ("Иван Иванов", 4.8);
        students.put ("Мария Кузнецова", 5.0);
        students.put ("Степан Кузьмин", 3.6);

        // System.out.println("Список студентов: "+ students.toString());
        WriteToTXT wTXT = new WriteToTXT();
        wTXT.WriteToFile(students);
        WriteToJSON wJSON = new WriteToJSON();
        wJSON.WriteToFile(students);
        WriteToXML wXML = new WriteToXML();
        wXML.WriteToFile(students);

}
}
