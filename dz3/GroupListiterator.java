package dz3;

import java.util.ListIterator;

public class GroupListiterator extends StudentGroupIterator implements ListIterator<Student>{

    

    public GroupListiterator(StudentGroup studentList, int index) {
        super(studentList);
        this.index=index;
    }

    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public Student previous() {
        return Student.nextStudent(index--);
    }

    @Override
    public int previousIndex() {
        return index -1;
    }

    @Override
    public void remove() {        
    }

    @Override
    public void set(Student e) {        
    }

    @Override
    public void add(Student e) {        
    }

}
