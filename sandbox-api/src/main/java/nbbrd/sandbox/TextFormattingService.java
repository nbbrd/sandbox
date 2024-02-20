package nbbrd.sandbox;

import nbbrd.service.Quantifier;
import nbbrd.service.ServiceDefinition;
import nbbrd.service.ServiceId;

@ServiceDefinition(quantifier = Quantifier.SINGLE, fallback = NoOpTextFormattingService.class)
public interface TextFormattingService {

    @ServiceId(pattern = ServiceId.SCREAMING_SNAKE_CASE)
    String getId();

    String formatText(String text);
}
