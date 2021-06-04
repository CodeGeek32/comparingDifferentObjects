package objComparer.app;

import com.cedarsoftware.util.DeepEquals;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import objComparer.app.classes.C;
import objComparer.app.classesDeep.classes.A;
import objComparer.app.classesDeep.classes.B;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_EXTRA_FIELDS;


public class ComparingViaDeepComparison {
    @Test
    public void testGetMessage() throws JsonProcessingException {
        Object o = new Object();
        A a = new A("a", "b", o);
        B b = new B("a", "b", o, 1);
        C c = new C("a", "b", o);

        A a1 = new A("a", "b", o);
        A a2 = new A("a", "b", o);

        System.out.println("A equals B: " + DeepEquals.deepEquals(a, b));
        System.out.println("A equals C: " + DeepEquals.deepEquals(a, c));
        System.out.println("A1 equals A2: " + DeepEquals.deepEquals(a1, a2));
    }
}
