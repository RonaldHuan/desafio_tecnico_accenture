package br.com.sampleapp.test.business.cadastro;

import static org.testng.Assert.assertTrue;

import br.com.sampleapp.core.utils.UtilidadesPagina;
import br.com.sampleapp.core.webdriver.utilities.BaseTest;
import br.com.sampleapp.core.webdriver.utilities.PageMaker;

public class CadastroLogic {
	
	private UtilidadesPagina utilsPage;
	private CadastroPage cadastroPage;
	
	public CadastroLogic() {
		utilsPage = new UtilidadesPagina();
		cadastroPage = PageMaker.getInstanceWeb(CadastroPage.class);
	}
	
	public void abrirNavegadorHome() {
		System.out.println("que eu esteja na home do site do advantage shopping");
		utilsPage.navigateToURL(CadastroPage.URL_SAMPLEAPP);
		BaseTest.getDriver().manage().window().maximize();
	}
	
	public void selecionarMake(String marca) {
		System.out.println("seleciono a marca " + marca);
		utilsPage.verifyVisibilityElement(cadastroPage.getSeletorMarca());
		utilsPage.click(cadastroPage.getOpcMotorCycle());
		utilsPage.selectElementDropDown(cadastroPage.getSeletorMarca(), marca);
	}
	
	public void selecionarModelo(String modelo) {
		System.out.println("seleciono a marca " + modelo);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorModelo(), modelo);
	}
	
	public void preencherCampoCapacidadeDeCilindro(String cilindrada) {
		System.out.println("preencho o campo capacidade de cilindro " + cilindrada);
		utilsPage.insertText(cadastroPage.getCampoCapacidadeCilindrada(), cilindrada);
	}
	
	public void preencherCampoPerformanceDoMotor(String performance) {
		System.out.println("preencho o campo performance do motor " + performance);
		utilsPage.insertText(cadastroPage.getCampoPerformanceMotor(), performance);
	}
	
	public void preencherCampoDataFabricacao(String data) {
		System.out.println("preencho a data de fabricacao " + data);
		utilsPage.insertText(cadastroPage.getCampoDataDeFabricacao(), data);
	}
	
	public void selecionarNumeroAcentos(String acentos) {
		System.out.println("seleciono o numero de acentos " + acentos);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorNumeroAcentos(), acentos);
	}
	
	public void preencherCampoListaDePrecos(String precos) {
		System.out.println("preencho a lista de preços " + precos);
		utilsPage.insertText(cadastroPage.getCampoListaDePrecos(), precos);
	}
	
	public void preencherCampoQuilometragemAnual(String quilometragem) {
		System.out.println("preencho a quilometragem anual " + quilometragem);
		utilsPage.insertText(cadastroPage.getCampoQuilometragemAnual(), quilometragem);
	}
	
	public void clicarBotaoNext() {
		System.out.println("clico no botao 'Next'");
		utilsPage.click(cadastroPage.getBtnNext());
	}
	
	public void preencherCampoPrimeiroNome(String primeiroNome) {
		System.out.println("preencho o campo primeiro nome " + primeiroNome);
		utilsPage.insertText(cadastroPage.getCampoPrimeiroNome(), primeiroNome);
	}
	
	public void preencherCampoUltimoNome(String ultimoNome) {
		System.out.println("preencho o campo segundo nome " + ultimoNome);
		utilsPage.insertText(cadastroPage.getCampoUltimoNome(), ultimoNome);
	}
	
	public void preencherCampoDataNscimento(String dataNascimento) {
		System.out.println("preencho o campo data de nascimento " + dataNascimento);
		utilsPage.insertText(cadastroPage.getCampoDataNascimento(), dataNascimento);
	}
	
	public void selecionarGeneroSexual(String genero) {
		System.out.println("seleciono o genero sexual " + genero);
		if(genero.contains("masculino")) {
			utilsPage.click(cadastroPage.getCkbMasculino());
		} else {
			utilsPage.click(cadastroPage.getCkbFeminino());
		}
	}
	
	public void preencherCampoEndereco(String endereco) {
		System.out.println("preencho o campo endereco " + endereco);
		utilsPage.insertText(cadastroPage.getCampoEndereco(), endereco);
	}
	
	public void selecionarPais(String pais) {
		System.out.println("seleciono o país " + pais);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorPais(), pais);
	}
	
	public void preencherCampoCep(String cep) {
		System.out.println("preencho o campo cep " + cep);
		utilsPage.insertText(cadastroPage.getCampoCep(), cep);
	}
	
	public void preencherCampoCidade(String cidade) {
		System.out.println("preencho o campo cidade " + cidade);
		utilsPage.insertText(cadastroPage.getCampoCidade(), cidade);
	}
	
	public void selecionarOcupacao(String ocupacao) {
		System.out.println("seleciono a ocupação " + ocupacao);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorOcupacao(), ocupacao);
	}
	
	public void selecionarHobbie() {
		System.out.println("seleciono o hobbie Skydiving");
		utilsPage.click(cadastroPage.getCkbSkydiving());
	}
	
	public void preencherWebSites(String website) {
		System.out.println("preencho o campo websites " + website);
		utilsPage.insertText(cadastroPage.getCkbSkydiving(), website);
	}
	
	public void preencherCampoDataInicio(String dataInicio) {
		System.out.println("preencho o campo data inicio " + dataInicio);
		utilsPage.insertText(cadastroPage.getCampoDataInicio(), dataInicio);
	}
	
	public void selecionarSomaSeguro(String somaSeguro) {
		System.out.println("seleciono a soma do seguro " + somaSeguro);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorSomaDoSeguro(), somaSeguro);
	}
	
	public void selecionarSeguroDanos(String seguroDanos) {
		System.out.println("seleciono o seguro de danos " + seguroDanos);
		utilsPage.selectElementDropDown(cadastroPage.getSeletorSeguroDeDanos(), seguroDanos);
	}
	
	public void selecionarProdutoOpicional() {
		System.out.println("selecino o produto opcional 'Euro Protection'");
		utilsPage.click(cadastroPage.getCkbEuroProtection());
	}
	
	public void selecionarOpcaoSilver() {
		System.out.println("seleciono a opcao 'Silver'");
		utilsPage.click(cadastroPage.getCkbSilver());
	}
	
	public void preencherCampoEmail(String email) {
		System.out.println("preencho o campo email " + email);
		utilsPage.insertText(cadastroPage.getCampoEmail(), email);
	}
	
	public void preencherCampoTelefone(String telefone) {
		System.out.println("preencho o campo telefone " + telefone);
		utilsPage.insertText(cadastroPage.getCampoTelefone(), telefone);
	}
	
	public void preencherCampoUsuario(String usuario) {
		System.out.println("preencho o campo usuario " + usuario);
		utilsPage.insertText(cadastroPage.getCampoUsuario(), usuario);
	}
	
	public void preencherCampoSenha(String senha) {
		System.out.println("preencho o campo senha " + senha);
		utilsPage.insertText(cadastroPage.getCampoSenha(), senha);
	}
	
	public void preencherCampoConfirmarSenha(String senha) {
		System.out.println("preencho o campo confirma senha " + senha);
		utilsPage.insertText(cadastroPage.getCampoConfirmaSenha(), senha);
	}
	
	public void preencherCampoComentario(String comentario) {
		System.out.println("preencho o campo de comentario " + comentario);
		utilsPage.insertText(cadastroPage.getCampoComentario(), comentario);
	}
	
	public void clicarBotaoSend() {
		System.out.println("clico no botao 'Send'");
		utilsPage.click(cadastroPage.getBtnSend());
	}
	
	public void validarEmailEnviado() {
		System.out.println("valido email enviado com sucesso");
		assertTrue(utilsPage.isDisplayed(cadastroPage.getLblSucesso()));
	}
}
