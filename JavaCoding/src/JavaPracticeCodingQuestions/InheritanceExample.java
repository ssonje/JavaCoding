package JavaPracticeCodingQuestions;

public class InheritanceExample extends ParentClass {

    public static void main(String[] args) {
        // Call the parent class `show()` method
        ParentClass parentClass = new InheritanceExample();
        parentClass.show();
    }

}

class ParentClass {

    public void show() {
        System.out.println("Parent Show method is called");
    }

}
