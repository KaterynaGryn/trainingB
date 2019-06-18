public class Person {
    private String  surName;
    private String name;
    private int age;
    private  String colorOfEyes;
    private int id;


    public String getName(){ return name; }
    public String getSurNameName(){ return surName; }
    public int getAge(){ return age; }
    public String getcolorOfEyes(){ return colorOfEyes; }



    public Person(String name){

        this.name=name;
        this.surName=surName;
        this.age=age;
        this.colorOfEyes=colorOfEyes;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }
}

