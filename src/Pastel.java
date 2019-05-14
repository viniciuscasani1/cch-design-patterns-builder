public class Pastel {

    private String massa;

    private String recheio;

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "massa='" + massa + '\'' +
                ", recheio='" + recheio + '\'' +
                '}';
    }
}
