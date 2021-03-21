class Bike5 {  
 int speedlimit = 90;  
}  
class Honda3 extends Bike5{  
 int speedlimit = 150;  
  
 public static void main(String args[]){  
  Bike5 obj=new Honda3();  
  System.out.println(obj.speedlimit);
}  
}