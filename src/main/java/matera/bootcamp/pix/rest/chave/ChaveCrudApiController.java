package matera.bootcamp.pix.rest.chave;

import lombok.RequiredArgsConstructor;
import lombok.var;
import matera.bootcamp.pix.domain.model.Chave;
import matera.bootcamp.pix.service.chave.ChaveCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ChaveCrudApiController {

    private final ChaveCrudService chaveCrudService;

    @PostMapping("/api/v1/chave")
    public ResponseEntity<Chave> cadastroChave(@RequestBody Chave chave) {

        if (chave.getId() != null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCriada = chaveCrudService.cadastrarChave(chave);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(chaveCriada);
    }

    @PutMapping("/api/v1/chave")
    public ResponseEntity<Chave> atualizarChave(@RequestBody Chave chave) {

        if (chave.getId() == null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCriada = chaveCrudService .cadastrarChave(chave);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(chaveCriada);
    }
}