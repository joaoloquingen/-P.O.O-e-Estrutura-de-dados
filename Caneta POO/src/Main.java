public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.carga = 80;
        c1.destampar();
        //c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "vermelho";
        c2.ponta = 1.0f;
        c2.modelo = "bic2";
        c2.carga = 100;
        c2.tampar();
        //c2.status();
        c2.rabiscar();
    }
}