package lesson19;

import java.util.List;

public class Root {

    private String name;
    private List<Person> personList;

    public Root() {
    }

    public Root(String name, List<Person> personList) {
        this.name = name;
        this.personList = personList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", personList=" + personList +
                '}';
    }
}
