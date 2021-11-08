package creatingclass;

public class Dog {
    private String dogType;
    private  String dogName;
    private String dogColor;
    private int dogAge;
    public Dog(String dogType,String dogName, String dogColor, int dogAge){
        this.dogType = dogType;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
        this.dogName = dogName;
    }
    public String getDogType(){
        return dogType;
    }
    public void setDogType(String newDogType){
        this.dogType = newDogType;
    }
    public String getDogName(){
        return  this.dogName;
    }
    public void setDogName(String newDogName){
        this.dogName = newDogName;
    }
    public String getDogColor(){
        return this.dogColor;
    }
    public void setDogColor(String newDogColor){
        this.dogColor = newDogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString(){
        return "Dog type:" + dogType + " Dog name:" + dogName + " Dog Color:" + dogColor + "  Dog age" + dogAge;

    }
}
