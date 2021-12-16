package br.com.sampleapp.test.business.cadastro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.sampleapp.core.webdriver.utilities.Page;
import lombok.Getter;

@Getter
public class CadastroPage implements Page {
	
	public static String URL_SAMPLEAPP = "http://sampleapp.tricentis.com/101/app.php";
	
	@FindBy(xpath = "(//a[text()='Motorcycle'])[1]")
	private WebElement opcMotorCycle;
	
	@FindBy(xpath = "//select[@id='make']")
	private WebElement seletorMarca;
	
	@FindBy(xpath = "//select[@id='model']")
	private WebElement seletorModelo;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']")
	private WebElement campoCapacidadeCilindrada;
	
	@FindBy(xpath = "//input[@id='engineperformance']")
	private WebElement campoPerformanceMotor;
	
	@FindBy(xpath = "//input[@id='dateofmanufacture']")
	private WebElement campoDataDeFabricacao;
	
	@FindBy(xpath = "//select[@id='numberofseatsmotorcycle']")
	private WebElement seletorNumeroAcentos;
	
	@FindBy(xpath = "//input[@id='listprice']")
	private WebElement campoListaDePrecos;
	
	@FindBy(xpath = "//input[@id='annualmileage']")
	private WebElement campoQuilometragemAnual;
	
	@FindBy(xpath = "(//button[@id='nextenterinsurantdata'])[1]")
	private WebElement btnNext;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement campoPrimeiroNome;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement campoUltimoNome;
	
	@FindBy(xpath = "//input[@id='birthdate']")
	private WebElement campoDataNascimento;
	
	@FindBy(xpath = "//input[@id='gendermale']")
	private WebElement ckbMasculino;
	
	@FindBy(xpath = "//input[@id='genderfemale']")
	private WebElement ckbFeminino;
	
	@FindBy(xpath = "//input[@id='streetaddress']")
	private WebElement campoEndereco;
	
	@FindBy(xpath = "//select[@id='country']")
	private WebElement seletorPais;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement campoCep;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement campoCidade;
	
	@FindBy(xpath = "//select[@id='occupation']")
	private WebElement seletorOcupacao;
	
	@FindBy(xpath = "//input[@id='skydiving']")
	private WebElement ckbSkydiving;
	
	@FindBy(xpath = "//input[@id='website']")
	private WebElement campoWebSite;
	
	@FindBy(xpath = "//input[@id='startdate']")
	private WebElement campoDataInicio;
	
	@FindBy(xpath = "//select[@id='insurancesum']")
	private WebElement seletorSomaDoSeguro;
	
	@FindBy(xpath = "//select[@id='damageinsurance']")
	private WebElement seletorSeguroDeDanos;
	
	@FindBy(xpath = "//input[@id='EuroProtection']")
	private WebElement ckbEuroProtection;
	
	@FindBy(xpath = "//input[@id='selectsilver']")
	private WebElement ckbSilver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement campoEmail;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement campoTelefone;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement campoUsuario;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//input[@id='confirmpassword']")
	private WebElement campoConfirmaSenha;
	
	@FindBy(xpath = "//textarea[@id='Comments']")
	private WebElement campoComentario;
	
	@FindBy(xpath = "//button[@id='sendemail']")
	private WebElement btnSend;
	
	@FindBy(xpath = "//*[contains(text(), 'success')]")
	private WebElement lblSucesso;
}
