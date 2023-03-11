package repository;

import entity.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<Etudiant> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
        students.add(new Etudiant("1","ahmed","salah","ahmedsalah@gmail.com"));
        students.add(new Etudiant("2","mariem","damak","mariamdamak@gmail.com"));
    }
    public List<Etudiant> getAllStudents(){
        return  students;
    }
    public void  saveStudent(Etudiant etudiant){
        students.add(etudiant);
    }
}
