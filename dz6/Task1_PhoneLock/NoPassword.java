package dz6.Task1_PhoneLock;

public class NoPassword implements Unlocker{

    private String nopassword;

    public NoPassword(String nopassword) {
        this.nopassword = nopassword;
    }

    public String getNopassword() {
        return nopassword;
    }

    @Override
    public void unlock() {
        System.out.println("Блокировка отсутствует!\n Телефон разблокирован.");
    }


}
