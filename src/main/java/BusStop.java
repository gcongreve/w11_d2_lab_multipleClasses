import java.util.ArrayList;

public class BusStop {
    private  String name;
    private ArrayList<Person> queue;



    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();

    }



    public String getName() {
        return this.name;
    }


    public int personCount() {
        return queue.size();
    }

    public void addPerson(Person person1) {
        this.queue.add(person1);
    }

    public Person removePerson() {
       return this.queue.remove(0);
    }
}
