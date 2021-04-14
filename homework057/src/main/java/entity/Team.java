package entity;
import lombok.*;
import javax.persistence.*;
import java.net.URL;
import java.util.Collection;

@Entity
@Table(name = "team")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "logo_address")
    private String logoAddress;

    @Column(unique = true)
    private URL website;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "team_sports",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sport_id"))
    private Collection<Sport> sports;
}
