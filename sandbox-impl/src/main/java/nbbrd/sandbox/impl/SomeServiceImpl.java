package nbbrd.sandbox.impl;

import com.github.lalyos.jfiglet.FigletFont;
import nbbrd.sandbox.SomeService;

import java.io.IOException;
import java.io.UncheckedIOException;

public class SomeServiceImpl implements SomeService {

    @Override
    public String formatText(String text) {
        try {
            return FigletFont.convertOneLine(text);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
