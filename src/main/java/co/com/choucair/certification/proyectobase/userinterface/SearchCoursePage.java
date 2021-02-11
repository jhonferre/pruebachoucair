package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));//*
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click en el curso")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[1]/div/div/a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
//*[@id="yui_3_17_2_1_1613074827513_28"]/div/div[1]/h4/a

//*[@id="region-main"]/div/div[1]/div/div[1]/h3/a
//*[@id="yui_3_17_2_1_1613075845658_296"]
//*[@id="yui_3_17_2_1_1613075845658_299"]/div[2]/h4/a
//*[@id="yui_3_17_2_1_1613075672450_28"]/div/div[1]/h4/a
//*[@id="yui_3_17_2_1_1613076016842_28"]/div/div[1]/h4/a
//*[@id="yui_3_17_2_1_1613076016842_28"]/div/div[2]/h4/a

//*[@id="category-course-list"]/div/div[2]/div/div[1]/div/div/a/div[1]/div[1]