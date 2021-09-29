package matera.bootcamp.pix.domain.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @OneToOne(optional = false)
    private ContaCorrente contaCorrente;

}