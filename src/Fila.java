public class Fila {
    private static Fila filaInstancia;
    private String comentario;

    private Fila() {
    }

    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static Fila getInstance(){
        if(filaInstancia == null){
            filaInstancia = new Fila();
        }

        return filaInstancia;
    }

}
