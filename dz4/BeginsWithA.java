package dz4;

public class BeginsWithA extends Superclass<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }
    
}
