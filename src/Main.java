import generated.WHILELexer;
import generated.WHILEParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream codeCharStream = CharStreams.fromFileName("test.wh");
        WHILELexer lexer = new WHILELexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WHILEParser parser = new WHILEParser(tokens);
        ParseTree tree = parser.program();
    }
}
