public class Atendente {

    private PastelBuilder pastelBuilder;

    public void setPastelBuilder(PastelBuilder pastelBuilder) {
        this.pastelBuilder = pastelBuilder;
    }

    public Pastel getPastel() {

        return pastelBuilder.getPastel();
    }

    public void constructPastel() {
        pastelBuilder.novoPastel();
        pastelBuilder.buildMassa();
        pastelBuilder.buildRecheio();
    }
}
