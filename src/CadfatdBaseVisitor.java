// Generated from Cadfatd.g4 by ANTLR 4.0

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CadfatdBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CadfatdVisitor<T> {
    @Override
    public T visitLine(CadfatdParser.LineContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAka(CadfatdParser.AkaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBorn(CadfatdParser.BornContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitName(CadfatdParser.NameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRemark(CadfatdParser.RemarkContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitText(CadfatdParser.TextContext ctx) {
        return visitChildren(ctx);
    }
}