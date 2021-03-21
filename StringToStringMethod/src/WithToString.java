class Student2{

 int rollno;
 String name;
 String city;
  
 Student2(int rollno, String name, String city){
 this.rollno=rollno;
 this.name=name;
 this.city=city;
 }  
   
 public String toString(){
  return rollno+" "+name+" "+city;
 }
 public static void main(String args[]){
   Student2 s1=new Student2(101,"Raj","lucknow");
   Student2 s2=new Student2(102,"Vijay","ghaziabad");
     
   System.out.println(s1);
   System.out.println(s2);
 }  
}