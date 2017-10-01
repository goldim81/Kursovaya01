package ProfLesson;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class User {
    @XmlElement
    private final int id;
    private String firstName;
    private String secondName;
    private String otchestvo;
    private Date birthday;
    @XmlElement
    private final Date dateRegister;
    private String email;
    private String password;
    private String tel;
    private int role;
    private boolean block;
    private Theme theme;

    public User() {
        this.id = 123;
        this.dateRegister = new Date();
    }

    public User(int id) {
        this.id = id; //TODO реализовать генерацию уникального ID
        this.dateRegister = new Date();
    }

    public User(int id, String firstName, String secondName, String otchestvo) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.otchestvo = otchestvo;
        this.dateRegister = new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @XmlElement
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    @XmlElement
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public Date getBirthday() {
        return birthday;
    }

    @XmlElement
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    @XmlElement
    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getRole() {
        return role;
    }

    @XmlElement
    public void setRole(int role) {
        this.role = role;
    }

    public boolean isBlock() {
        return block;
    }

    @XmlElement
    public void setBlock(boolean block) {
        this.block = block;
    }

    public Theme getTheme() {
        return theme;
    }

    @XmlElement
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", birthday=" + birthday +
                ", dateRegister=" + dateRegister +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", role=" + role +
                ", block=" + block +
                ", theme=" + theme +
                '}';
    }
}
