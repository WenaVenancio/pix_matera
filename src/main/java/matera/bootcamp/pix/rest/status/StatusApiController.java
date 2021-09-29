package matera.bootcamp.pix.rest.status;

import matera.bootcamp.pix.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApiController {

    @Autowired
    private ContaCorrenteService contaCorrenteService;

/*
        *** Outra forma de escrever o código acima. ***

    public StatusApiController(ContaCorrenteService contaCorrenteService) {
        this.contaCorrenteService = contaCorrenteService;
    }

        *** Outra forma de escrever o código acima. ***

    private final ContaCorrenteService contaCorrenteService;

*/

    @GetMapping("/api/v1/status")
    public String statusCheck() {
        return "up";

    }
}