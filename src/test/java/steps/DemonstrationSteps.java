package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPage;


    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.addArguments("--headless");
        driver = new ChromeDriver(chromeOpts);
        demonstrationPage = new DemonstrationPage(driver);
//        driver.manage().window().maximize();
    }

//    PHP TRAVELS DEMO
    @Given("que o usuário esteja na página Demo")
    public void queOUsuarioEstejaNaPaginaDemo() {
        demonstrationPage.acessarSite();
    }

//    Scenario: Acessar a página Contact Us
    @When("clicar no item CONTACT US")
    public void clicarNoItemCONTACTUS() {
        demonstrationPage.clicarContactUs();
    }

    @Then("o título da página deve ser Contact Us")
    public void oTituloDaPaginaDeveSerContactUs() {
        demonstrationPage.captarTituloAbaContactUs();
    }

//    Scenario: Visualizar o subtítulo da página Contact Us
    @Given("que o usuário esteja na página Contact Us")
    public void queOUsuarioEstejaNaPaginaContactUs() {
        demonstrationPage.acessarContactUs();
    }

    @When("localizar o título da página")
    public void localizarOTituloDaPagina() {
        demonstrationPage.captarTituloAbaContactUs();
    }

    @Then("seu subtítulo deve ser Contact us anytime and we will be happy to assist you")
    public void seuSubtituloDeveSerContactUsAnytimeAndWeWillBeHappyToAssistYou() {
        demonstrationPage.captarSubtituloContactUs();
    }

//    Scenario: Visualizar o endereço do Head Office
    @When("localizar o item HEAD OFFICE")
    public void localizarOItemHEADOFFICE() {
        demonstrationPage.captarHeadOffice();
    }

    @Then("sua descrição deve ser 71-75 Shelton Street, Covent Garden London, United Kingdom, WC2H 9JQ")
    public void suaDescricaoDeveSerSheltonStreetCoventGardenLondonUnitedKingdomWCHJQ() {
        demonstrationPage.captarDescricaoHeadOffice();
    }

//    Scenario: Visualizar o endereço de Email
    @When("localizar o item EMAIL")
    public void localizarOItemEMAIL() {
        demonstrationPage.captarEmail();
    }

    @Then("sua descrição deve ser info@phptravels.com")
    public void suaDescricaoDeveSerInfoPhptravelsCom() {
        demonstrationPage.captarDescricaoEmail();
    }

//    Scenario: Visualizar o telefone para contato
    @When("localizar o item PHONE")
    public void localizarOItemPHONE() {
        demonstrationPage.captarPhone();
    }

    @Then("sua descrição deve ser +447874472344")
    public void suaDescricaoDeveSer() {
        demonstrationPage.captarDescricaoPhone();
    }

//    --- AFFILIATE ---
//    Scenario: Acessar a página Affiliate
    @When("clicar no item AFFILIATE")
    public void clicarNoItemAFFILIATE() {
        demonstrationPage.clicarBotaoAffiliate();
    }
    @Then("o título da página deve ser Become an Affiliate Partner")
    public void oTituloDaPaginaDeveSerBecomeAnAffiliatePartner() {
    }

//    Scenario: Capturar título e subtítulo presentes na página Affiliate
    @Given("que o usuário esteja na página Affiliate")
    public void queOUsuarioEstejaNaPaginaAffiliate() {
        demonstrationPage.acessarAffiliate();
    }
    @When("localizar o título da página Affiliate")
    public void localizarOTituloDaPaginaAffiliate() {
        demonstrationPage.captarTituloPagAffiliate();
    }
    @Then("seu subtítulo deve ser Join the PHPTRAVELS Affiliate Program and earn High Commissions for every sale you make.")
    public void seuSubtituloDeveSerJoinThePHPTRAVELSAffiliateProgramAndEarnHighCommissionsForEverySaleYouMake() {
        demonstrationPage.captarSubtituloAffiliate();
    }

//    Scenario: Clicar no botão JOIN NOW
    @When("clicar no botão JOIN NOW")
    public void clicarNoBotaoJOINNOW() {
        demonstrationPage.clicarBotaoJoinNow();
    }
    @Then("a página de formulário para Affiliate Registration é exibida")
    public void aPaginaDeFormularioParaAffiliateRegistrationEExibida() {
        demonstrationPage.captarTituloAbaAffiliateRegistration();
    }

