package com.company;

/**
 * Created by zeeshanhanif-pc on 4/30/2017.
 */
public class Student extends Human implements Sindhi {

    public Student(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("Study in Student");
    }


    public void jughar(){
        System.out.println("Pakistani Jughar in Student");
    }


    public void sindhiJughar() {
        System.out.println("Sindhi Jughar in Student");
    }

    @Override
    public void sindhiBiryani() {
        System.out.println("Sindhi biryani from Sindhi foods in Student");
    }
/*
    @Override
    public void panjabiJughar() {
        System.out.println("Panjabi Jughar in Student");
    }*/
}
