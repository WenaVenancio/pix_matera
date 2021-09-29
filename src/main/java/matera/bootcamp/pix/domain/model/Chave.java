package matera.bootcamp.pix.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Chave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TipoChave tipoChave;

    @Column(nullable = false)
    private String valor;

    @ManyToOne(optional = false)
    private ContaCorrente contaCorrente;
}