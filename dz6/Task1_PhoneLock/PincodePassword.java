package dz6.Task1_PhoneLock;

public class PincodePassword implements Unlocker {
    private int pincode;

    public PincodePassword(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public void unlock() {
        System.out.println("Блокировка пин-кодом!");
        System.out.println("Пин-код " + this.pincode + " принят, телефон разблокирован\n");;
    }


    

}
