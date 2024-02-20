import nbbrd.sandbox.TextFormattingService;
import nbbrd.sandbox.figlet.FigletTextFormattingService;

module nbbrd.sandbox.figlet {

    requires static lombok;
    requires static nbbrd.service;

    requires nbbrd.sandbox;
    requires jfiglet;

    provides TextFormattingService with FigletTextFormattingService;
}
