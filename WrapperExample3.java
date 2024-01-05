//converting all primitive datatypes into correspo=nding wrapper objects and vice-versa
public class WrapperExample3
{
public static void main(String args[])
{
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
//autoboxing
boolean b2=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean booleanobj=b2;
System.out.println("----Printing object values----");
System.out.println("Byte object:"+byteobj);
System.out.println("Short object:"+shortobj);
System.out.println("Integer object:"+intobj);
System.out.println("Long object:"+longobj);
System.out.println("Float object:"+floatobj);
System.out.println("Double object:"+doubleobj);
System.out.println("Character object:"+charobj);
System.out.println("Boolean object:"+booleanobj);c

//unboxing
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean booleanvalue=booleanobj;
System.out.println("----Printing primitive values----");
System.out.println("byte value="+bytevalue);
System.out.println("short value="+shortvalue);
System.out.println("int value="+intvalue);
System.out.println("long value="+longvalue);
System.out.println("float value="+floatvalue);
System.out.println("double value="+doublevalue);
System.out.println("char value="+charvalue);
System.out.println("boolean value="+booleanvalue);
}
}














