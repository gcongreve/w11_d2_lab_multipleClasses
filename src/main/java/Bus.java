import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean atCapacity() {
        return this.passengers.size() >= this.capacity;
    }

    public void addPassenger(Person person) {
        if (!atCapacity()) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop, int newPassengers) {
        for (int i = 0; i < newPassengers; i++) {
            if (!atCapacity()) {
                addPassenger(busStop.removePerson());
            }
        }
    }
}
