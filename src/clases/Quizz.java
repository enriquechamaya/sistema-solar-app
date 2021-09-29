package clases;

/**
 * @author echamaya
 */
public class Quizz {
    
    private String pregunta;
    private String respuesta;
    private String alternativas[] = new String[3];
    private int puntaje;

    public Quizz(String pregunta, String respuesta, String[] alternativas, int puntaje) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.alternativas = alternativas;
        this.puntaje = puntaje;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }
    
}