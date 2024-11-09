package Enums;

public class BreadType {
    private String white;
    private String wheat;
    private String rye;
    private String wrap;

    public BreadType(String white, String wheat, String rye, String wrap) {
        this.white = white;
        this.wheat = wheat;
        this.rye = rye;
        this.wrap = wrap;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getWheat() {
        return wheat;
    }

    public void setWheat(String wheat) {
        this.wheat = wheat;
    }

    public String getRye() {
        return rye;
    }

    public void setRye(String rye) {
        this.rye = rye;
    }

    public String getWrap() {
        return wrap;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    @Override
    public String toString() {
        return "BreadType{" +
                "white='" + white + '\'' +
                ", wheat='" + wheat + '\'' +
                ", rye='" + rye + '\'' +
                ", wrap='" + wrap + '\'' +
                '}';
    }
}
