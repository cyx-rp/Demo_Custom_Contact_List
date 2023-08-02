package sg.edu.rp.c346.id22022868.democustomcontactlist;

public class Contact {

    //declare fields
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    //constructor
    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
