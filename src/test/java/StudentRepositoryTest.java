import fr.aelion.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRepositoryTest {
    StudentRepository studentRepository;
    @BeforeEach
    public void setup() {
        studentRepository = new StudentRepository();
    }

    @Test
    @DisplayName("Student list should have 1 element")
    public void studentInstantiationTest(){
        assertEquals(1, studentRepository.listSize());
    }
}
