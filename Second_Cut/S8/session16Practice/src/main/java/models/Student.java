package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {
    //    TODO: Add relationship between Student and City

    @Id @NotNull
    @Column(nullable = false)
    @Getter
    private String cif;

    @NotNull(message = "Student First Name cannot be null.")
    @Getter @Setter
    @Column(nullable = false)
    private String firstName;
    private String lastName;

    @NotNull(message = "Student Email cannot be null.")
    @Email
    @Getter @Setter
    @Column(nullable = false, unique = true)
    private String email;


}
