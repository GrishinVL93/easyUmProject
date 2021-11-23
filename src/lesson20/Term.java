package lesson20;

import java.util.ArrayList;

public class Term {
    private int id;
    private String name;
    private int status;
    private String length;
    private ArrayList<Discipline> disciplines = new ArrayList<>();


    public Term() {
    }

    public Term(int id, String name, int status, String length, ArrayList<Discipline> disciplines) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.length = length;
        this.disciplines = disciplines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void addDiscipline(Discipline discipline){
        disciplines.add(discipline);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Term term = (Term) o;

        if (id != term.id) return false;
        if (status != term.status) return false;
        if (name != null ? !name.equals(term.name) : term.name != null) return false;
        if (length != null ? !length.equals(term.length) : term.length != null) return false;
        return disciplines != null ? disciplines.equals(term.disciplines) : term.disciplines == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (disciplines != null ? disciplines.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", length='" + length + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
