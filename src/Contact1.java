import java.io.Serializable;

public class Contact1 implements Serializable {
    public String name;
    public String surname;
    public String phoneNumber;
    public transient long ignoredField;
}
