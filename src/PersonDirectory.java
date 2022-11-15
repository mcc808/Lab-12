import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PersonDirectory {

    ArrayList<Person> Ages = new ArrayList<>();

    public PersonDirectory(ArrayList<Person> ages) {
        Ages = ages;
    }

    public int calculateAverageAge(){
        list.get(i).getAges();

    }

    public ArrayList<Person> getAges() {
        return Ages;
    }

    public void setAges(ArrayList<Person> ages) {
        Ages = ages;
    }

    @Override
    public String toString() {
        return "PersonDirectory{" + "Person=" + Ages + ", Person=" + Ages + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDirectory that = (PersonDirectory) o;
        return Ages.equals(that.Ages) && Ages.equals(that.Ages);
    }

}
