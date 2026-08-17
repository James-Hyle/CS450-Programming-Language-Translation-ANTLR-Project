// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ClassExamples/src/sjc/parser/StaticJavaV4.g4 by ANTLR 4.13.2
package sjc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StaticJavaV4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		WS=40, ERROR=41;
	public static final int
		RULE_compilationUnit = 0, RULE_classDefinition = 1, RULE_memberDeclaration = 2, 
		RULE_mainMethodDeclaration = 3, RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_type = 6, RULE_returnType = 7, RULE_params = 8, RULE_param = 9, RULE_methodBody = 10, 
		RULE_localDeclaration = 11, RULE_statement = 12, RULE_assignStatement = 13, 
		RULE_ifStatement = 14, RULE_whileStatement = 15, RULE_invokeExpStatement = 16, 
		RULE_returnStatement = 17, RULE_exp = 18, RULE_invoke = 19, RULE_args = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDefinition", "memberDeclaration", "mainMethodDeclaration", 
			"fieldDeclaration", "methodDeclaration", "type", "returnType", "params", 
			"param", "methodBody", "localDeclaration", "statement", "assignStatement", 
			"ifStatement", "whileStatement", "invokeExpStatement", "returnStatement", 
			"exp", "invoke", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'{'", "'}'", "'static'", "'void'", "'('", 
			"'['", "']'", "')'", "';'", "'boolean'", "'int'", "','", "'='", "'if'", 
			"'else'", "'while'", "'return'", "'true'", "'false'", "'null'", "'-'", 
			"'+'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "StaticJavaV4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StaticJavaV4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StaticJavaV4Parser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			classDefinition();
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(T__1);
			setState(47);
			match(ID);
			setState(48);
			match(T__2);
			setState(49);
			mainMethodDeclaration();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(50);
				memberDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memberDeclaration);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Token id3;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(StaticJavaV4Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StaticJavaV4Parser.ID, i);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitMainMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			match(T__4);
			setState(64);
			match(T__5);
			setState(65);
			((MainMethodDeclarationContext)_localctx).id1 = match(ID);
			setState(66);
			if (!( "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(67);
			match(T__6);
			setState(68);
			((MainMethodDeclarationContext)_localctx).id2 = match(ID);
			setState(69);
			if (!( "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(70);
			match(T__7);
			setState(71);
			match(T__8);
			setState(72);
			((MainMethodDeclarationContext)_localctx).id3 = match(ID);
			setState(73);
			match(T__9);
			setState(74);
			match(T__2);
			setState(75);
			methodBody();
			setState(76);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__4);
			setState(79);
			type();
			setState(80);
			match(ID);
			setState(81);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__4);
			setState(84);
			returnType();
			setState(85);
			match(ID);
			setState(86);
			match(T__6);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(87);
				params();
				}
			}

			setState(90);
			match(T__9);
			setState(91);
			match(T__2);
			setState(92);
			methodBody();
			setState(93);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends TypeContext {
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends ReturnTypeContext {
		public VoidTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidReturnTypeContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterNonVoidReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitNonVoidReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitNonVoidReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__5);
				}
				break;
			case T__11:
			case T__12:
				_localctx = new NonVoidReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			param();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(104);
				match(T__13);
				setState(105);
				param();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(114);
				localDeclaration();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274878758912L) != 0)) {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			match(ID);
			setState(128);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				assignStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				invokeExpStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(T__14);
			setState(139);
			exp(0);
			setState(140);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> ts = new ArrayList<StatementContext>();
		public List<StatementContext> fs = new ArrayList<StatementContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__15);
			setState(143);
			match(T__6);
			setState(144);
			exp(0);
			setState(145);
			match(T__9);
			setState(146);
			match(T__2);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274878758912L) != 0)) {
				{
				{
				setState(147);
				((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).ts.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(T__3);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(154);
				match(T__16);
				setState(155);
				match(T__2);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274878758912L) != 0)) {
					{
					{
					setState(156);
					((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).fs.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__17);
			setState(166);
			match(T__6);
			setState(167);
			exp(0);
			setState(168);
			match(T__9);
			setState(169);
			match(T__2);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274878758912L) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpStatementContext extends ParserRuleContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterInvokeExpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitInvokeExpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvokeExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invokeExpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			invoke();
			setState(179);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__18);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824699781248L) != 0)) {
				{
				setState(182);
				exp(0);
				}
			}

			setState(185);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public IdExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterIdExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitIdExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends ExpContext {
		public TrueLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpContext extends ExpContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterInvokeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitInvokeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpContext {
		public Token INT;
		public TerminalNode INT() { return getToken(StaticJavaV4Parser.INT, 0); }
		public IntLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ExpContext {
		public NullLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends ExpContext {
		public FalseLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				((IntLiteralContext)_localctx).INT = match(INT);
				setState(189);
				if (!( new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($INT.text).bitLength() < 32 ");
				}
				break;
			case 2:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__19);
				}
				break;
			case 3:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__20);
				}
				break;
			case 4:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__21);
				}
				break;
			case 5:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__6);
				setState(194);
				exp(0);
				setState(195);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				invoke();
				}
				break;
			case 7:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				exp(8);
				}
				break;
			case 9:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				((UnaryExpContext)_localctx).op = match(T__24);
				setState(202);
				exp(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((BinaryExpContext)_localctx).e2 = exp(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						((BinaryExpContext)_localctx).e2 = exp(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						((BinaryExpContext)_localctx).e2 = exp(5);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						((BinaryExpContext)_localctx).e2 = exp(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						((BinaryExpContext)_localctx).op = match(T__34);
						setState(219);
						((BinaryExpContext)_localctx).e2 = exp(3);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						((BinaryExpContext)_localctx).op = match(T__35);
						setState(222);
						((BinaryExpContext)_localctx).e2 = exp(2);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(StaticJavaV4Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StaticJavaV4Parser.ID, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(228);
				((InvokeContext)_localctx).id1 = match(ID);
				setState(229);
				match(T__36);
				}
				break;
			}
			setState(232);
			((InvokeContext)_localctx).id2 = match(ID);
			setState(233);
			match(T__6);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824699781248L) != 0)) {
				{
				setState(234);
				args();
				}
			}

			setState(237);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticJavaV4Listener ) ((StaticJavaV4Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			exp(0);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(240);
				match(T__13);
				setState(241);
				exp(0);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mainMethodDeclaration_sempred(MainMethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) ;
		case 1:
			return  "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) ;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 ;
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0005\bk\b\b\n\b\f\bn\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0005\nt\b"+
		"\n\n\n\f\nw\t\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0088\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0095"+
		"\b\u000e\n\u000e\f\u000e\u0098\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u009e\b\u000e\n\u000e\f\u000e\u00a1\t\u000e\u0001"+
		"\u000e\u0003\u000e\u00a4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ac\b\u000f\n\u000f\f\u000f"+
		"\u00af\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00b8\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00cc\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00e0\b\u0012\n\u0012\f\u0012\u00e3\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00ec\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00f3\b\u0014\n\u0014\f\u0014\u00f6\t\u0014\u0001\u0014"+
		"\u0000\u0001$\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0004\u0001\u0000\u0017\u0018"+
		"\u0001\u0000\u001a\u001c\u0001\u0000\u001d \u0001\u0000!\"\u0104\u0000"+
		"*\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004<\u0001"+
		"\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000"+
		"\u0000\nS\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000\u000ee\u0001"+
		"\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012o\u0001\u0000\u0000"+
		"\u0000\u0014u\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018"+
		"\u0087\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c"+
		"\u008e\u0001\u0000\u0000\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00b2"+
		"\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000$\u00cb\u0001"+
		"\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000(\u00ef\u0001\u0000\u0000"+
		"\u0000*+\u0003\u0002\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005\u0002\u0000\u0000"+
		"/0\u0005&\u0000\u000001\u0005\u0003\u0000\u000015\u0003\u0006\u0003\u0000"+
		"24\u0003\u0004\u0002\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0004\u0000\u00009\u0003"+
		"\u0001\u0000\u0000\u0000:=\u0003\b\u0004\u0000;=\u0003\n\u0005\u0000<"+
		":\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0001\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0005"+
		"\u0006\u0000\u0000AB\u0005&\u0000\u0000BC\u0004\u0003\u0000\u0001CD\u0005"+
		"\u0007\u0000\u0000DE\u0005&\u0000\u0000EF\u0004\u0003\u0001\u0001FG\u0005"+
		"\b\u0000\u0000GH\u0005\t\u0000\u0000HI\u0005&\u0000\u0000IJ\u0005\n\u0000"+
		"\u0000JK\u0005\u0003\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\u0004\u0000"+
		"\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0005\u0000\u0000OP\u0003"+
		"\f\u0006\u0000PQ\u0005&\u0000\u0000QR\u0005\u000b\u0000\u0000R\t\u0001"+
		"\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000TU\u0003\u000e\u0007\u0000"+
		"UV\u0005&\u0000\u0000VX\u0005\u0007\u0000\u0000WY\u0003\u0010\b\u0000"+
		"XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u0003\u0014"+
		"\n\u0000]^\u0005\u0004\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_b\u0005"+
		"\f\u0000\u0000`b\u0005\r\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000b\r\u0001\u0000\u0000\u0000cf\u0005\u0006\u0000\u0000"+
		"df\u0003\f\u0006\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"f\u000f\u0001\u0000\u0000\u0000gl\u0003\u0012\t\u0000hi\u0005\u000e\u0000"+
		"\u0000ik\u0003\u0012\t\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0011\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003\f\u0006\u0000pq\u0005"+
		"&\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rt\u0003\u0016\u000b\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v{\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xz\u0003\u0018\f\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0015"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0003\f\u0006"+
		"\u0000\u007f\u0080\u0005&\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000"+
		"\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0088\u0003\u001a\r\u0000\u0083"+
		"\u0088\u0003\u001c\u000e\u0000\u0084\u0088\u0003\u001e\u000f\u0000\u0085"+
		"\u0088\u0003 \u0010\u0000\u0086\u0088\u0003\"\u0011\u0000\u0087\u0082"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005&\u0000\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u008c\u0003"+
		"$\u0012\u0000\u008c\u008d\u0005\u000b\u0000\u0000\u008d\u001b\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0090\u0005\u0007"+
		"\u0000\u0000\u0090\u0091\u0003$\u0012\u0000\u0091\u0092\u0005\n\u0000"+
		"\u0000\u0092\u0096\u0005\u0003\u0000\u0000\u0093\u0095\u0003\u0018\f\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u00a3\u0005\u0004\u0000\u0000\u009a\u009b\u0005\u0011\u0000\u0000"+
		"\u009b\u009f\u0005\u0003\u0000\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0005\u0004\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0012\u0000\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7"+
		"\u00a8\u0003$\u0012\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00ad"+
		"\u0005\u0003\u0000\u0000\u00aa\u00ac\u0003\u0018\f\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0004\u0000\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"&\u0013\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4!\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0005\u0013\u0000\u0000\u00b6\u00b8\u0003$\u0012\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000"+
		"\u00ba#\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\u0012\uffff\uffff\u0000"+
		"\u00bc\u00bd\u0005\'\u0000\u0000\u00bd\u00cc\u0004\u0012\u0002\u0001\u00be"+
		"\u00cc\u0005\u0014\u0000\u0000\u00bf\u00cc\u0005\u0015\u0000\u0000\u00c0"+
		"\u00cc\u0005\u0016\u0000\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2"+
		"\u00c3\u0003$\u0012\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c5\u00cc\u0003&\u0013\u0000\u00c6\u00cc\u0005"+
		"&\u0000\u0000\u00c7\u00c8\u0007\u0000\u0000\u0000\u00c8\u00cc\u0003$\u0012"+
		"\b\u00c9\u00ca\u0005\u0019\u0000\u0000\u00ca\u00cc\u0003$\u0012\u0007"+
		"\u00cb\u00bb\u0001\u0000\u0000\u0000\u00cb\u00be\u0001\u0000\u0000\u0000"+
		"\u00cb\u00bf\u0001\u0000\u0000\u0000\u00cb\u00c0\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c1\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00e1\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\n\u0006\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf"+
		"\u00e0\u0003$\u0012\u0007\u00d0\u00d1\n\u0005\u0000\u0000\u00d1\u00d2"+
		"\u0007\u0000\u0000\u0000\u00d2\u00e0\u0003$\u0012\u0006\u00d3\u00d4\n"+
		"\u0004\u0000\u0000\u00d4\u00d5\u0007\u0002\u0000\u0000\u00d5\u00e0\u0003"+
		"$\u0012\u0005\u00d6\u00d7\n\u0003\u0000\u0000\u00d7\u00d8\u0007\u0003"+
		"\u0000\u0000\u00d8\u00e0\u0003$\u0012\u0004\u00d9\u00da\n\u0002\u0000"+
		"\u0000\u00da\u00db\u0005#\u0000\u0000\u00db\u00e0\u0003$\u0012\u0003\u00dc"+
		"\u00dd\n\u0001\u0000\u0000\u00dd\u00de\u0005$\u0000\u0000\u00de\u00e0"+
		"\u0003$\u0012\u0002\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00d0\u0001"+
		"\u0000\u0000\u0000\u00df\u00d3\u0001\u0000\u0000\u0000\u00df\u00d6\u0001"+
		"\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2%\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005&\u0000"+
		"\u0000\u00e5\u00e7\u0005%\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005&\u0000\u0000\u00e9\u00eb\u0005\u0007\u0000\u0000\u00ea"+
		"\u00ec\u0003(\u0014\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\n\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000\u00ef\u00f4\u0003"+
		"$\u0012\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000\u00f1\u00f3\u0003$\u0012"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5)\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00145<Xaelu{\u0087\u0096\u009f\u00a3\u00ad\u00b7\u00cb\u00df\u00e1\u00e6"+
		"\u00eb\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}