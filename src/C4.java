class C4 extends C2 {
    private double taxa;

    public C4(String nome, int valor, double taxa) {
        super(nome, valor);
        this.taxa = taxa;
    }

    @Override
    public void apresentar() {
        System.out.println("C4: Nome: " + nome + ", Valor: " + valor + ", Taxa: " + taxa);
    }

    public void calcularTaxa() {
        System.out.println("C4: Cálculo da taxa: " + (valor * taxa));
    }
}