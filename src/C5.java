class C5 extends C2 implements I1 {
    private String categoria;

    public C5(String nome, int valor, String categoria) {
        super(nome, valor);
        this.categoria = categoria;
    }

    @Override
    public void apresentar() {
        System.out.println("C5: Nome: " + nome + ", Valor: " + valor + ", Categoria: " + categoria);
    }

    @Override
    public void metodoInterface() {
        System.out.println("Método da interface I1 implementado na C5.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes de C5: Nome: " + nome + ", Valor: " + valor + ", Categoria: " + categoria);
    }
}