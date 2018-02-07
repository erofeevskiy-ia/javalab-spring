import com.epam.jl.demo.ioc.Person;
import lab.model.UsualPerson;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    @DisplayName("Name method works correctly")
    void Name() {
        val context = new ClassPathXmlApplicationContext("application-context.xml");
        val person = context.getBean("person", UsualPerson.class);
        System.out.println(person);
    }
}
