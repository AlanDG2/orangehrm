package orangehrm.utils;

import com.github.javafaker.Faker;



public class DataGenerator {
    private static final Faker faker = new Faker();


    public static String getFirstName() { return faker.name().firstName(); }
    public static String getMiddleName() { return faker.name().firstName(); }
    public static String getLastName() { return faker.name().lastName(); }
    public static String getEmail() { return faker.internet().emailAddress(); }
    public static String getPhoneNumber() { return faker.phoneNumber().cellPhone().replaceAll("[,.-]", "");

    }


}