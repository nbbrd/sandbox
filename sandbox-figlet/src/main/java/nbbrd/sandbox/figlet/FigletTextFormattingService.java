package nbbrd.sandbox.figlet;

import com.github.lalyos.jfiglet.FigletFont;
import nbbrd.sandbox.TextFormattingService;
import nbbrd.service.ServiceProvider;

import java.io.IOException;
import java.io.UncheckedIOException;

@ServiceProvider
public final class FigletTextFormattingService implements TextFormattingService {

    @Override
    public String getId() {
        return "FIGLET";
    }

    @Override
    public String formatText(String text) {
        try {
            return FigletFont.convertOneLine(text);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
