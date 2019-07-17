package bd.com.penguin.lzyrest.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author bashir
 * @since 7/17/19
 */
@Data
@Entity
@EqualsAndHashCode(exclude = "order")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String name;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Order order;
}