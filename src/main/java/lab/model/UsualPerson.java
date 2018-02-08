package lab.model;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Value
public class UsualPerson implements Person {
    private int id;
    private String firstName;
    private String lastName;
    private Country country;
    private int age;
    private int height;
    private boolean isProgrammer;
    @Autowired
    private List contacts;
}