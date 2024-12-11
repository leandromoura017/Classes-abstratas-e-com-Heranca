interface I1 {
    void metodoInterface();
}

interface I2 {
    void metodo1();
    void metodo2();
}

class C3 extends C1 implements I1, I2 {
    private String descricao;

    public C3(String nome, String descricao) {
        super(nome);
        this.descricao = descricao;
    }

    @Override
    public void apresentar() {
        System.out.println("C3: Nome: " + nome + ", Descrição: " + descricao);
    }

    @Override
    public void metodoInterface() {
        System.out.println("Método da interface I1 implementado na C3.");
    }

    @Override
    public void metodo1() {
        System.out.println("Método 1 da interface I2 implementado na C3.");
    }

    @Override
    public void metodo2() {
        System.out.println("Método 2 da interface I2 implementado na C3.");
    }
}