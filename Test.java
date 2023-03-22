import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;


public class Test {
    public static void main(String[] args) throws IOException {
        String inputFile = "Test.txt";
        FileInputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        IfLexer lexer = new IfLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IfParser parser = new IfParser(tokens);
        ParseTree tree = parser.prog();
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker= new ParseTreeWalker();
        walker.walk(new TestIf(rewriter), tree);
        //TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        //walker.walk(new listner1(rewriter), tree);
        File output = new File("output.txt");
        output.createNewFile();
        FileWriter w = new FileWriter("output.txt");
        w.write(rewriter.getText());
        w.close();
        //System.out.println();

        //mc.visit(tree);
    }
}