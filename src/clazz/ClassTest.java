package clazz;

import java.lang.reflect.Constructor;

public class ClassTest {
    private ClassTest() {
    }

    public ClassTest(String name) {
        System.out.println("execute the constructor with parameter");
    }

    public void info() {
        System.out.println("execute the method without any parameter");
    }

    public void info(String str) {
        System.out.println("execute the method with parameter" + ", its parameter is " + str);
    }

    public static void main(String[] args) {
        Class<ClassTest> clazz = ClassTest.class;
        Constructor[] ctors = clazz.getDeclaredConstructors();
        System.out.println("All the constructors are as follows");
        for (Constructor c : ctors) {
            System.out.println(c);
        }
        Constructor[] publicCtors = clazz.getConstructors();
        System.out.println("All the public constructors are as follows");
        for (Constructor c : publicCtors) {
            System.out.println(c);
        }
    }
}
