package Bürgeramt;

public class Bürger {

    private String name;
    private String anliegen;

    public Bürger(String name, String anliegen) {
        this.name = name;
        this.anliegen = anliegen;
    }

    public Bürger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnliegen() {
        return anliegen;
    }

    public void setAnliegen(String anliegen) {
        this.anliegen = anliegen;
    }
}
