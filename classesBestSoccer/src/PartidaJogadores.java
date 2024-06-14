class PartidasJogadores {
    
    public PartidasJogadores(Partida partida, Jogador jogador, int golJogador) {
        this.partida = partida;
        this.jogador = jogador;
        this.golJogador = golJogador;
    }
    
    private Partida partida;
    private Jogador jogador;
    private int golJogador;
    
    public Partida getPartida() {
        return partida;
    }
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public int getGolJogador() {
        return golJogador;
    }
    public void setGolJogador(int golJogador) {
        this.golJogador = golJogador;
    }

} 