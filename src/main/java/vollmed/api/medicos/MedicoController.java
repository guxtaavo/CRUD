package vollmed.api.medicos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medicos")
public class MedicoController {
	@Autowired
	private MedicoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dados) {
		repository.save(new Medico(dados));
	}

	@GetMapping
	public Page<DadosListagemMedico> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
		return repository.findAll(paginacao).map(DadosListagemMedico::new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizarMedico dados) {
		var medico = repository.getReferenceById(dados.id());
		medico.atualizarInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
        //var medico = repository.getReferenceById(id);
		// ou pode se fazer uma exclusão lógica
    }
	
}
