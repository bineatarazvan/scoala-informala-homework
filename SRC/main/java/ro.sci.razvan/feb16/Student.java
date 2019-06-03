package ro.sci.razvan.feb16;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int idStudent;
    private String firstNameStudent;
    private String lastNameStudent;
    List<Materie> materieList;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstNameStudent() {
        return firstNameStudent;
    }

    public void setFirstNameStudent(String firstNameStudent) {
        this.firstNameStudent = firstNameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public List<Materie> getMaterieList() {
        return materieList;
    }

    public void setMaterieList(List<Materie> materieList) {
        this.materieList = materieList;
    }

    public Student() { }
    public Student(int idStudent, String firstNameStudent, String lastNameStudent) {
        this.idStudent = idStudent;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
    }


}
