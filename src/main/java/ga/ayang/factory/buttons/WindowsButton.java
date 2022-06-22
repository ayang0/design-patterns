package ga.ayang.factory.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Swing实现一个windows基本的客户端
 */
public class WindowsButton implements Button{
    // 面板
    JPanel panel = new JPanel();
    // 框
    JFrame frame = new JFrame();
    // 按钮
    JButton button = new JButton();

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
