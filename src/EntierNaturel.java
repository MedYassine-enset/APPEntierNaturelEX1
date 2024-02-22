public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("La valeur Saise est Néqtive");
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("La valeur Saise est Négative");
        this.val = val;
    }
    public void decrementer(){
        if(val<0);
        this.val = val - 1;
    }
}
