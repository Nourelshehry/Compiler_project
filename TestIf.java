import org.antlr.v4.runtime.TokenStreamRewriter;

public class TestIf extends IfBaseListener{

    int count;
    TokenStreamRewriter rewriter;

    public TestIf(TokenStreamRewriter rewriter) {
        this.rewriter = rewriter;
        this.count=0;
    }

    @Override
    public void exitOpen(IfParser.OpenContext ctx) {
        count++;
        rewriter.insertAfter(ctx.getStart(), "//block number " + count + "\n");
    }


}
