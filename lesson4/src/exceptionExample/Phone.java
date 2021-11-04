package exceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;
    public Phone(String phoneType, String phoneNumber){
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
        if ((phoneType == null) || (phoneNumber == null)) {
            throw new IllegalArgumentException("the type and number cannont be null");
        }

    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return phoneType + " "+ phoneNumber;

    }
}
