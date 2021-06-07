package objComparer.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import objComparer.app.classes.A;
import objComparer.app.classes.B;
import objComparer.app.classes.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.json;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_EXTRA_FIELDS;


public class MessageUtilsTest {
    @Test
    public void testGetMessage() throws JsonProcessingException {
        A aaa = new A("1", "2", null);
        A a = new A("a", "b", aaa);
        B b = new B("a", "b", aaa, 1);
        C c = new C("a", "b", aaa);

        assertThatJson(c)
                .isEqualTo(a);

        assertThatJson(b)
                .when(IGNORING_EXTRA_FIELDS)
                .isEqualTo(a);

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
//        var jsonTreeA = objectMapper.valueToTree(a);
//        var jsonTreeB = objectMapper.valueToTree(b);
//        var jsonTreeC = objectMapper.valueToTree(c);


//        assertThatJson(jsonTreeC)
//                .isEqualTo(jsonTreeA);
//
//        assertThatJson(jsonTreeB)
//                .when(IGNORING_EXTRA_FIELDS)
//                .isEqualTo(jsonTreeA);
//
//        Assertions.assertEquals(a.hashCode(), c.hashCode());
    }
}
