//java program to demonstrate Narrow type casting
import java.io.*;
class Test15 {
public static void main(String args[])
{
double i=100.245;
//Narrow Type casting
short j=(short)i;
int k=(int)i;
System.out.println("Orginal Value before Casting"+i);
System.out.println("After Type Casting to short"+j);
System.out.println("After Type Casting to int"+k);
}
}
