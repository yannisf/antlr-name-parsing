// Generated from Cadfatd.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CadfatdVisitor<T> extends ParseTreeVisitor<T> {
	T visitLine(CadfatdParser.LineContext ctx);

	T visitAka(CadfatdParser.AkaContext ctx);

	T visitBorn(CadfatdParser.BornContext ctx);

	T visitName(CadfatdParser.NameContext ctx);

	T visitRemark(CadfatdParser.RemarkContext ctx);

	T visitText(CadfatdParser.TextContext ctx);
}