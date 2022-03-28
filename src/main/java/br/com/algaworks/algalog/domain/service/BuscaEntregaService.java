package br.com.algaworks.algalog.domain.service;

import br.com.algaworks.algalog.domain.exception.EntidadeNaoEcontradaException;
import br.com.algaworks.algalog.domain.model.Entrega;
import br.com.algaworks.algalog.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

    private EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId) {
        return entregaRepository.findById(entregaId)
                .orElseThrow(() -> new EntidadeNaoEcontradaException("Entrega não encontrada."));
    }

}
