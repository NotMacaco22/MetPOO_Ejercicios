package org.cash.models;

import jakarta.persistence.*;
import lombok.*;
import org.cash.keys.CompositeKey;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@Table(name = "student_majors")
public class StudentMajors {

    @EmbeddedId
    private CompositeKey id;

    @ManyToOne
    @MapsId("studentCif")
    @JoinColumn(name = "cif")
    private Student student;

    @ManyToOne
    @MapsId("majorId")
    @JoinColumn(name = "id")
    private Major major;
}
