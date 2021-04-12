package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "pizza_box")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class PizzaBox {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "color")
    private String color;

    @Column(name = "destination_address")
    private String destinationAddress;

    @OneToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    @Override
    public String toString() {
        return "Доставляем пиццу " + pizza.getName() +
                " по адресу " + destinationAddress +
                ", цвет коробки " + color +
                ", стоимость " + pizza.getPrice() + "\n";
    }
}
