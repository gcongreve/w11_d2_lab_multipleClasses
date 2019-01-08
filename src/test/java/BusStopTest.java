
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Person person1;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Leith", 2);
        person1 = new Person("Henry VII");
        busStop = new BusStop("Leith Street");
    }

    @Test
    public void hasName(){
        assertEquals("Leith Street", busStop.getName());
    }

    @Test
    public void startsWithEmptyQueue(){
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canAddPeople(){
        busStop.addPerson(person1);
        assertEquals(1, busStop.personCount());
    }

    @Test
    public void canRemovePeople(){
        busStop.addPerson(person1);
        assertEquals(1, busStop.personCount());
        busStop.removePerson();
        assertEquals(0, busStop.personCount());
    }

}
