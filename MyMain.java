package be.intecbrussel.hoofdstuk13;

public class MyMain
{
    public static void main(String[] args)
    {
        MyInterface.staticMethod();
        System.out.println(MyClass.CONST);
        MyClass monObjet = new MyClass();
        monObjet.method();
        System.out.println(monObjet.CONST);
        monObjet.defaultMethod();
    }


}
