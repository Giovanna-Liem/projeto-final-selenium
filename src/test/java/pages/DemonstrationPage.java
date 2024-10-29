package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;


    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }

//    --- CONTACT US ---
//    Scenario: Acessar a página Contact Us
    public void clicarContactUs(){
        action.moveToElement(contactUs).click().perform();
    }
    public void acessarContactUs(){
        driver.get("https://phptravels.com/contact-us/");
    }
    public void captarTituloAbaContactUs(){
        Assertions.assertEquals("Contact Us", driver.getTitle());
    }

//    Scenario: Visualizar o subtítulo da página Contact Us
    public void captarSubtituloContactUs(){
        Assertions.assertEquals("Contact us anytime and we will be happy to assist you.", subtituloContactUs.getText());
    }

//    Scenario: Visualizar o endereço do Head Office
    public void captarHeadOffice(){
        Assertions.assertEquals("HEAD OFFICE", headOffice.getText());
    }
    public void captarDescricaoHeadOffice(){
        Assertions.assertEquals("71-75 Shelton Street, Covent Garden\n" +
                "London, United Kingdom, WC2H 9JQ", descricaoHeadOffice.getText());
    }

//    Scenario: Visualizar o endereço de Email
    public void captarEmail(){
        Assertions.assertEquals("Email", email.getText());
    }
    public void captarDescricaoEmail(){
        Assertions.assertEquals("info@phptravels.com", descricaoEmail.getText());
    }

//    Scenario: Visualizar o telefone para contato
    public void captarPhone(){
        Assertions.assertEquals("Phone", phone.getText());
    }
    public void captarDescricaoPhone(){
        Assertions.assertEquals("+447874472344", descricaoPhone.getText());
    }

//    --- AFFILIATE ---
//    Scenario: Acessar a página Affiliate
    public void clicarBotaoAffiliate(){
        action.moveToElement(botaoAffiliate).click().perform();
    }
    public void captarTituloAbaAffiliate(){
        Assertions.assertEquals("Become an Affiliate Partner", descricaoPhone.getText());
    }

//    Scenario: Capturar título e subtítulo presentes na página Affiliate
    public void acessarAffiliate(){
        driver.get("https://phptravels.com/affiliate/");
    }
    public void captarTituloPagAffiliate(){
        Assertions.assertEquals("Become an Affiliate Partner", tituloPagAffiliate.getText());
    }
    public void captarSubtituloAffiliate(){
        Assertions.assertEquals("Join the PHPTRAVELS Affiliate Program and earn High Commissions for every sale you make.", subtituloPagAffiliate.getText());
    }

//    Scenario: Clicar no botão JOIN NOW
    public void clicarBotaoJoinNow(){
        action.moveToElement(botaoJoinNow).click().perform();;
    }
    public void captarTituloAbaAffiliateRegistration(){
        Assertions.assertEquals("Affiliate Registration", driver.getTitle());
    }

//    Scenario: Preencher e limpar dados do formulário
    public void acessarFormularioAffiliate(){
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLScdAk_I2rzbGJCZkc_pLp1LjJrt60Ok10RtpClf0HLqNpNWgw/viewform");
    }
    public void preencherCampoNameAffiliate(String nome, String email, String phone){
        action.moveToElement(camposFormularioAffiliate.get(0)).click().perform();
        action.moveToElement(camposFormularioAffiliate.get(1)).click().perform();
        action.moveToElement(camposFormularioAffiliate.get(2)).click().perform();
    }
    public void clicarCheckboxAffiliate(){
        action.moveToElement(checkBoxAffiliate.get(1)).click().perform();
    }
    public void clicarInputRadioAffiliate(){
        action.moveToElement(inputRadioAffiliate.get(4)).click().perform();
    }
    public void limparFormularioAffiliate(){
        action.moveToElement(botaoLimparFormularioAffiliate).click().perform();
    }
    public void verificarCamposFormularioAffiliate(){
        Assertions.assertEquals("", camposFormularioAffiliate.get(0).getText());
        Assertions.assertEquals("", camposFormularioAffiliate.get(1).getText());
        Assertions.assertEquals("", camposFormularioAffiliate.get(2).getText());
    }
    public void botaoEnviarormularioAffiliate(){
        action.moveToElement(botaoEnviarormularioAffiliate.get(1)).click().perform();
    }
    public void captarMensagemSucessoFormulario(){
        Assertions.assertEquals("Thank you for registration we will contact you back soon to setup your account. ", textoFormularioEnviadoSucesso.getText());
    }

//    --- LOGIN ---
//    Scenario: Acessar a página de Login
    public void clicarBotaoLogin(){
        botaoLogin.click();
    }
    public void captarTituloAbaLogin(){
        Set<String> aba = driver.getWindowHandles();
        List <String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("Login", driver.getTitle());
    }

