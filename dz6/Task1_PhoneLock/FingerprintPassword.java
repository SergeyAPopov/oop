package dz6.Task1_PhoneLock;

public class FingerprintPassword implements Unlocker {
    private String fingerprint;

    public FingerprintPassword(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println("Блокировка отпечатком!");
        System.out.println("Отпечаток " + this.fingerprint + " принят, телефон разблокирован\n");;        
    }
    
    
}
