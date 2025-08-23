package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계라 쓸수 있음
        //defaultValue // 다른 패키지 접근 불가, 컴파일 오류
        //privateValue // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();

        printParent();
    }
}
