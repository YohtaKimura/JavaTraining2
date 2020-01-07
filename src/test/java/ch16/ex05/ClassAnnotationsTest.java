package ch16.ex05;

import org.junit.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ClassAnnotationsTest {

    @Test
    public void test() {
        ClassAnnotations.main(new String[]{"ex16_05.Annotated"});
    }

}

@Annotation1
@Annotation2
@Annotation3
class Annotated {

    @Annotation1
    public Annotated() {

    }

    @Annotation1
    @Annotation2
    public int annotatedField;

    @Annotation1
    @Annotation3
    public void annotatedMethod() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation1 {
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation2 {
}

@interface Annotation3 {
}
