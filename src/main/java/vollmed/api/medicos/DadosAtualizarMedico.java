package vollmed.api.medicos;

import jakarta.validation.constraints.NotNull;
import vollmed.api.endereco.DadosEndereco;

public record DadosAtualizarMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {

}
