package nbbrd.sandbox.gui;

import ec.util.various.swing.BasicSwingLauncher;
import ec.util.various.swing.TextPrompt;
import nbbrd.sandbox.SomeService;
import nbbrd.sandbox.impl.SomeServiceImpl;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public final class MainWindow {

    public static void main(String[] args) {
        new BasicSwingLauncher()
                .content(MainWindow::create)
                .icons("/nbbrd/sandbox/gui/nbb.png")
                .title("Hello NBBRD")
                .launch();
    }

    private static Component create() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        JPanel result = new JPanel(new BorderLayout());

        JTextField input = new JTextField();
        result.add(input, BorderLayout.NORTH);

        JTextArea output = new JTextArea();
        output.setEditable(false);
        result.add(new JScrollPane(output), BorderLayout.CENTER);

        new TextPrompt("Type your name here", input).setForeground(output.getDisabledTextColor());
        input.getDocument().addDocumentListener(new DocumentListener() {

            final SomeService service = new SomeServiceImpl();

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOutput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOutput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateOutput();
            }

            private void updateOutput() {
                String text = input.getText();
                output.setText(text.isEmpty() ? "" : service.formatText("Hello " + text));
            }
        });

        return result;
    }
}
