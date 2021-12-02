package com.drj.algafood.domain.repository;

import com.drj.algafood.domain.model.Estado;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface EstadoRepository {

    List<Estado> listar();

    Estado buscar(Long id);

    Estado salvar(Estado estado);

    void remover(Estado estado);

}
