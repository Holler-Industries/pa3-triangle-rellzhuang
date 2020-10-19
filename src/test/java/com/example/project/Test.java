package com.example.project;


public class Test {
    public static void main(String[] args){

    Triangle myTriangle1 = new Triangle(1.1,2.2,3.3,4.4,5.5,6.6);
    System.out.println(myTriangle1.perimeter()+" Passed");
    System.out.println(myTriangle1.area()+" Passed");
    myTriangle1.translateX(10);
    myTriangle1.translateY(3);



    Triangle myTriangle2 = new Triangle();
    System.out.println(myTriangle2.perimeter()+" Passed");
    System.out.println(myTriangle2.area()+" Passed");
    }
}

