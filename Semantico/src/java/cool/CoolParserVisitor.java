package cool;

	import cool.AST;
	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface CoolParserVisitor<T> extends ParseTreeVisitor<T> {
	
	T visitProgram(CoolParser.ProgramContext ctx);
	
	T visitClass_list(CoolParser.Class_listContext ctx);

	T visitClass_(CoolParser.Class_Context ctx);

	T visitFeature_list(CoolParser.Feature_listContext ctx);

	T visitFeature(CoolParser.FeatureContext ctx);
	
	T visitFormal_list(CoolParser.Formal_listContext ctx);
	
	T visitFormal(CoolParser.FormalContext ctx);
	
	T visitExpression(CoolParser.ExpressionContext ctx);
	
	T visitExpression_list_actual(CoolParser.Expression_list_actualContext ctx);

	T visitExpression_list(CoolParser.Expression_listContext ctx);

	T visitCase_list(CoolParser.Case_listContext ctx);
	
	T visitCase_(CoolParser.Case_Context ctx);
	
	T visitLet_looper(CoolParser.Let_looperContext ctx);
	
	T visitStar_slash(CoolParser.Star_slashContext ctx);
	
	T visitPlus_minus(CoolParser.Plus_minusContext ctx);
	
	T visitLt_le_equals(CoolParser.Lt_le_equalsContext ctx);
}
