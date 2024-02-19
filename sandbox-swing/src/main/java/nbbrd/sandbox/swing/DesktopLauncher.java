package nbbrd.sandbox.swing;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import ec.util.various.swing.BasicSwingLauncher;
import ec.util.various.swing.TextPrompt;
import nbbrd.sandbox.TextFormattingService;
import nbbrd.sandbox.TextFormattingServiceLoader;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public final class DesktopLauncher {

    public static void main(String[] args) {
        FlatLightLaf.setup();

        new BasicSwingLauncher()
                .lookAndFeel(FlatLightLaf.class.getName())
                .content(DesktopLauncher::create)
                .icons("/nbbrd/sandbox/swing/nbb.png")
                .title("Hello NBBRD")
                .launch();
    }

    private static Component create() {
        sleepToShowSplashscreen();

        JTextField input = new JTextField();

        JTextArea output = new JTextArea();
        output.putClientProperty(FlatClientProperties.STYLE_CLASS, "monospaced");
        output.setEditable(false);

        new TextPrompt("Type your name here", input).setForeground(output.getDisabledTextColor());
        input.getDocument().addDocumentListener(new DocumentListener() {

            final TextFormattingService service = TextFormattingServiceLoader.load();

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

        JPanel result = new JPanel(new BorderLayout());
        result.add(input, BorderLayout.NORTH);
        result.add(new JScrollPane(output), BorderLayout.CENTER);
        return result;
    }

    private static void sleepToShowSplashscreen() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
