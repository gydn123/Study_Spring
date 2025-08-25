package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Child 호출");
        call(parent2);
    }

    private static void call(Parent parent1) {
        parent1.parentMethod();
        if (parent1 instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent1).childMethod();
        }
    }
}
