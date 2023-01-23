package src;

public class constructor
{
    String name;
    int age;
    String department;

    public constructor(String name,int age,String department)//parameterize constructor
    {
        this.name=name;
        this.age=age;
        this.department=department;

    }
    public constructor()//default constructor
    {
       this.name="imal";
       this.age=21;
       this.department="IT";
    }
}