//    Scenario: Login inválido
    public void acessarLogin(){
        driver.get("https://app.phptravels.com/login");
    }
    public void enviarDadosLogin(String email, String senha){
        inputEmailLogin.sendKeys(email);
        inputSenhaLogin.sendKeys(senha);
    }
    public void clicarBotaoEfetuarLogin(){
        botaoEfetuarLogin.click();
    }
    public void captarMensagemErroLogin(){
        wait.until(ExpectedConditions.visibilityOf((mensagemErroLogin)));
        mensagemErroLogin.click();
    }
    public void captarTituloAbaLoginInvalido(){
        Assertions.assertEquals("Login", driver.getTitle());
    }

//    Scenario: Efetuar login
    public void captarTituloAbaDashboard(){
        Assertions.assertEquals("Dashboard", driver.getTitle());
    }

//    Scenario: Acessar a página de Forget Password
    public void clicarBotaoForgotPassword(){
        botaoForgotPassword.click();
    }
    public void captarTituloAbaForgetPassword(){
        Assertions.assertEquals("Forget Password", driver.getTitle());
    }

//    Scenario: Acessar a página de Sign Up
    public void clicarBotaoCreateAccount(){
        botaoCreateAccount.click();
    }
    public void clicarBotaoSignUp(){
        Assertions.assertEquals("Signup", driver.getTitle());
    }

//    --- PRICING ---
//    Scenario: Acessar a página de Pricing
    public void clicarPricing(){
        action.moveToElement(botaoPricing).click().perform();
    }
    public void captarTituloAbaPricing(){
        Assertions.assertEquals("Phptravels Plans & Pricing | One Time Payment", driver.getTitle());
    }

//    Scenario: Capturar o Título e Subtítulo da página Pricing
    public void acessarPricing(){
        driver.get("https://phptravels.com/pricing/");
    }
    public void captarTituloPagPricing(){
        Assertions.assertEquals("Plans and Prices", tituloPagPrincing.getText());
    }
    public void captarSubtituloPricing(){
        Assertions.assertEquals("Flexible plans suitable for the one man show to entreprise and corporates.", subtituloPagPrincing.getText());
    }

//    Scenario: Conferir os planos oferecidos
    public void conferirPlanosOferecidos(){
        Assertions.assertEquals("Startup", planoStartUp.getText());
        Assertions.assertEquals("Agency", planoAgency.getText());
        Assertions.assertEquals("Enterprise", planoEnterprise.getText());
    }

//    Scenario: Conferir os valores dos planos oferecidos
    public void captarValorPlanoStartUp(){
        Assertions.assertEquals("$499", valorStartUp.getText());
    }
    public void captarValorPlanoAgency(){
        Assertions.assertEquals("$999", valorAgency.getText());
    }
    public void captarValorPlanoEnterprise(){
        Assertions.assertEquals("$2499", valorEnterprise.getText());
    }

//    Scenario: Acessar a página de assinatura de plano
    public void clicarBotaoGetStarted(){
        botaoGetStarted.click();
    }
    public void captarTituloAbaGetStarted(){
        Set<String> aba = driver.getWindowHandles();
        List <String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("Checkout", driver.getTitle());
    }

//    Scenario: Acessar a página de Talk to Sales
    public void clicarBotaoTalkToSales(){
        action.moveToElement(botaoProductServices).click().perform();
    }
    public void captarTituloAbaTalkToSales(){
        Assertions.assertEquals("Our Product Services - Phptravels", driver.getTitle());
    }

//    --- THE TEAM ---
//    Scenario: Acessar a página The Team
    public void clicarTheTeam(){
        action.moveToElement(botaoTheTeam).click().perform();
    }
    public void captarTituloAbaTheTeam(){
        Assertions.assertEquals("The Core Team - PHPTravels", driver.getTitle());
    }

//    Scenario: Capturar o título da página
    public void acessarTheTeam(){
        driver.get("https://phptravels.com/the-team/");
    }
    public void captarTituloNaPagTheTeam(){
        Assertions.assertEquals("The Core Team", tituloPagTheTeam.getText());
    }
    public void captarSubtituloNaPagTheTeam(){
        Assertions.assertEquals("Meet the great minds behind this amazing application!", subtituloPagTheTeam.getText());
    }

//    Scenario: Capturar a descrição do Time
    public void captarDescricaoCoreTeam(){
        Assertions.assertEquals("Our business is a business built on knowledge and unique ideas and as you may assume our team is our primary and most valuable asset. When we choose our employees we never compromise with qualities such as professionalism, experience and reliability.", descricaoCoreTeam.getText());
    }

//    Scenario: Contar o número de pessoas no time principal
    public void encontrarCoreTeam(){
        Assertions.assertTrue(secaoCoreTeam.isDisplayed());
    }
    public void contarMembrosCoreTeam(){
    int quantidadeDeCards = membrosCoreTeam.size();
        Assertions.assertEquals(8, quantidadeDeCards);
    }

//    Scenario: Achar o Romi
    public void acharORomi(){
        Assertions.assertTrue(romi.isDisplayed());
    }
    public void darZoomNoRomi(){
        driver.get("https://phptravels.com/assets/img/company/team/romi.jpg");
    }

}