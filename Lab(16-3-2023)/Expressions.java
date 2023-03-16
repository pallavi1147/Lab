public class Expressions{
public static void main(String args[]){
int a=(101+0)/3;
double b=3.0e-6*10000000.1;
boolean c=true && true;
boolean d= false && true;
boolean e=(false && false) || (true && true);
boolean f= (false || false) && (true && true);
System.out.println("a is = " + a);
System.out.println("b is = " + b);
System.out.println("c is = " + c);
System.out.println("d is = " + d);
System.out.println("e is = " + e);
System.out.println("f is = " + f);
}
}