package nbbrd.sandbox;

public final class NoOpTextFormattingService implements TextFormattingService {

    @Override
    public String getId() {
        return "NO_OP";
    }

    @Override
    public String formatText(String text) {
        return text;
    }
}
