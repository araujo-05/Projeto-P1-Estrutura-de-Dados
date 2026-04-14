public class Processo {
    private int protocolo;
    private String solicitante;
    private String tipoServico;
    private int prioridade;
    private String dataHora;
    private static int contadorProcolo = 1;

    public Processo(){

    }

    public Processo(String solicitante, String tipoServico, int prioridade, String dataHora){
        this.protocolo = contadorProcolo;
        contadorProcolo++;
        this.solicitante = solicitante;
        this.tipoServico = tipoServico;
        this.prioridade = prioridade;
        this.dataHora = dataHora;
        
    }

    public int getProtocolo(){
        return protocolo;
    }

    public String getSolicitante(){
        return solicitante;
    }

    public void setSolicitante(String solicitante){
        this.solicitante = solicitante;
    }

    public String getTipoServico(){
        return tipoServico;
    }

    public void setTipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }

    public int getPrioridade(){
        return prioridade;
    }

    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }

    public String dataHora(){
        return dataHora;
    }
    public void setDataHora(String dataHora){
        this.dataHora = dataHora;
    }

    @Override
    public String toString(){
        String prioridade  = "";
        switch(this.prioridade){
            case 1:
                prioridade = "Baixa";
                break;
            case 2:
                prioridade = "Normal";
                break;
            case 3:
                prioridade = "Urgente";
                break;
        }
        String s = "[#"+this.protocolo+"] "+this.solicitante+" | "+this.tipoServico+" | "+prioridade+" | "+this.dataHora+"\n";
        return s;
    }
}
