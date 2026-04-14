public class VetorDinamico{
    
    Processo v[];
    int capacidade;
    int ocupacao = 0;

    public VetorDinamico(){
        capacidade = 4;
        v = new Processo[capacidade];
    }

    public boolean estaCheio(){
        if(capacidade == ocupacao-1) return true;
        else return false;
    }
    public boolean estaVazio(){
        if(ocupacao == 0) return true;
        else return false;
    }
    public void adiciona(Processo p){
        if(!estaCheio()) redimensiona(capacidade * 2);
        this.p[ocupacao++] = v; 
    }
    public void remove(){
        
    }
    private void redimensiona(int novaCapacidade){
        Processo[] temp = new Processo[novaCapacidade];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = v[i];
            v = temp;
            capacidade = novaCapacidade;
        }

    public String listar(){
        if(estaVazio()) return "O Vetor está vazio";
        String lista = "";
        for (int i = 0; i < ocupacao; i++) {
            lista += v[i];
        }
        return lista;
    }

    public int buscarPorProtocolo(int protocolo){
        for (int i=0; i<ocupacao; i++) {
            if (v[i] == x) {
                return true;
            }
    }

}