package matera.bootcamp.pix.service.usuario;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.pix.domain.model.ContaCorrente;
import matera.bootcamp.pix.domain.repository.ContaCorrenteRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConsultaContaUsuarioService {

    private final ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrente consultarContaPorUsuarioId(Long id) {
        return null;
    }
}