//    Scenario: Preencher e limpar dados do formulário
    @Given("que o usuário esteja no formulário Affiliate Registration")
    public void queOUsuarioEstejaNoFormularioAffiliateRegistration() {
        demonstrationPage.acessarFormularioAffiliate();
    }
    @When("preencher os campos NAME, EMAIL e PHONE")
    public void preencherOCampoNAME() {
        demonstrationPage.preencherCampoNameAffiliate("Giovanna","giovanna@gmail.com", "11999999999");
    }
    @And("clicar no checkbox 5000 - 10000")
    public void clicarNoCheckbox() {
        demonstrationPage.clicarCheckboxAffiliate();
    }
    @And("clicar no input 50+")
    public void clicarNoInputRadio() {
        demonstrationPage.clicarInputRadioAffiliate();
    }
    @And("clicar em LIMPAR FORMULÁRIO")
    public void clicarEmLIMPARFORMULARIO() {
        demonstrationPage.limparFormularioAffiliate();
    }
    @Then("os campos NAME, EMAIL e PHONE devem estar vazios")
    public void osCamposDevemEstarVazios() {
        demonstrationPage.verificarCamposFormularioAffiliate();
    }

//    Scenario: Preencher e enviar formulário
    @And("clicar no botão para enviar o formulário")
    public void clicarNoBotaoParaEnviarOFormulario() {
        demonstrationPage.botaoEnviarormularioAffiliate();
    }
    @Then("a mensagem Thank you for registration we will contact you back soon to setup your account. deve ser exibida")
    public void aMensagemThankYouForRegistrationWeWillContactYouBackSoonToSetupYourAccountDeveSerExibida() {
        demonstrationPage.captarMensagemSucessoFormulario();
    }

//    --- LOGIN ---
//    Scenario: Acessar a página de Login
    @When("clicar no item LOGIN")
    public void clicarNoItemLOGIN() {
        demonstrationPage.clicarBotaoLogin();
    }
    @Then("o usuário é direcionado para a página de Login")
    public void oUsuarioEDirecionadoParaAPaginaDeLogin() {
        demonstrationPage.captarTituloAbaLogin();
    }

//    Scenario: Login inválido
    @Given("que o usuário esteja na página de Login")
    public void queOUsuarioEstejaNaPaginaDeLogin() {
        demonstrationPage.acessarLogin();
    }
    @When("preencher os campos email e nome incorretamente")
    public void preencherOsCamposEmailENomeIncorretamente() {
        demonstrationPage.enviarDadosLogin("giovanna@teste.com", "senhaErrada");
    }
    @And("clicar no botão LOGIN")
    public void clicarNoBotaoLOGIN() {
        demonstrationPage.clicarBotaoEfetuarLogin();
    }
    @Then("a mensagem Please check your emal and password é exibida")
    public void aMensagemPleaseCheckYourEmalAndPasswordEExibida() {
        demonstrationPage.captarMensagemErroLogin();
    }
    @And("o login não é efetuado")
    public void oLoginNaoEEfetuado() {
        demonstrationPage.captarTituloAbaLoginInvalido();
    }

//    Scenario: Efetuar login
    @When("preencher os campos corretamente")
    public void preencherOsCamposCorretamente() {
        demonstrationPage.enviarDadosLogin("giovanna.liem@mjv.com.br","senha123");
    }
    @Then("o usuário é direcionado para a página Dashboard")
    public void oUsuarioEDirecionadoParaAPaginaDashboard() {
        demonstrationPage.captarTituloAbaDashboard();
    }

//    Scenario: Acessar a página de Forget Password
    @When("clicar no botão FORGOT PASSWORD")
    public void clicarNoBotaoFORGOTPASSWORD() {
        demonstrationPage.clicarBotaoForgotPassword();
    }
    @Then("o usuário é direcionado para a página Forget Password")
    public void oUsuarioEDirecionadoParaAPaginaForgetPassword() {
        demonstrationPage.captarTituloAbaForgetPassword();
    }
    @When("clicar no botão CREATE ACCOUNT")
    public void clicarNoBotaoCREATEACCOUNT() {
        demonstrationPage.clicarBotaoCreateAccount();
    }

//    Scenario: Acessar a página de Sign Up
    @Then("o usuário é direcionado para a página de Sign Up")
    public void oUsuarioEDirecionadoParaAPaginaDeSignUp() {
        demonstrationPage.clicarBotaoSignUp();
    }

//    --- PRICING ---
//    Scenario: Acessar a página de Pricing
    @When("clicar no item PRICING")
    public void clicarNoItemPRICING() {
        demonstrationPage.clicarPricing();
    }
    @Then("verificar o título da página Pricing")
    public void verificarOTituloDaPaginaPricing() {
        demonstrationPage.captarTituloAbaPricing();
    }

