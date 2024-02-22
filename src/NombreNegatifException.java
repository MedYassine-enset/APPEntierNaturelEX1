public class NombreNegatifException extends Exception{
    private int valnegative;
    public NombreNegatifException(String message){
        super(message);
    }

    public NombreNegatifException() {

    }

    public int getValnegative() {
        return valnegative;
    }

    public void setValnegative(int valnegative) {
        this.valnegative = valnegative;
    }
}
