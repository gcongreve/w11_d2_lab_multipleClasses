import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private BusStop busStop;


    @Before
    public void before() {
        bus = new Bus("Leith", 2);
        person1 = new Person("Henry VIII");
        person2 = new Person("Joan of Arc");
        person3 = new Person("Rob Wilson");
        busStop = new BusStop("Leith Street");
    }

    @Test
    public void busHasDestination() {
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void canTakePassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canFailToTakePassengerOvercapacity() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);

        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemoveAPassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUpFromBusStop(){
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        busStop.addPerson(person3);
        bus.pickUp(busStop, 2);
        assertEquals(1, busStop.personCount());
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canPickUpFromBusStopToCapacity(){
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        busStop.addPerson(person3);
        bus.pickUp(busStop, 3);
        assertEquals(1, busStop.personCount());
        assertEquals(2, bus.passengerCount());
    }


}
