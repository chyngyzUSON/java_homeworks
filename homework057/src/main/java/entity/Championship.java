package entity;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "championship")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "country_id")
    private Collection<Country> countries;

    private String name;

    @OneToMany
    private Collection<Sport> sports;
}
//address