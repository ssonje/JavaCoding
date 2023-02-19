class A {

    void show() {
        System.out.println("Class A Show method is called.");
    }

}

class B {

    void show() {
        System.out.println("Class B Show method is called.");
    }

}
// Causing error as Multiple inheritance is not allowed in Java.
// public class DiamondProblemMultipleInheritance extends A, B {
public class DiamondProblemMultipleInheritance extends A {

    public static void main(String[] args) {
        DiamondProblemMultipleInheritance object = new DiamondProblemMultipleInheritance();
        object.show();
    }

}
