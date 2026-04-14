public class VetorDinamico{
    
    Processo v[];
    private int capacidade;
    private int ocupacao = 0;

    public VetorDinamico(){
        capacidade = 4;
        v = new Processo[capacidade];
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public int getOcupacao(){
        return this.ocupacao;
    }

    public boolean estaCheio(){
       return capacidade == ocupacao;
    }

    public boolean estaVazio(){
        if(ocupacao == 0) return true;
        else return false;
    }
    public void adiciona(Processo p){
        if(estaCheio()){
            redimensiona(capacidade * 2);
        } 
        this.v[ocupacao++] = p; 
        
        
    }
    public String remove(){
        if (estaVazio()) return "\n0 Processos\n";
        // ocupacao--;
        String aux = "\nProcesso: "+v[--ocupacao].toString()+" removido";
        if (capacidade >= 4 && ocupacao <= capacidade / 4) 
            redimensiona(capacidade / 2);
        return aux;
    }
    private void redimensiona(int novaCapacidade){
        Processo[] temp = new Processo[novaCapacidade];
        for (int i = 0; i < this.ocupacao; i++){
            temp[i] = v[i];
        }
		this.v = temp;
        this.capacidade = novaCapacidade;

    }
        

    public String listar(){
        if(estaVazio()) return "\n0 Processos\n";
        String lista = "\nCapacidade do Array: " +this.capacidade+"\nOcupação: "+this.ocupacao+"\n";
        for (int i = 0; i < this.ocupacao; i++) {
            lista += v[i];
        }
        
        return lista;
    }

    public int buscarPorProtocolo(int protocolo){
        for (int i=0; i<ocupacao; i++) {
            if (v[i].getProtocolo() == protocolo) {
                return i;
            } 
        }
        return -1;
    }
}
