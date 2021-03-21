package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://www.advantageonlineshopping.com/")
public class HomePage extends PageObject {

    public static final Target BOTON_USER = Target.the("BOTON_USER").located(By.xpath("//*[@id=\'menuUser\']"));

    public static final Target BOTON_NEWACC = Target.the("BOTON_NEWACC").located(By.xpath("//*[@class=\'create-new-account ng-scope\']"));
    public static final Target CAMPO_USERNAME = Target.the("CAMPO_USERNAME").located(By.xpath("//*[@name=\'usernameRegisterPage\']"));
    public static final Target CAMPO_CORREO = Target.the("CAMPO_CORREO").located(By.xpath("//*[@name=\'emailRegisterPage\']"));
    public static final Target CAMPO_PASS = Target.the("CAMPO_PASS").located(By.xpath("//*[@name=\'passwordRegisterPage\']"));
    public static final Target CAMPO_CPASS = Target.the("CAMPO_CPASS").located(By.xpath("//*[@name=\'confirm_passwordRegisterPage\']"));

    public static final Target BTN_REGISTER = Target.the("BTN_REGISTER").located(By.xpath("//*[@id=\'register_btnundefined\']"));
    public static final Target TERMINOS = Target.the("TERMINOS").located(By.xpath("//*[@class=\'checkboxText roboto-light animated\']"));
    public static final Target TEXTO_USUARIO = Target.the("TEXTO_USUARIO").located(By.xpath("//*[@class=\'hi-user containMiniTitle ng-binding\']"));
    public static final Target LOGIN_USER = Target.the("LOGIN_USER").located(By.xpath("//*[@name=\'username\']"));
    public static final Target LOGIN_PASS = Target.the("LOGIN_PASS").located(By.xpath("//*[@name=\'password\']"));
    public static final Target BTN_LOGIN = Target.the("BTN_REGISTER").located(By.xpath("//*[@id=\'sign_in_btnundefined\']"));
    public static final Target LISTA_ARTICULO = Target.the("LISTA_ARTICULO").located(By.xpath("//*[@name=\'categoryListboxContactUs\']"));
    public static final Target LISTA_MARCA = Target.the("LISTA_ARTICULO").located(By.xpath("//*[@name=\'productListboxContactUs\']"));
    public static final Target CAMPO_CORREOCN = Target.the("CAMPO_CORREOCN").located(By.xpath("//*[@name=\'emailContactUs\']"));
    public static final Target AREA_DESC = Target.the("AREA_DESC").located(By.xpath("//*[@name=\'subjectTextareaContactUs\']"));
    public static final Target BTN_SEND = Target.the("BTN_SEND").located(By.xpath("//*[@id=\'send_btnundefined\']"));
    public static final Target TEXTO_CONTACTO_ENVIADO = Target.the("TEXTO_CONTACTO_ENVIADO").located(By.xpath("//*[@class=\'roboto-regular successMessage ng-binding\']"));

    public static final Target SPEAKERS = Target.the("SPEAKERS").located(By.xpath("//*[@class=\'cell categoryRight\']"));

    public static final Target SELECCION_SPEAK = Target.the("SELECCION_SPEAK").located(By.xpath("//*[@class=\'shop_now_slider\']"));
    public static final Target BTN_ADD_CAR = Target.the("SPEAKERS").located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
    public static final Target BTN_CARRITO = Target.the("SPEAKERS").located(By.xpath("//*[@id=\'menuCart\']"));
    public static final Target TEXTO_CARRITO = Target.the("SPEAKERS").located(By.xpath("//*[@id=\'shoppingCart\']/table/tbody/tr/td[2]/label"));


}
