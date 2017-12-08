package cool;

	import cool.AST;
	import java.util.List;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CoolParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CoolParserVisitor<T> {
	
	@Override public T visitProgram(CoolParser.ProgramContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitClass_list(CoolParser.Class_listContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitClass_(CoolParser.Class_Context ctx) { return visitChildren(ctx); }
	
	@Override public T visitFeature_list(CoolParser.Feature_listContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitFeature(CoolParser.FeatureContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitFormal_list(CoolParser.Formal_listContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitFormal(CoolParser.FormalContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitExpression(CoolParser.ExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitExpression_list_actual(CoolParser.Expression_list_actualContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitExpression_list(CoolParser.Expression_listContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitCase_list(CoolParser.Case_listContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitCase_(CoolParser.Case_Context ctx) { return visitChildren(ctx); }
	
	@Override public T visitLet_looper(CoolParser.Let_looperContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitStar_slash(CoolParser.Star_slashContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitPlus_minus(CoolParser.Plus_minusContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitLt_le_equals(CoolParser.Lt_le_equalsContext ctx) { return visitChildren(ctx); }
}
