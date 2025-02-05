//Classe Media
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import javax.swing.JOptionPane; //Importando a classe do JOptionPane

public class Media {//Declaração da Classe Media
    public static void main(String[] args) { //Declaração do metódo main.

        //Declaração do tipo de dado String para mostrar a mensagem de input
        String input1,input2;

        //Declaração das variavéis que vão receber as notas da provas
        float prova1,prova2;

        //Inicialiaza a variável input1 com a caixa de input do JoptionPane
        input1 = JOptionPane.showInputDialog("Insira a nota da primeira prova: ");
        //Inicializa variavel que recebe o dado da prova1 e transforma para Float
        prova1 = Float.parseFloat(input1);

        //Inicialiaza a variável input2 com a caixa de input do JoptionPane
        input2 = JOptionPane.showInputDialog("Insira a nota da segunda prova: ");
        //Inicializa variavel que recebe o dado da prova1 e transforma para Float
        prova2 = Float.parseFloat(input2);

        //Mensagem para mostrar o resultado da média, com o cálculo principal.
        JOptionPane.showMessageDialog(null,"A média das duas provas foi "+((prova1+prova2)/2));
    }//Fim do metódo main
}//Fim da classe Media
