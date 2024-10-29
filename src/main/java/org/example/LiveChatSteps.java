//package org.example;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class LiveChatSteps {
//
//    WebDriver drive = new ChromeDriver();
//    Actions action = new Actions(drive);
//
////    Scenario: Acessar a página Live Chat
//    @When("clicar no item LIVE CHAT")
//    public void clicar_livechat(){
//
//        drive.findElement(By.xpath("//strong[text()='HEAD OFFICE']")).getText());
//    }
//
//    @Then("o títlo da página deve ser Chat now")
//    public void captar_titulo_livechat(){
//        Assertions.assertEquals("Chat now", drive.getTitle());
//    }
//
//}
