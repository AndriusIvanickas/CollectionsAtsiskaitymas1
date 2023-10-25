import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Library() {
    }

    public Library(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String toString() {
        return "Library name: " + name;
    }

    public void addDepartment(Department element) {
       departments.add(element);
    }

    public Edition findEdition(int yearOfPublication) {
        for (Department department : departments) {
            Edition foundEdition = department.getLibrary().findEdition(yearOfPublication);

            if (foundEdition != null) {
                return foundEdition;
            }
        }
        return null;
    }



}


