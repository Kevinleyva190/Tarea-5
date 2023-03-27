public class Main2 {
    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();

        while (maquina.hayRecursos()) {
            if (maquina.hacerAmericano()) {
                System.out.println("Se sirvió un americano.");
            } else if (maquina.hacerExpreso()) {
                System.out.println("Se sirvió un expreso.");
            } else if (maquina.hacerCapuchino()) {
                System.out.println("Se sirvió un capuchino.");
            } else {
                System.out.println("Ya no hay suficientes recursos para servir más café.");
                break;
            }
        }

        maquina.mostrarRecursos();
    }
}
