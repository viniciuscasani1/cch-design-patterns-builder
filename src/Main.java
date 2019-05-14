public class Main {

    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        PastelBuilder pastelCarneBuilder = new PastelCarneBuilder();

        atendente.setPastelBuilder(pastelCarneBuilder);
        atendente.constructPastel();

        Pastel pastel = atendente.getPastel();

        System.out.println(pastel);
    }
}
