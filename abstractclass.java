import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 *
 * @author User
 */
abstract class Shape
{
   int a,b;
   abstract public void printArea();
}
public class pg1 {
    public static void main(String[] args){
        rectangle r=new rectangle();
        r.printArea();
        triangle t=new triangle();
        t.printArea();
        circle c=new circle();
        c.printArea();
    }
    
    
}
class rectangle extends Shape
{
    public int recarea;
    public void  printArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length and breadth of the rectangle");
        a=s.nextInt();
        b=s.nextInt();
        recarea=a*b;
        System.out.println("the area of the rectangle is"+recarea);
        
        
    }
}
class triangle extends Shape
{
    int triarea;
    @Override
    public void printArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the base and height of the rectangle");
        a=s.nextInt();
        b=s.nextInt();
        triarea=(int) (0.5*a*b);
        System.out.println("the area of the triangle  is"+triarea);
        
        
    }
}
class circle extends Shape
{
    public int cirarea;
    public void printArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        a=s.nextInt();
        cirarea =(int)(3.14*a*a);
        System.out.println("the area of the circle is"+cirarea);
        
        
    }
}
