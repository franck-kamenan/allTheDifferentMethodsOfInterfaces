package be.intecbrussel.hoofdstuk13;

public interface MyInterface
{
    public final int CONST = 666;

    public void method();
    public default void defaultMethod()
    {
        System.out.println("Default SETTINGS");
        privateMethod();
        privateStaticMethod();
    }
    public static void staticMethod()
    {
        System.out.println("Static SHOCK");
        privateStaticMethod();
    }
    private void privateMethod()
    {
        System.out.println("This is PRIVATE");
    }
    private static void privateStaticMethod()
    {
        System.out.println("Static is a very PRIVATE HERO");
    }
}
