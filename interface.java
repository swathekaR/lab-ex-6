import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
 interface NewInterface {
    Scanner in=new Scanner(System.in);
    abstract void print();
}
public class pg2{
    public static void main(String[] args){
    NewInterface r=new Rectangles();
    r.print();
    r=new Sportscar();
    r.print();
    r=new Managers();
    r.print();
    }
}
class Rectangles implements NewInterface{
    @Override
    public void print()
    {
    int a, b;
    int area;
    System.out.println("enter the length of the rectangle is");
    a=in.nextInt();
    System.out.println(" enter the breadth  of the rectangle is");
    b=in.nextInt();
    area=a*b;
    System.out.println("the length of the rectangle is"+a);
    System.out.println(" the breadth  of the rectangle is"+b);   
    System.out.println("the area of the rectangle"+area);
    }
}
class Sportscar implements NewInterface{
    @Override
    public void print()
    {
    String brandname, model;
    int price;
    {
        System.out.println("enter the brand name");
        brandname=in.next();
        System.out.println("enter the model name");
        model=in.next();
        System.out.println("enter the price");
        price=in.nextInt(); 
        System.out.println("the brand name"+brandname);
        System.out.println("the model name "+model);
        System.out.println("the price of the sports car is"+price);
        
        
    }
}
}
class Managers implements NewInterface
{
  @Override
  public void print()
  {
      int id,age;
      double salarydetails;
      String name;
       System.out.println("enter the name");
       name=in.next();
       System.out.println("enter the id");
       id=in.nextInt();
       System.out.println("enter the age");
       age=in.nextInt();
       System.out.println("enter the salary details");
       salarydetails=in.nextDouble();
       System.out.println("*****The details of the employee are******");
       System.out.println("the name"+name);
       System.out.println("the age"+age);
       System.out.println("the id"+id);
       System.out.println("the salarydetails"+salarydetails);
  }
}
