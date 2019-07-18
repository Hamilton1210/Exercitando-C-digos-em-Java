public class Prova {
    public int dificuldade;
    public int energiaNecessaria;
    public Atleta participante;

    public boolean podeRealizar(){
        if(participante.energia > energiaNecessaria && participante.nivel > dificuldade){
            System.out.println("Pode realizar a prova");
            return true;
        } else{
            System.out.println("Não pode realizar a prova");
            return false;
        }
    }
}
