package dz3;


public class Student {
   private String name;
   private float avBall;
   private String dateOfBirth;

   public Student(String name,float avBall,String dateOfBirth) {
    this.name = name;
    this.avBall = avBall;
    this.dateOfBirth = dateOfBirth;
   }


public String getName() {
    return name;
}

public float getAverageBal() {
    return avBall;
}

public String getDateOfBirth() {
    return dateOfBirth;
}

public static Student nextStudent(int index){
    return StudentGroup.studentList.get(index);
}

@Override
public String toString() {
    return "Student [name=" + name + ", averageBal=" + avBall + ", dateOfBirth=" + dateOfBirth + "]";
}
}


