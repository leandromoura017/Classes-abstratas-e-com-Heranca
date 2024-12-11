public class Principal {
    public static void main(String[] args) {
        C2 objetoC2 = new C2("Objeto C2", 54);
        C3 objetoC3 = new C3("Objeto C3", "Descrição do C3");
        C4 objetoC4 = new C4("Objeto C4", 457, 0.66);
        C5 objetoC5 = new C5("Objeto C5", 533, "Categoria A");

        objetoC2.apresentar();
        objetoC2.mostrarDetalhes();
        objetoC2.mostrarDetalhes(2); // Sobrecarga com multiplicador

        objetoC3.apresentar();
        objetoC3.metodoInterface();
        objetoC3.metodo1();
        objetoC3.metodo2();

        objetoC4.apresentar();
        objetoC4.calcularTaxa();

        objetoC5.apresentar();
        objetoC5.metodoInterface();
        objetoC5.mostrarDetalhes(); // Sobrescrita do método
    }
}
