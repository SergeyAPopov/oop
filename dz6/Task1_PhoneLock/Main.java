package dz6.Task1_PhoneLock;

/** 
Чтобы разблокировать телефон, пользователь может выбрать один из способов:
• Без пароля
• С пин-кодом (4-значное число)
• По отпечатку пальца (кодируется строкой)
• По распознаванию лица (кодируется строкой)
Программист написал класс Unlocker, в котором хранятся поля от всех способов сразу:
class Unlocker {
private int mode; // режим
private int pin; // на случай пин-кода
private String fingerprint; // на случай отпечатка пальца
private String faceID; // на случай лица
}
Здесь нарушен принцип SRP: класс имеет несколько незаивисимых причин меняться.
Напишите решение, которое будет соответствовать SRP и OCP (мы хотим в будущем добавлять новые способы разблокировки).
*/

public class Main {
    public static void main(String[] args) {
        NoPassword noPassword = new NoPassword("null");
        noPassword.unlock();

        PincodePassword pincode = new PincodePassword(1111);
        pincode.unlock();

        FingerprintPassword fingerprint = new FingerprintPassword("ZZZZ");
        fingerprint.unlock();

        FaceIDPassword faceID = new FaceIDPassword("ZZZZ");
        faceID.unlock();
    }
}
