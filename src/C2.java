class C2 extends C1 {
    protected int valor;

    public C2(String nome, int valor) {
        super(nome);
        this.valor = valor;
    }

    @Override
    public void apresentar() {
        System.out.println("C2: Nome: " + nome + ", Valor: " + valor);
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes de C2: Nome: " + nome + ", Valor: " + valor);
    }

    public void mostrarDetalhes(int multiplicador) {
        System.out.println("Detalhes de C2 com multiplicador: " + (valor * multiplicador));
    }
}