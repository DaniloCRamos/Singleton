public class Fila {
    private static Fila filaInstancia;

    private Fila() {
    }

    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }



    public static Fila getInstance(){
        if(filaInstancia == null){
            filaInstancia = new Fila();
        }

        return filaInstancia;
    }

}
