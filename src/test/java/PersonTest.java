import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person1;

    @Before
    public void before() {
        person1 = new Person("Henry VIII");
    }

    @Test
    public void hasName() {
        assertEquals("Henry VIII", person1.getName());
    }
}
