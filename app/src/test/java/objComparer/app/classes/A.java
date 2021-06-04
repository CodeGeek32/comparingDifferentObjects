package objComparer.app.classes;

import java.util.Objects;

public class A {
    public String fieldA;
    public String fieldB;
    public Object fieldC;

    public A(String a, String b, Object c) {
        fieldA = a;
        fieldB = b;
        fieldC = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return Objects.equals(fieldA, a.fieldA) && Objects.equals(fieldB, a.fieldB) && Objects.equals(fieldC, a.fieldC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldA, fieldB, fieldC);
    }
}
