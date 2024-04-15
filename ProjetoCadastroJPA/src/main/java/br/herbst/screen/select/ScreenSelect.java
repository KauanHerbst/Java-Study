package br.herbst.screen.select;

import br.herbst.screen.clientes.ScreenClientes;
import br.herbst.screen.produtos.ScreenProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenSelect extends JFrame {
    private JButton btnClientes;
    private JPanel PainelMain;
    private JButton btnProdutos;


    public ScreenSelect() {
        setTitle("Cadastro Clientes e Produtos");
        setContentPane(PainelMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ScreenClientes screenClientes = new ScreenClientes();
            }
        });
        btnProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ScreenProdutos screenProdutos = new ScreenProdutos();
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        PainelMain = new JPanel();
        PainelMain.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(20, 20, 20, 20), -1, -1));
        PainelMain.setBackground(new Color(-14079703));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-1));
        label1.setText("Selecione uma Área");
        PainelMain.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnClientes = new JButton();
        btnClientes.setBackground(new Color(-11579569));
        btnClientes.setForeground(new Color(-1));
        btnClientes.setText("Clientes");
        PainelMain.add(btnClientes, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnProdutos = new JButton();
        btnProdutos.setBackground(new Color(-11579569));
        btnProdutos.setForeground(new Color(-1));
        btnProdutos.setText("Produtos");
        PainelMain.add(btnProdutos, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return PainelMain;
    }
}