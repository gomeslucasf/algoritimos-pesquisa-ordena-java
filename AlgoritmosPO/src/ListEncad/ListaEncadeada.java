package ListEncad;
/**
 *
 * @author Gomes
 */
public class ListaEncadeada {
    private NO cabeca; 
    private int TL;

    public ListaEncadeada() {
        this.cabeca = null;
        this.TL = 0;
    }

    public NO getCabeca() {
        return cabeca;
    }

    public void setCabeca(NO cabeca) {
        this.cabeca = cabeca;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }
    
    public void addNO(NO novo)
    {
        novo.setProximo(new NO(cabeca.getInfo(), cabeca.getProximo()));
        cabeca = novo;
        this.TL ++;
    }
    
    public void removeNO(int info)
    {
        NO aux= this.getCabeca();
        NO ant = aux;
        while(aux!=null && aux.getInfo() != info)
        {
            
            ant = aux;
            aux = aux.getProximo();
        }
        
        if(aux != null)
            ant.setProximo(aux.getProximo());
        
        this.TL--;
    }
    
}
