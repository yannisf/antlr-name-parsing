import org.antlr.v4.runtime.tree.ParseTree;

import java.util.stream.Collectors;

public class ProfileVisitor extends CadfatdBaseVisitor {

    private Profile profile = new Profile();

    @Override
    public Object visitAka(CadfatdParser.AkaContext ctx) {
        String aka = ctx.text().children.stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining(" "));
        profile.setAka(aka);
        return super.visitAka(ctx);
    }

    @Override
    public Object visitBorn(CadfatdParser.BornContext ctx) {
        String dob = ctx.text().children.stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining(" "));
        profile.setDob(dob);
        return super.visitBorn(ctx);
    }

    @Override
    public Object visitName(CadfatdParser.NameContext ctx) {
        String name = ctx.text().children.stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining(" "));
        profile.setName(name);

        return super.visitName(ctx);
    }

    @Override
    public Object visitRemark(CadfatdParser.RemarkContext ctx) {
        String remark = ctx.text().children.stream()
                .map(ParseTree::getText)
                .collect(Collectors.joining(" "));
        profile.setRemark(remark);

        return super.visitRemark(ctx);
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
