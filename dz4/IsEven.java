package dz4;

public class IsEven extends Superclass<Integer>{

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }

}