package dz3;

import java.util.*;

public class StudentGroup implements Iterable<Student>{
    static List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        StudentGroup.studentList = studentList;
    }

    public int sizeOfGroup(){
        return studentList.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> ListIterator(int index) {
        return new GroupListiterator(this, index);
    }

    public Iterator<Student> ReverseIterator() {
        return new ReverseIterator(this);
    }
}
