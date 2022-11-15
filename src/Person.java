import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Person{

    public String name;

    public Date birthDate;

    LocalDate today = LocalDate.now();
    LocalDate birthdate = LocalDate.of(1990,8,18);

    public Person(String name, Date birthday){
        this.name = name;
        this.birthDate = birthday;
    }

    public int calculateAge(){
        Period.between(birthdate, today).getYears();
        return calculateAge();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getBirthday() {
        return birthDate;
    }

    public void setBirthday(Date birthday) {
        this.birthDate = birthday;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", birthday=" + birthDate + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o; return name.equals(person.name) && birthDate.equals(person.birthDate);
    }

}
