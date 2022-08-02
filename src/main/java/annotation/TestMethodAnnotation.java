package annotation;

import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestMethodAnnotation {
    @Override
    @MyMethodAnnotation(title = "toStringMethod", description = "Override toString method")
    public String toString() {
        return "Override toString method";
    }

    @Deprecated
    @MyMethodAnnotation(title = "old static method", description = "old method, don`t use it")
    public static void oldMethod() {
        System.out.println("old method, don`t use it");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @MyMethodAnnotation(title = "test method", description = "suppress warning static method")
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }

    public static void main(String[] args) {
        try {
            Method[] methods = TestMethodAnnotation.class.getClassLoader()
                    .loadClass("annotation.TestMethodAnnotation")
                    .getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyMethodAnnotation.class)) {
                    for (Annotation anno : method.getDeclaredAnnotations()) {
                        System.out.println("Annotation is Method '" + method + "' : " + anno);
                    }
                    MyMethodAnnotation methodAnnotation = method.getAnnotation(MyMethodAnnotation.class);
                    System.out.println(methodAnnotation.title());
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
