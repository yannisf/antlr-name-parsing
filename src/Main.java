import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static final String TEST = "Dar'el Param the 2nd (born on 12 Jun 1995) (also known as the killer) and a remark";

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(TEST.getBytes("UTF-8"));
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(bais);
// create a lexer that feeds off of input CharStream
        CadfatdLexer lexer = new CadfatdLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        CadfatdParser parser = new CadfatdParser(tokens);
        ParseTree tree = parser.line(); // begin parsing at init rule
//        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        ProfileVisitor visitor = new ProfileVisitor();
        visitor.visit(tree);
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new CadfatdBaseListener(), tree);
        Profile profile = visitor.getProfile();
        System.out.println(profile);
    }

}
