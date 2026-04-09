public class User {

    private String userId;
    private String pin;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean validate(String uid, String enteredPin) {
        return userId.equals(uid) && pin.equals(enteredPin);
    }
}
