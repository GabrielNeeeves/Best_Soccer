import java.time.LocalDate;
import java.time.LocalTime;

class Partida {

    public Partida(int id, LocalDate data, LocalTime hora, String timeAdiversario, String local) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.timeAdiversario = timeAdiversario;
        this.local = local;
    }

    private int id;
    private LocalDate data;
    private LocalTime hora;
    private String timeAdiversario;
    private String local;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public String getTimeAdiversario() {
        return timeAdiversario;
    }
    public void setTimeAdiversario(String timeAdiversario) {
        this.timeAdiversario = timeAdiversario;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
}
