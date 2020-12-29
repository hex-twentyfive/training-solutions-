package interfacedefaultmethods.print;

public class ColoredPage {

    private String page;

    private String color;

    public ColoredPage(String page, String color) {
        this.page = page;
        this.color = color;
    }

    public ColoredPage(String page) {        //ha nem kap külön színt, akkor default lesz.
        this.page = page;
        this.color = Printable.BLACK;
    }

    public String getPage() {
        return page;
    }

    public String getColor() {
        return color;
    }

}