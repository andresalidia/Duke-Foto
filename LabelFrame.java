import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; //interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens
/**
 * swing
 */
public class LabelFrame extends JFrame {
    private JLabel label1; // JLabel apenas com texto
    private JLabel label2; //JLabel construído com texto e ícone
    private JLabel label3; //JLabel com texto e ícone adicionados

    // construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame(){
        // construindo a janela
        super("Teating JLabel");
        setLayout(new FlowLayout()); // configura o layout de frame
        // Construtor JLabel com um argumento de string
        label1 = new JLabel("Label with text");// texto que vai aparecer
        label1.setToolTipText("This is label1"); // descrição do que faz
        add(label1); // adiciona o label1 ao JFrame

        //construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("duke.png"));// carregando imagem
        label2 = new JLabel("Label with text and icon",bug,SwingConstants.LEFT);
        label2.setToolTipText("this is label2");
        add(label2); // adiciona label2 ao JFrame

        label3 = new JLabel(); // Construtor JLabel sem argumentos
        label3.setText("Label with incon and text at botton");
        label3.setIcon(bug); // adiciona icone ao JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label");
        add(label3); // adiciona label3 ao JFrame
    } // fim do construtor LabelFrame
} // fim da classe LabelFrame
