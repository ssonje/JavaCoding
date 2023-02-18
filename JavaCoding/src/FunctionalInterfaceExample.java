import java.lang.*;

@FunctionalInterface
interface FunctionalInterfaceInterface {
    void sampleMethod();
}

public class FunctionalInterfaceExample implements FunctionalInterfaceInterface {

    @Override
    public void sampleMethod() {
        System.out.println("Sample method.");
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample object = new FunctionalInterfaceExample();
        object.sampleMethod();
    }
}

