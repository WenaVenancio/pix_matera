package matera.bootcamp.pix.domain.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @OneToOne(optional = false, cascade = {CascadeType.ALL})
    private ContaCorrente contaCorrente;

}