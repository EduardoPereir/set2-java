package entities;

public class Students {

    private Integer id;

    public Students(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        return getId().equals(students.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
