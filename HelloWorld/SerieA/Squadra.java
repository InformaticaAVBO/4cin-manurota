package SerieA;

public class Squadra {
    
    private String nome; 
    private int pv, ppa, ppe, ptot;

    public Squadra(){
    }

    public String getNome() {
        return nome;
    }

    public int getPv() {
        return pv;
    }

    public int getPpa() {
        return ppa;
    }

    public int getPpe() {
        return ppe;
    }

    public int getPtot() {
        return ptot;
    }
    
    public void setPtot(int ptot) {
        this.ptot = ptot;
    }

    public Squadra(String nome, int pv, int ppa, int ppe, int ptot) {
        this.nome = nome;
        this.pv = pv;
        this.ppe = ppe;
        this.ppa = ppa;
        this.ptot = ptot;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", pv=" + pv + ", ppa=" + ppa + ", ppe=" + ppe + ", ptot=" + ptot + ".";
    }

    

    
    
    




}
