package vollmed.api.pacientes;

import jakarta.validation.Valid;
import vollmed.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, @Valid DadosEndereco endereco) {

}
