import java.time.LocalDate;

class Jogador {

    public Jogador(int id, boolean pernaBoa, String posicao, String nome, float altura, float peso, LocalDate contrato,
            String nacionalidade, LocalDate dataNascimento) {
        this.id = id;
        this.pernaBoa = pernaBoa;
        this.posicao = posicao;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.contrato = contrato;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    private int id;
    private boolean pernaBoa;
    private String posicao;
    private String nome;
    private float altura;
    private float peso;
    private LocalDate contrato;
    private String nacionalidade;
    private LocalDate dataNascimento;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isPernaBoa() {
        return pernaBoa;
    }
    public void setPernaBoa(boolean pernaBoa) {
        this.pernaBoa = pernaBoa;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public LocalDate getContrato() {
        return contrato;
    }
    public void setContrato(LocalDate contrato) {
        this.contrato = contrato;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}