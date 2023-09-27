public class Fila<T> {
    private No<T> refNoFila;

    public Fila() {
        this.refNoFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoFila);
        refNoFila = novoNo;
    }

    public T first(){
        if (!isEmpty()){
            No primeiroNo = refNoFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            No primeiroNo = refNoFila;
            No noAuxiliar = refNoFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoFila == null ? true : false;
    }

    @Override
    public String toString() {
       String stringRetorno = "";
       No noAuxiliar = refNoFila;

       if (refNoFila != null){
           while (true){
               stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]-->";
               if (noAuxiliar.getRefNo() != null){
                   noAuxiliar = noAuxiliar.getRefNo();
               } else{
                   stringRetorno += "null";
                   break;
               }
           }

       }else{
           stringRetorno = "null";
       }

       return stringRetorno;
    }
}
