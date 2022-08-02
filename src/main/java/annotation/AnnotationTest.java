package annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {

    }
}

class A {
    public void test() {

    }
}
class B extends A {
    @Override
    public void test() {

    }
    @Deprecated
    public void oldMethod() {

    }

    @SuppressWarnings("rawtypes")
    public List processList() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }
}
