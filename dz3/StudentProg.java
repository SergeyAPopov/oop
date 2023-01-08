package dz3;

import java.util.*;

public class StudentProg {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
            new Student("Ivanov", 4.0f, "01.01.1990"),
            new Student("Petrov", 4.5f, "01.01.1991"),
            new Student("Sidorov", 4.7f, "01.01.1993")));

        System.out.println("\nIterator test");
        Iterator<Student> iter = studentGroup.iterator();  
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\nListIterator  test");
        Iterator<Student> listiternext = studentGroup.ListIterator(0);
        while(((ListIterator<Student>) listiternext).hasNext()){
            System.out.println(((ListIterator<Student>) listiternext).next());
        }

        System.out.println("\nListIterator reverse test");
        Iterator<Student> listiterprev = studentGroup.ListIterator(studentGroup.sizeOfGroup()-1);
        while(((ListIterator<Student>) listiterprev).hasPrevious()){
            System.out.println(((ListIterator<Student>) listiterprev).previous());
        }
         
        System.out.println("\nReverseIterator  test");
        Iterator<Student> reviter = studentGroup.ReverseIterator();
        while(reviter.hasNext()){
            System.out.println(reviter.next());
        }

    }
}
