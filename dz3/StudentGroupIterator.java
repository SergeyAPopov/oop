package dz3;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student>{
    protected int index =0;
    private StudentGroup studentList;

    public StudentGroupIterator(StudentGroup studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        boolean x = this.index <this.studentList.sizeOfGroup() ;
        return x;
    }

    @Override
    public Student next() {
        return Student.nextStudent(index++);
    }

    
}
