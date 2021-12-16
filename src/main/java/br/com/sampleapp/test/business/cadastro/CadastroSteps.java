package br.com.sampleapp.test.business.cadastro;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	
	private CadastroLogic cadastroLogic;
	
	public CadastroSteps() {
		cadastroLogic = new CadastroLogic();
	}
	
	@Given("que eu esteja na home do site do advantage shopping")
	public void que_eu_esteja_na_home_do_site_do_advantage_shopping() throws Throwable {
		cadastroLogic.abrirNavegadorHome();
	}
	
	@When("^seleciono a marca \"([^\"]*)\"$")
	public void selecionarMarca(String marca) throws Throwable {
		cadastroLogic.selecionarMake(marca);
	}
	
	@And("^seleciono o modelo \"([^\"]*)\"$")
	public void selecionarModelo(String modelo) throws Throwable {
		cadastroLogic.selecionarModelo(modelo);
	}
	
	@And("^preencho o campo capacidade de cilindro \"([^\"]*)\"$")
	public void preencherCampoCapacidadeDeCilindro(String cilindrada) throws Throwable {
		cadastroLogic.preencherCampoCapacidadeDeCilindro(cilindrada);
	}
	
	@And("^preencho o campo performance do motor \"([^\"]*)\"$")
	public void preencherCampoPerformanceDoMotor(String performance) throws Throwable {
		cadastroLogic.preencherCampoPerformanceDoMotor(performance);
	}
	
	@And("^preencho a data de fabricacao \"([^\"]*)\"$")
	public void preencherCampoDataFabricacao(String data) throws Throwable {
		cadastroLogic.preencherCampoDataFabricacao(data);
	}
	
	@And("^seleciono o numero de acentos \"([^\"]*)\"$")
	public void selecionarNumeroAcentos(String acentos) throws Throwable {
		cadastroLogic.selecionarNumeroAcentos(acentos);
	}
	
	@And("^preencho a lista de preços \"([^\"]*)\"$")
	public void preencherCampoListaPrecos(String precos) throws Throwable {
		cadastroLogic.preencherCampoListaDePrecos(precos);
	}
	
	@And("^preencho a quilometragem anual \"([^\"]*)\"$")
	public void preencherCampoQuilometragemAnual(String quilometragem) throws Throwable {
		cadastroLogic.preencherCampoQuilometragemAnual(quilometragem);
	}
	
	@And("clico no botao 'Next'")
	public void clicarBotaoNextAbaEnterVehicleData() throws Throwable {
		cadastroLogic.clicarBotaoNext();
	}
	
	@And("^preencho o campo primeiro nome \"([^\"]*)\"$")
	public void preencherCampoPrimeiroNome(String primeiroNome) throws Throwable {
		cadastroLogic.preencherCampoPrimeiroNome(primeiroNome);
	}
	
	@And("^preencho o campo ultimo nome \"([^\"]*)\"$")
	public void preencherCampoUltimoNome(String ultimoNome) throws Throwable {
		cadastroLogic.preencherCampoUltimoNome(ultimoNome);
	}
	
	@And("^preencho o campo data de nascimento \"([^\"]*)\"$")
	public void preencherCampoDataNscimento(String dataNascimento) throws Throwable {
		cadastroLogic.preencherCampoDataNscimento(dataNascimento);
	}
	
	@And("^seleciono o genero sexual \"([^\"]*)\"$")
	public void selecionarGeneroSexual(String genero) throws Throwable {
		cadastroLogic.selecionarGeneroSexual(genero);
	}
	
	@And("^preencho o campo endereco \"([^\"]*)\"$")
	public void preencherCampoEndereco(String endereco) throws Throwable {
		cadastroLogic.preencherCampoEndereco(endereco);
	}
	
	@And("^seleciono o país \"([^\"]*)\"$")
	public void selecionarPais(String pais) throws Throwable {
		cadastroLogic.selecionarPais(pais);
	}
	
	@And("^preencho o campo cep \"([^\"]*)\"$")
	public void preencherCampoCep(String cep) throws Throwable {
		cadastroLogic.preencherCampoCep(cep);
	}
	
	@And("^preencho o campo cidade \"([^\"]*)\"$")
	public void preencherCampoCidade(String cidade) throws Throwable {
		cadastroLogic.preencherCampoCidade(cidade);
	}
	
	@And("^seleciono a ocupação \"([^\"]*)\"$")
	public void selecionarOcupacao(String ocupacao) throws Throwable {
		cadastroLogic.selecionarOcupacao(ocupacao);
	}
	
	@And("seleciono o hobbie 'Skydiving'")
	public void selecionarhobbie() throws Throwable {
		cadastroLogic.selecionarHobbie();
	}
	
	@And("^preencho o campo websites \"([^\"]*)\"$")
	public void preencherWebSites(String websites) throws Throwable {
		cadastroLogic.preencherWebSites(websites);
	}
	
	@And("^preencho o campo data inicio \"([^\"]*)\"$")
	public void preencherCampoDataInicio(String dataInicio) throws Throwable {
		cadastroLogic.preencherCampoDataInicio(dataInicio);
	}
	
	@And("^seleciono a soma do seguro \"([^\"]*)\"$")
	public void selecionarSomaSeguro(String somaSeguro) throws Throwable {
		cadastroLogic.selecionarSomaSeguro(somaSeguro);
	}
	
	@And("^seleciono o seguro de danos \"([^\"]*)\"$")
	public void selecionarSeguroDanos(String seguroDanos) throws Throwable {
		cadastroLogic.selecionarSeguroDanos(seguroDanos);
	}
	
	@And("selecino o produto opcional 'Euro Protection'")
	public void selecionarProdutoOpicional() throws Throwable {
		cadastroLogic.selecionarProdutoOpicional();
	}
	
	@And("seleciono a opcao 'Silver'")
	public void selecionarOpcaoSilver() throws Throwable {
		cadastroLogic.selecionarOpcaoSilver();
	}
	
	@And("^preencho o campo email \"([^\"]*)\"$")
	public void preencherCampoEmail(String email) throws Throwable {
		cadastroLogic.preencherCampoEmail(email);
	}
	
	@And("^preencho o campo telefone \"([^\"]*)\"$")
	public void preencherCampoTelefone(String telefone) throws Throwable {
		cadastroLogic.preencherCampoTelefone(telefone);
	}
	
	@And("^preencho o campo usuario \"([^\"]*)\"$")
	public void preencherCampoUsuario(String usuario) throws Throwable {
		cadastroLogic.preencherCampoUsuario(usuario);
	}
	
	@And("^preencho o campo senha \"([^\"]*)\"$")
	public void preencherCampoSenha(String senha) throws Throwable {
		cadastroLogic.preencherCampoSenha(senha);
	}
	
	@And("^preencho o campo confirma senha \"([^\"]*)\"$")
	public void preencherCampoConfirmarSenha(String senha) throws Throwable {
		cadastroLogic.preencherCampoConfirmarSenha(senha);
	}
	
	@And("^preencho o campo de comentario \"([^\"]*)\"$")
	public void preencherCampoComentario(String comentario) throws Throwable {
		cadastroLogic.preencherCampoComentario(comentario);
	}
	
	@And("clico no botao 'Send'")
	public void clicarBotaoSend() throws Throwable {
		cadastroLogic.clicarBotaoSend();
	}
	
	@Then("valido email enviado com sucesso")
	public void validarEmailEnviado() throws Throwable {
		cadastroLogic.validarEmailEnviado();
	}
}
