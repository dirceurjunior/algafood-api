package com.drj.algafood.api.controller;

import com.drj.algafood.api.model.CozinhasXmlWrapper;
import com.drj.algafood.domain.model.Cozinha;
import com.drj.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
//@RequestMapping(value = "/cozinhas") //, produces = MediaType.APPLICATION_JSON_VALUE)
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

//    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public List<Cozinha> listar() {
//        return cozinhaRepository.listar();
//    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cozinha> listarJSON() {
        //System.out.println("LISTAR JSON");
        return cozinhaRepository.listar();
    }

//    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
//    public List<Cozinha> listarXML() {
//        //System.out.println("LISTAR XML");
//        return cozinhaRepository.listar();
//    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public CozinhasXmlWrapper listarXml() {
        return new CozinhasXmlWrapper(cozinhaRepository.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinha> buscar(@PathVariable Long id)  {
        Cozinha cozinha = cozinhaRepository.buscar(id);
        if(cozinha != null){
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
        // return ResponseEntity.status(HttpStatus.OK).body(cozinha);
        // return ResponseEntity.ok(cozinha);
//        HttpHeaders headers = new HttpHeaders();
//        headers.add(HttpHeaders.LOCATION, "http://localhost:8080/cozinhas");
//        return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
    }

}
