package org.cash.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "faculties")
public class Faculty {

    @NotNull(message = "Faculty Id can not be empty.")
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull(message = "Faculty Name can not be empty.")
    @Getter @Setter
    @Column(name = "name", nullable = false, unique = true, length = 100)
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

}
