package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyCoucairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),Login.inThePage(academyCoucairData.get(0).getStrUser(),academyCoucairData.get(0).getStrPassword()));
    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyCoucairData) throws Exception  {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyCoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResources(List<AcademyChoucairData> academyCoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyCoucairData.get(0).getStrWord())));

    }



}