//    Scenario: Capturar o Título e Subtítulo da página Pricing
    @Given("que o usuário esteja na página de Pricing")
    public void queOUsuarioEstejaNaPaginaDePricing() {
        demonstrationPage.acessarPricing();
    }
    @When("localizar o título Plans and Prices")
    public void localizarOTituloPlansAndPrices() {
        demonstrationPage.captarTituloPagPricing();
    }
    @Then("ele deve conter o subtítulo Flexible plans suitable for the one man show to entreprise and corporates.")
    public void eleDeveConterOSubtituloFlexiblePlansSuitableForTheOneManShowToEntrepriseAndCorporates() {
        demonstrationPage.captarSubtituloPricing();
    }

//    Scenario: Conferir os planos oferecidos
    @Then("localizar os planos Startup, Agency, Enterprise")
    public void localizarOsPlanosStartupAgencyEnterprise() {
        demonstrationPage.conferirPlanosOferecidos();
    }

//    Scenario: Conferir os valores dos planos oferecidos
    @Then("o valor do plano Startup deve ser 499")
    public void oValorDoPlanoStartupDeveSer499() {
        demonstrationPage.captarValorPlanoStartUp();
    }
    @And("o valor do plano Agency deve ser 999")
    public void oValorDoPlanoAgencyDeveSer999() {
        demonstrationPage.captarValorPlanoAgency();
    }
    @And("o valor do plano Enterprise deve ser 2499")
    public void oValorDoPlanoEnterpriseDeveSer2499() {
        demonstrationPage.captarValorPlanoEnterprise();
    }

//    Scenario: Acessar a página de assinatura de plano
    @When("clicar no botao Get Started")
    public void clicarNoBotaoGetStarted() {
        demonstrationPage.clicarBotaoGetStarted();
    }
    @Then("o usuário é direcionado para a página de de Get Started")
    public void oUsuarioEDirecionadoParaAPaginaDeDeGetStarted() {
        demonstrationPage.captarTituloAbaGetStarted();
    }

//    Scenario: Acessar a página de Product Services

    @When("clicar no botão PRODUCT SERVICES")
    public void clicarNoBotaoPRODUCTSERVICES() {
        demonstrationPage.clicarBotaoTalkToSales();
    }
    @Then("o usuário é direcionado para a página de Product Services")
    public void oUsuarioEDirecionadoParaAPaginaDeProductServices() {
        demonstrationPage.captarTituloAbaTalkToSales();
    }


//    --- THE TEAM ---
//    Scenario: Acessar a página The Team
    @When("clicar no item THE TEAM")
    public void clicarNoItemTHETEAM() {
        demonstrationPage.clicarTheTeam();
    }
    @Then("o usuário é direcionado para a página The Team")
    public void oUsuarioEDirecionadoParaAPaginaTheTeam() {
        demonstrationPage.captarTituloAbaTheTeam();
    }

//    Scenario: Capturar o título da página
    @Given("que o usuário esteja na página The Team")
    public void queOUsuarioEstejaNaPaginaTheTeam() {
        demonstrationPage.acessarTheTeam();
    }
    @When("localizar o título The Core Team")
    public void localizarOTituloTheTeam() {
        demonstrationPage.captarTituloNaPagTheTeam();
    }
    @Then("ele deve conter o subtítulo Meet the great minds behind this amazing application!")
    public void eleDeveConterOSubtítuloMeetTheGreatMindsBehindThisAmazingApplication() {
        demonstrationPage.captarSubtituloNaPagTheTeam();
    }

//    Scenario: Capturar a descrição do Time
    @Then("ela deve conter o texto Our business is a business built on knowledge and unique ideas and as you may assume our team is our primary and most valuable asset. When we choose our employees we never compromise with qualities such as professionalism, experience and reliability.")
    public void elaDeveConterOTextoOurBusinessIsABusinessBuiltOnKnowledgeAndUniqueIdeasAndAsYouMayAssumeOurTeamIsOurPrimaryAndMostValuableAssetWhenWeChooseOurEmployeesWeNeverCompromiseWithQualitiesSuchAsProfessionalismExperienceAndReliability() {
        demonstrationPage.captarDescricaoCoreTeam();
    }

//    Scenario: Contar o número de pessoas no time principal
    @When("localizar o Core Team")
    public void localizarOCoreTeam() {
        demonstrationPage.encontrarCoreTeam();
    }
    @Then("ele deve conter 8 pessoas no Core Team!")
    public void eleDeveConter8PessoasNoCoreTeam() {
        demonstrationPage.contarMembrosCoreTeam();
    }

//    Scenario: Achar o Romi
    @When("localizar o Romi")
    public void localizarORomi() {
        demonstrationPage.acharORomi();
    }
    @Then("ele deve conter o máximo de fofura possível")
    public void eleDeveConterOMaximoDeFofuraPossivel() {
        demonstrationPage.darZoomNoRomi();
    }


    @After
    public void fecharDriver(){
        driver.quit();
    }
}