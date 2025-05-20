package guilherme.simuladorqueda;

public class SimuladorQueda {
    public static void main(String[] args){
        // Exibe o simulador gráfico e centraliza na tela
        java.awt.EventQueue.invokeLater(() -> {
            Impacto impacto = new Impacto(); // Cria uma nova instância da janela Impacto
            impacto.setVisible(true); // Torna a janela visivel para o usuario
            impacto.setLocationRelativeTo(null); // Centraliza a janela na tela
        });
    }
}