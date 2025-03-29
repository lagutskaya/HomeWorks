package by.HomeWorks.task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    List<Group> groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
    }
    public void addGroup(Group group){
        groups.add(group);
    }


    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
