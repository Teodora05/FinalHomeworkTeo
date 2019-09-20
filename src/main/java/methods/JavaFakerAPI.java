package methods;

import com.github.javafaker.Faker;
import com.github.javafaker.Job;

public class JavaFakerAPI {
    Faker faker = new Faker();

    public String getFirstName() {


        String firstName = faker.name().firstName();
        return firstName;
    }

    public String getLastName() {

        String lastName = faker.name().lastName();
        return lastName;
    }

    public String getSpecialties() {

        String specialties = faker.job().title();
        return specialties;
    }

    public String specialtiesName = getSpecialties();



}
