package hello.core.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeTest {

    @Test
    void prototypeBeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeTest.PrototypeBean.class);
        System.out.println("find PrototypeBean1");
        PrototypeTest.PrototypeBean PrototypeBean1 = ac.getBean(PrototypeTest.PrototypeBean.class);
        System.out.println("find PrototypeBean2");
        PrototypeTest.PrototypeBean PrototypeBean2 = ac.getBean(PrototypeTest.PrototypeBean.class);
        System.out.println("PrototypeBean1 = " + PrototypeBean2);
        System.out.println("PrototypeBean2 = " + PrototypeBean2);
        Assertions.assertThat(PrototypeBean1).isNotSameAs(PrototypeBean2);

        PrototypeBean1.destroy();
        PrototypeBean2.destroy();

        ac.close();
    }

    @Scope("prototype")
    static class PrototypeBean {
        @PostConstruct
        public void init() {
            System.out.println("PrototypeBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("PrototypeBean.destroy");
        }
    }
}
