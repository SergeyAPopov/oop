package dz6.Task1_PhoneLock;

public class FaceIDPassword implements Unlocker {
    private String faceID;

    public FaceIDPassword(String faceID) {
        this.faceID = faceID;
    }

    public String getFaceID() {
        return faceID;
    }

    @Override
    public void unlock() {
        System.out.println("Блокировка faceID!");
        System.out.println("faceID " + this.faceID + " принят, телефон разблокирован\n");;
    }

    
}
