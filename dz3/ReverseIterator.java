package dz3;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentList) {
        super(studentList);
        index = studentList.sizeOfGroup() -1;
    }

    @Override
    public boolean hasNext() {
        return index > -1;
    }

    @Override
    public Student next() {
        return Student.nextStudent(index--);
    }
}
