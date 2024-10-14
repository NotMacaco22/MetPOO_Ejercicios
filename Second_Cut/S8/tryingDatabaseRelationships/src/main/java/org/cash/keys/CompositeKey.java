package org.cash.keys;

import jakarta.persistence.Embeddable;
import lombok.*;

// This annotation indicates that this class is going to be used by other classes.
// In this case as a composite key

@Embeddable @EqualsAndHashCode @ToString
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class CompositeKey {
    private String studentCif;
    private Long majorId;
}
