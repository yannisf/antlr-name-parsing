// Generated from Cadfatd.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CadfatdListener extends ParseTreeListener {
	void enterLine(CadfatdParser.LineContext ctx);
	void exitLine(CadfatdParser.LineContext ctx);

	void enterAka(CadfatdParser.AkaContext ctx);
	void exitAka(CadfatdParser.AkaContext ctx);

	void enterBorn(CadfatdParser.BornContext ctx);
	void exitBorn(CadfatdParser.BornContext ctx);

	void enterName(CadfatdParser.NameContext ctx);
	void exitName(CadfatdParser.NameContext ctx);

	void enterRemark(CadfatdParser.RemarkContext ctx);
	void exitRemark(CadfatdParser.RemarkContext ctx);

	void enterText(CadfatdParser.TextContext ctx);
	void exitText(CadfatdParser.TextContext ctx);
}