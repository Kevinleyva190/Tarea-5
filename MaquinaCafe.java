public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;


    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }


    public boolean hacerAmericano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            return true;
        }
            return false;

    }

    public boolean hacerExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            return true;
        } else {
            return false;
        }
    }

    public boolean hacerCapuchino() {
        if (this.agua >= 100 && this.crema >= 70 && this.cafe >= 14 && this.vasos > 0) {
            this.agua -= 100;
            this.crema -= 70;
            this.cafe -= 14;
            this.vasos--;
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar los recursos disponibles
    public void mostrarRecursos() {
        System.out.println("Agua: " + this.agua + " ml");
        System.out.println("Café: " + this.cafe + " g");
        System.out.println("Crema: " + this.crema + " ml");
        System.out.println("Vasos: " + this.vasos);
    }

    // Método para verificar si se pueden seguir sirviendo cafés
    public boolean hayRecursos() {
        return this.agua >= 180 && this.cafe >= 15 && this.vasos > 0 ||
                this.agua >= 120 && this.cafe >= 20 && this.vasos > 0 ||
                this.agua >= 100 && this.crema >= 70 && this.cafe >= 14 && this.vasos > 0;
    }
}

