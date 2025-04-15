class Calculater {
    int a=10;
    int b=20;

  void display(){
    System.out.println("adding number"+(a+b));
    System.out.println("substracting number"+(a-b));
    System.out.println("multipling number"+(a*b));
    System.out.println("Division"+(a/b));
  }

}
public class SimpleCalculater{
    public static void main(String[] arg){

     Calculater SC=new Calculater();

    SC.display();
}
}
