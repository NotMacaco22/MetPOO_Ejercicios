package models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Entity(name = "cities")
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
@NamedQueries(
        {
                @NamedQuery(name = "City.findAll", query = "SELECT c from City c")
        }
)
public class City extends BaseEntity {

//    @Id @Getter
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_city", nullable = false)
//    private Long id;

    @NotNull
    @Length(min = 2, max = 20)
    @Getter @Setter
    @Column(name = "name_city", nullable = false, unique = true)
    private String nameCity;

    @NotNull
    @Getter @Setter
    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean status;

//    TODO: Add relationship between Student and City


}
