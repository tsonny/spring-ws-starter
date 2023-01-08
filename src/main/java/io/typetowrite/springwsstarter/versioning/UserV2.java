package io.typetowrite.springwsstarter.versioning;

public class UserV2 {
    private String firstName;
    private String lastName;

    public UserV2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
