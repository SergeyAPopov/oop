package dz4;

public class BeginsWith extends Superclass<String> {

    private String startValue;
    
    public BeginsWith(String startValue) {
        this.startValue = startValue;
    }

    public String getStartValue() {
        return startValue;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(startValue);
    }
    
}
