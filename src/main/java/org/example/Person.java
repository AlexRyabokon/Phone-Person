package org.example;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move(String whoMove, String location){
        System.out.println("\n"+whoMove + " идет на локацию: __ -- ::> " + location);
    }

    void talk(String whoSpeak, String whatSpeak){
        System.out.println("\n"+whoSpeak + " говорит: " + whatSpeak);
    }





}
