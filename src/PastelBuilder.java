public abstract class PastelBuilder {

    public Pastel pastel;

    public Pastel getPastel() {
        return this.pastel;
    }

    public void novoPastel() {

        pastel = new Pastel();
    }

    public abstract void buildMassa();

    public abstract void buildRecheio();
}
