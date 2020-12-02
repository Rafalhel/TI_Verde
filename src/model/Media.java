package model;
import static View.Comp2.mediaa;
import static View.Comp3.mediaaa;
import static View.Comp4.mediaaaa;
import static View.Comp5.mediaaaaa;
import View.Completa;
import static View.Completa.media;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class Media{
    private int nome;
    
    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int recebe(){

        return media+mediaa+mediaaa+mediaaaa+mediaaaaa;
        
    }
    public void InserirIcone(JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/icone.png"));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
