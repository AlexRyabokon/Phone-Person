//Часть 3, упр.1 и 2

package org.example;



public class App 
{
    public static void main( String[] args )
    {

        Phone xiomi = new Phone(380995544, "Xiomi", 233.6);
        Phone iphone = new Phone(380912333, "IPhone 10", 123.4);
        Phone samsung = new Phone(32224555, "Samsung A10", 100.60);

        System.out.println(xiomi.receiveCall("nameOfCaller") + " " +
                iphone.receiveCall("nameOfCaller") +
                " " + samsung.receiveCall("nameOfCaller")+
                " " + xiomi.receiveCall(xiomi.getModel() +
                " " +xiomi.getNumber()));

        samsung.sendMessage(122255);
//----------------------------------------------------------------------------------------------------------
        //PERSON

        Person person1 = new Person();
        person1.setFullName("Пустой конструктор");
        person1.setAge(11);

        Person person2 = new Person("Конструктор со значениями", 22);
        System.out.println("\n");
        System.out.println("   ");

        person1.talk(person1.getFullName(), "bla bla");
        person1.move(person1.getFullName(), "Some city");

        person2.talk(person2.getFullName(), "another bla bla");
        person2.move(person2.getFullName(), "Some village");

    }



}
