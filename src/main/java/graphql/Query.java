package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entity.Etudiant;
import repository.StudentRepository;

import java.util.List;

public class Query implements GraphQLRootResolver {
    private final StudentRepository studentRepository;

    public Query(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public List<Etudiant> allStudents(){
        return studentRepository.getAllStudents();
    }
}
