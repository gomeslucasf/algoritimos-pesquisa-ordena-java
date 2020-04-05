package ListEncad;

/**
 *
 * @author Gomes
 */
public class NO {
    private NO proximo;
    private int info;

    public NO(int info, NO proximo) {
        this.proximo = proximo;
        this.info = info;
    }

    public NO getProximo() {
        return proximo;
    }

    public int getInfo() {
        return info;
    }

    public void setProximo(NO proximo) {
        this.proximo = proximo;
    }

    public void setInfo(int info) {
        this.info = info;
    }
    
    
}
