package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemonstrationElements {
//    Contact US
    @FindBy (xpath = "//a[text() = 'Contact Us']")
    public WebElement contactUs;
    @FindBy (xpath = "//p[@class='mt0']")
    public WebElement subtituloContactUs;
    @FindBy (xpath = "//strong[text() = 'HEAD OFFICE']")
    public WebElement headOffice;
    @FindBy (xpath = "//p[@class='inter']")
    public WebElement descricaoHeadOffice;
    @FindBy (xpath = "//strong[text()='Email']")
    public  WebElement email;
    @FindBy (xpath = "//p[@class='mt-2']")
    public  WebElement descricaoEmail;
    @FindBy (xpath = "//strong[text()='Phone']")
    public  WebElement phone;
    @FindBy (xpath = "//p[text()='+447874472344']")
    public  WebElement descricaoPhone;

//    --- AFFILIATE ---
    @FindBy (xpath = "//a[text()='Affiliate']")
    public  WebElement botaoAffiliate;
    @FindBy (xpath = "//h1[text()='Become an Affiliate Partner']")
    public  WebElement tituloPagAffiliate;
    @FindBy (xpath = "//div[@class ='pb2']")
    public  WebElement subtituloPagAffiliate;
    @FindBy (xpath = "//a[@class ='btn btn-primary px-4 mt-3 waves-effect']")
    public  WebElement botaoJoinNow;
    @FindBy (xpath = "//input[@class ='whsOnd zHQkBf']")
    public  List<WebElement> camposFormularioAffiliate;
    @FindBy (xpath = "//label[@class ='docssharedWizToggleLabeledContainer Yri8Nb']")
    public  List<WebElement> checkBoxAffiliate;
    @FindBy (xpath = "//div[@class ='bzfPab wFGF8']")
    public  List<WebElement> inputRadioAffiliate;
    @FindBy (xpath = "//span[@class='NPEfkd RveJvd snByac' and text()='Limpar formulário']")
    public WebElement botaoLimparFormularioAffiliate;
    @FindBy (xpath = "//span[@class = 'NPEfkd RveJvd snByac']")
    public List<WebElement> botaoEnviarormularioAffiliate;
    @FindBy (xpath = "//div[@class='vHW8K']")
    public WebElement textoFormularioEnviadoSucesso;

    //    --- LOGIN ---
    @FindBy (xpath = "//strong[text() = 'Login']")
    public WebElement botaoLogin;
    @FindBy (xpath = "//input[@id = 'email']")
    public WebElement inputEmailLogin;
    @FindBy (xpath = "//input[@id = 'password']")
    public WebElement inputSenhaLogin;
    @FindBy (xpath = "//button[@class = 'login_button btn btn-dark w-100 mt-3 d-flex gap-2 justify-content-center align-items-center']")
    public WebElement botaoEfetuarLogin;
    @FindBy (xpath = "//p[text() = 'Please check your emal and password']")
    public WebElement mensagemErroLogin;
    @FindBy (xpath = "//a[@class = 'small fw-500 text-decoration-none']")
    public WebElement botaoForgotPassword;
    @FindBy (xpath = "//a[@class = 'login_button mt-3 btn w-100 btn-lg rounded-3 d-flex align-items-center justify-content-center']")
    public WebElement botaoCreateAccount;

//    --- PRICING ---
    @FindBy (xpath = "//a[@class='lvl-0 link nav-link waves-effect' and contains(@href, 'pricing')]")
    public WebElement botaoPricing;
    @FindBy (xpath = "//h1[@class = 'mb-0']")
    public WebElement tituloPagPrincing;
    @FindBy (xpath = "//p[@class = 'mt0']")
    public WebElement subtituloPagPrincing;
    @FindBy (xpath = "//strong[text() = 'Startup']")
    public WebElement planoStartUp;
    @FindBy (xpath = "//strong[text() = 'Agency']")
    public WebElement planoAgency;
    @FindBy (xpath = "//strong[text() = 'Enterprise']")
    public WebElement planoEnterprise;
    @FindBy (xpath = "//strong[text() = '$499']")
    public WebElement valorStartUp;
    @FindBy (xpath = "//strong[text() = '$999']")
    public WebElement valorAgency;
    @FindBy (xpath = "//strong[text() = '$2499']")
    public WebElement valorEnterprise;
    @FindBy (xpath = "//a[@class = 'btn subscribe waves-effect']")
    public WebElement botaoGetStarted;
    @FindBy (xpath = "//a[@class='lvl-0 link nav-link waves-effect' and contains(@href, 'services')]")
    public WebElement botaoProductServices;

//    --- THE TEAM ---
    @FindBy (xpath = "//a[text() = 'The Team']")
    public WebElement botaoTheTeam;
    @FindBy (xpath = "//h1[@class = 'mb0']")
    public WebElement tituloPagTheTeam;
    @FindBy (xpath = "//p[@class = 'mt0']")
    public WebElement subtituloPagTheTeam;
    @FindBy (xpath = "//p[text() = 'Our business is a business built on knowledge and unique ideas and as you may assume our team is our primary and most valuable asset. When we choose our employees we never compromise with qualities such as professionalism, experience and reliability.']")
    public WebElement descricaoCoreTeam;
    @FindBy (xpath = "//div[@class = 'col-sm-4 mb1 pr2 pl2 mb-1']")
    public WebElement secaoCoreTeam;
    @FindBy (xpath = "//div[@class = 'col-sm-4 mb1 pr2 pl2 mb-1']")
    public List<WebElement> membrosCoreTeam;
    @FindBy (xpath = "//div[@class= 'tac mt3 mb2']")
    public WebElement romi;











}
