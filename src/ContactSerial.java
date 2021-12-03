import java.io.Serializable;

public class ContactSerial implements Serializable {


    private String name;
    private String surname;
    private String phoneNumber;
    private transient long ignoredField;

    public ContactSerial(String name, String surname, String phoneNumber, long ignoredField){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.ignoredField = ignoredField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getIgnoredField() {
        return ignoredField;
    }

    public void setIgnoredField(long ignoredField) {
        this.ignoredField = ignoredField;
    }
}
