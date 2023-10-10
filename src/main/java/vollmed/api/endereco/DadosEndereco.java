package vollmed.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
		@NotBlank 
		String logradouro, 
		String numero, 
		String complemento, 
		@NotBlank 
		String bairro, 
		@NotBlank 
		String cidade, 
		@NotBlank
		@Pattern(regexp = "AC|AL|AM|AP|BA|CE|DF|ES|GO|MA|MG|MS|MT|PA|PB|PE|PI|PR|RJ|RN|RO|RR|RS|SC|SE|SP|TO")
		String uf, 
		@NotBlank 
		@Pattern(regexp = "\\d{8}") 
		String cep 
		){

}
