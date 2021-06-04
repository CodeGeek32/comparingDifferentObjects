package objComparer.app.classes;

import java.util.Objects;

public class B {
    public String fieldA;
    public String fieldB;
    public Object fieldC;
    public int fieldD;

    public B(String a, String b, Object c, int d) {
        fieldA = a;
        fieldB = b;
        fieldC = c;
        fieldD = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;
        B b = (B) o;
        return Objects.equals(fieldA, b.fieldA) && Objects.equals(fieldB, b.fieldB) && Objects.equals(fieldC, b.fieldC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldA, fieldB, fieldC);
    }
}
