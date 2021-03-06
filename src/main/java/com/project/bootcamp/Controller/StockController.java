package com.project.bootcamp.Controller;
import com.project.bootcamp.Model.dto.StockDTO;
import com.project.bootcamp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping (value = "/stock") // A forma para acessar o método a URL. EX localhost:porta/bootcamp/stock
public class StockController {

    @Autowired
    private StockService service;

    // Responder algo para quem estar requisitando, ou seja responder o próprio DTO
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // Para inserir algo
    public ResponseEntity <StockDTO> save(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // Atualizar
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){

        return ResponseEntity.ok(service.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) // Obter dados
    public ResponseEntity<List<StockDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id){
        // Obter o ID // Encontrar pelo as informações pelo ID

        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> delete(@PathVariable Long id){
        return ResponseEntity.ok(service.delete(id));

    }

    @GetMapping(value = "/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findByToday(){
        return ResponseEntity.ok(service.findByToday());
    }
}
