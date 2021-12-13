
import java.util.Scanner;
class Area{  
    int area;
    int length;  
  int  width;  
    //creating a parameterized constructor  
  Area(int l,int w){  
    length = l;  
    width= w;  
    }  
  // get area method  
 public int getArea(){
            area = width*length;

return area;
              
   }
    public static void main(String args[]){  
    //creating objects and passing values  
    Scanner input = new Scanner (System.in);
    System.out.println("ENTER THE LENGTH:");
    int l = input.nextInt();
     System.out.println("ENTER THE WIDTH:");
    int w= input.nextInt();
     System.out.println(" ");
      System.out.println("********************************************** ");
  

   Area s1 = new Area(l,w);  
     
    //calling method to display the values of object  
    s1.getArea();  
        System.out.println(s1.getArea());
       
   }  
}  





