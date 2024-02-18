package Les05;

public class Tirgul {
    public static void main(String[] args) {
//        B b1 = new A();
//        B b2 = new C();
//        A a1 = (C) b2;
//        D d1 = new C();
//        B b3 = new B();
//        D d2 = new A();
    }

    public class B {}
    public class D extends B {}
    public class A extends D {}
    public class C extends A {}
}
