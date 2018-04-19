package Impl;

public class Implementatie {

BrowserHelper driver = new BrowserHelper();

    public void gaNaarPHP() {
        //String testwebsite = "file://"+ BestandHelper.getRootPath() + File.separator + "src/main/cuke_workshop/leningaanvraag.html";
        driver.gaNaarUrl("https://www.phptravels.net/");
    }
    public void clickonbutton(String s) {
        driver.klikelement(s);
    }

    public void clickonbuttoncss(String s) {
        driver.klikelementcss(s);
    }

    public void checkiftrue(String s) {
        driver.assertion(s);
    }

    public void typetext(String s, String input) {
        driver.typetekst(s,input);
    }
    public void typetextcss(String s, String input) {
        driver.typetekstcss(s,input);
    }
    public void clickindropdown(String s){
        driver.klikindropdown(s);
    }
    public void clickindropdownxpath(String s) {
        driver.klikindropdownxpath(s);
    }

    public void selecteeroptie (String s, String input){
        driver.selecteeroptie(s, input);
    }

    public void afsluiten() {
        driver.afsluiten();
    }

}
