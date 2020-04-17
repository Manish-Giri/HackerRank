package testvar;

public class TestVarInheritance {


    class A {
        int p = 10;
        void show() {
            System.out.println("In Class A: " + p);
        }
    }

    class B extends A {
        int x = 20;

        void show() {
            System.out.println("In Class B: " + x);
        }
    }

    class C extends B {
        int y = 30;

        void show() {
            System.out.println("In Class C: " + y);
        }
    }

    private A getInstance(int choice) {
        switch (choice) {
            case 0: return new A();
            case 1: return new B();
            case 2: return new C();
            default: return new A();
        }
    }

    public static void main(String[] args) {
        TestVarInheritance obj = new TestVarInheritance();
        var first = obj.getInstance(0);
        var second = obj.getInstance(1);
        var third = obj.getInstance(2);


        System.out.println(first.p);
        // System.out.println(second.x);

        first.show();
        second.show();
        third.show();

    }

}
