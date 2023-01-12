package dz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        

        ArrayList<Integer> IntList = new ArrayList<>();
        for (int i = 0; i <11;i++){
            IntList.add(new Random().nextInt(100) -50);
        }
        System.out.println(IntList);
        IsGood<Integer> evenArray = new IsEven();
        IsGood<Integer> positiveArray = new IsPositive();
        System.out.println("Even values: " + filter(IntList, evenArray));
        System.out.println("Positive values: " + filter(IntList, positiveArray));

        List<String> strList = Arrays.asList("Audi", "BMW", "Mercedes", "Volvo", "Chery", "Toyota", "FAW", "Ford");
        
        IsGood<String> beginsAArray = new BeginsWithA();
        String xValue = "F";
        IsGood<String> beginsXXXArray = new BeginsWith(xValue);
        System.out.println("Begins with 'A' values: " + filter(strList, beginsAArray));
        System.out.println("Begins with " + "'"+ xValue +"'"+ " values: " + filter(strList, beginsXXXArray));


    }
    public static <T> Iterable<T> filter(Iterable<T> array, IsGood<T> isGood){
            List<T> result = new ArrayList<T>();
            for (T itElement : array) {
                if(isGood.isGood(itElement)){
                    result.add(itElement);
                }
            }
            return result;
        }
}