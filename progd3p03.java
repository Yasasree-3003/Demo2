class Student{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
}
class BCD2{
public static void main(String args[])
{
Student n=new Student();
n.setId(3003);
n.setName("yasasree");
System.out.println("id:"+n.getId());
System.out.println("name:"+n.getName());
}
}
