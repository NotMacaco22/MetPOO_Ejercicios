package org.cash.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "majors")
public class Major {

    @Positive(message = "Not valid Id") @NotNull(message = "Major Id cannot be null.")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Getter
    private Long id;

    @NotNull(message = "Major Name cannot be empty.")
    @Getter @Setter
    @Column(name = "name", nullable = false, unique = true, length = 100)
    private String name;

    @NotNull(message = "Faculty cannot be null.")
    @ManyToOne
    @JoinColumn(name = "faculty_id", nullable = false)
    @Getter @Setter
    private Faculty faculty;

    // i know that put Long id instead of Faculty faculty sounds better
    // but the objective of JPA is to work with relationships between the objects instead of id
    public Major(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    @OneToMany(mappedBy = "major")
    private List<StudentMajors> students;
}
