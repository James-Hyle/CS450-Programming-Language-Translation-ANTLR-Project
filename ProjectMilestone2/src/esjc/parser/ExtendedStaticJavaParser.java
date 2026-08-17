// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ProjectMilestone2/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.2
package esjc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExtendedStaticJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, ID=49, INT=50, WS=51, ERROR=52;
	public static final int
		RULE_compilationUnit = 0, RULE_classDefinition = 1, RULE_memberDeclaration = 2, 
		RULE_simpleClassDeclaration = 3, RULE_mainMethodDeclaration = 4, RULE_publicFieldDeclaration = 5, 
		RULE_fieldDeclaration = 6, RULE_methodDeclaration = 7, RULE_type = 8, 
		RULE_returnType = 9, RULE_basicType = 10, RULE_params = 11, RULE_param = 12, 
		RULE_methodBody = 13, RULE_localDeclaration = 14, RULE_statement = 15, 
		RULE_incDecStatement = 16, RULE_incDec = 17, RULE_assignStatement = 18, 
		RULE_lhs = 19, RULE_ifStatement = 20, RULE_forStatement = 21, RULE_forInits = 22, 
		RULE_forInit = 23, RULE_forUpdates = 24, RULE_whileStatement = 25, RULE_invokeExpStatement = 26, 
		RULE_doWhileStatement = 27, RULE_returnStatement = 28, RULE_exp = 29, 
		RULE_invoke = 30, RULE_arrayInit = 31, RULE_args = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDefinition", "memberDeclaration", "simpleClassDeclaration", 
			"mainMethodDeclaration", "publicFieldDeclaration", "fieldDeclaration", 
			"methodDeclaration", "type", "returnType", "basicType", "params", "param", 
			"methodBody", "localDeclaration", "statement", "incDecStatement", "incDec", 
			"assignStatement", "lhs", "ifStatement", "forStatement", "forInits", 
			"forInit", "forUpdates", "whileStatement", "invokeExpStatement", "doWhileStatement", 
			"returnStatement", "exp", "invoke", "arrayInit", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'{'", "'}'", "'static'", "'void'", "'('", 
			"'['", "']'", "')'", "';'", "'boolean'", "'int'", "','", "'++'", "'--'", 
			"'='", "'.'", "'if'", "'else'", "'for'", "'while'", "'do'", "'return'", 
			"'true'", "'false'", "'null'", "'-'", "'+'", "'!'", "'~'", "'*'", "'/'", 
			"'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'>>'", "'<<'", "'>>>'", "'new'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "INT", "WS", "ERROR"
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
	public String getGrammarFileName() { return "ExtendedStaticJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtendedStaticJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public SimpleClassDeclarationContext sc1;
		public ClassDefinitionContext cd;
		public SimpleClassDeclarationContext sc2;
		public TerminalNode EOF() { return getToken(ExtendedStaticJavaParser.EOF, 0); }
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public List<SimpleClassDeclarationContext> simpleClassDeclaration() {
			return getRuleContexts(SimpleClassDeclarationContext.class);
		}
		public SimpleClassDeclarationContext simpleClassDeclaration(int i) {
			return getRuleContext(SimpleClassDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(66);
				((CompilationUnitContext)_localctx).sc1 = simpleClassDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			((CompilationUnitContext)_localctx).cd = classDefinition();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(73);
				((CompilationUnitContext)_localctx).sc2 = simpleClassDeclaration();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitClassDefinition(this);
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
			setState(81);
			match(T__0);
			setState(82);
			match(T__1);
			setState(83);
			match(ID);
			setState(84);
			match(T__2);
			setState(85);
			mainMethodDeclaration();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(86);
				memberDeclaration();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memberDeclaration);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
	public static class SimpleClassDeclarationContext extends ParserRuleContext {
		public SimpleClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClassDeclaration; }
	 
		public SimpleClassDeclarationContext() { }
		public void copyFrom(SimpleClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CustomClassDeclarationContext extends SimpleClassDeclarationContext {
		public Token id;
		public PublicFieldDeclarationContext pfd;
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public List<PublicFieldDeclarationContext> publicFieldDeclaration() {
			return getRuleContexts(PublicFieldDeclarationContext.class);
		}
		public PublicFieldDeclarationContext publicFieldDeclaration(int i) {
			return getRuleContext(PublicFieldDeclarationContext.class,i);
		}
		public CustomClassDeclarationContext(SimpleClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterCustomClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitCustomClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCustomClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClassDeclarationContext simpleClassDeclaration() throws RecognitionException {
		SimpleClassDeclarationContext _localctx = new SimpleClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleClassDeclaration);
		int _la;
		try {
			_localctx = new CustomClassDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__1);
			setState(99);
			((CustomClassDeclarationContext)_localctx).id = match(ID);
			setState(100);
			match(T__2);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(101);
				((CustomClassDeclarationContext)_localctx).pfd = publicFieldDeclaration();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Token id3;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMainMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			match(T__4);
			setState(111);
			match(T__5);
			setState(112);
			((MainMethodDeclarationContext)_localctx).id1 = match(ID);
			setState(113);
			if (!( "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(114);
			match(T__6);
			setState(115);
			((MainMethodDeclarationContext)_localctx).id2 = match(ID);
			setState(116);
			if (!( "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(117);
			match(T__7);
			setState(118);
			match(T__8);
			setState(119);
			((MainMethodDeclarationContext)_localctx).id3 = match(ID);
			setState(120);
			match(T__9);
			setState(121);
			match(T__2);
			setState(122);
			methodBody();
			setState(123);
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
	public static class PublicFieldDeclarationContext extends ParserRuleContext {
		public PublicFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicFieldDeclaration; }
	 
		public PublicFieldDeclarationContext() { }
		public void copyFrom(PublicFieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PublicDecLarationContext extends PublicFieldDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public PublicDecLarationContext(PublicFieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterPublicDecLaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitPublicDecLaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitPublicDecLaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicFieldDeclarationContext publicFieldDeclaration() throws RecognitionException {
		PublicFieldDeclarationContext _localctx = new PublicFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_publicFieldDeclaration);
		try {
			_localctx = new PublicDecLarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__0);
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDecContext extends FieldDeclarationContext {
		public TypeContext t;
		public Token id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldDecContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFieldDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFieldDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			_localctx = new FieldDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__4);
			setState(131);
			((FieldDecContext)_localctx).t = type();
			setState(132);
			((FieldDecContext)_localctx).id = match(ID);
			setState(133);
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
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDecContext extends MethodDeclarationContext {
		public ReturnTypeContext ret;
		public Token id;
		public ParamsContext parameters;
		public MethodBodyContext methBody;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodDecContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMethodDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__4);
			setState(136);
			((MethodDecContext)_localctx).ret = returnType();
			setState(137);
			((MethodDecContext)_localctx).id = match(ID);
			setState(138);
			match(T__6);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953433600L) != 0)) {
				{
				setState(139);
				((MethodDecContext)_localctx).parameters = params();
				}
			}

			setState(142);
			match(T__9);
			setState(143);
			match(T__2);
			setState(144);
			((MethodDecContext)_localctx).methBody = methodBody();
			setState(145);
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
	public static class CustomTypeContext extends TypeContext {
		public BasicTypeContext bt;
		public Token id;
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public CustomTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			_localctx = new CustomTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				{
				setState(147);
				((CustomTypeContext)_localctx).bt = basicType();
				}
				break;
			case ID:
				{
				setState(148);
				((CustomTypeContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(151);
				match(T__7);
				setState(152);
				match(T__8);
				}
				break;
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
	public static class VoidReturnContext extends ReturnTypeContext {
		public VoidReturnContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterVoidReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitVoidReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitVoidReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeReturnContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeReturnContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterTypeReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitTypeReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitTypeReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new VoidReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__5);
				}
				break;
			case T__11:
			case T__12:
			case ID:
				_localctx = new TypeReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
	 
		public BasicTypeContext() { }
		public void copyFrom(BasicTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends BasicTypeContext {
		public BooleanTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends BasicTypeContext {
		public IntTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicType);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			param();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(164);
				match(T__13);
				setState(165);
				param();
				}
				}
				setState(170);
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
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					localDeclaration();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
				{
				{
				setState(180);
				statement();
				}
				}
				setState(185);
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
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			type();
			setState(187);
			match(ID);
			setState(188);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeStmtContext extends StatementContext {
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public InvokeStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvokeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvokeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStmtContext extends StatementContext {
		public IncDecStatementContext incDecStatement() {
			return getRuleContext(IncDecStatementContext.class,0);
		}
		public IncDecStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RetStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RetStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitRetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStmtContext extends StatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DoWhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				assignStatement();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				whileStatement();
				}
				break;
			case 4:
				_localctx = new InvokeStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				invokeExpStatement();
				}
				break;
			case 5:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				returnStatement();
				}
				break;
			case 6:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				forStatement();
				}
				break;
			case 7:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				doWhileStatement();
				}
				break;
			case 8:
				_localctx = new IncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				incDecStatement();
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
	public static class IncDecStatementContext extends ParserRuleContext {
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public IncDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIncDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIncDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStatementContext incDecStatement() throws RecognitionException {
		IncDecStatementContext _localctx = new IncDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_incDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			incDec();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(201);
				match(T__10);
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
	public static class IncDecContext extends ParserRuleContext {
		public ExpContext e;
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_incDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((IncDecContext)_localctx).e = exp(0);
			setState(205);
			((IncDecContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
				((IncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AssignStatementContext extends ParserRuleContext {
		public LhsContext lh;
		public ExpContext e;
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((AssignStatementContext)_localctx).lh = lhs();
			setState(208);
			match(T__16);
			setState(209);
			((AssignStatementContext)_localctx).e = exp(0);
			setState(210);
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
	public static class LhsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lhs);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				exp(0);
				setState(214);
				match(T__17);
				setState(215);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				exp(0);
				setState(218);
				match(T__7);
				setState(219);
				exp(0);
				setState(220);
				match(T__8);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__18);
			setState(225);
			match(T__6);
			setState(226);
			exp(0);
			setState(227);
			match(T__9);
			setState(228);
			match(T__2);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
				{
				{
				setState(229);
				((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).ts.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__3);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(236);
				match(T__19);
				setState(237);
				match(T__2);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
					{
					{
					setState(238);
					((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).fs.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ForStatementContext {
		public ForInitsContext fi;
		public ExpContext e;
		public ForUpdatesContext fu;
		public StatementContext s;
		public ForInitsContext forInits() {
			return getRuleContext(ForInitsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForUpdatesContext forUpdates() {
			return getRuleContext(ForUpdatesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForDeclarationContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__20);
			setState(248);
			match(T__6);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
				{
				setState(249);
				((ForDeclarationContext)_localctx).fi = forInits();
				}
			}

			setState(252);
			match(T__10);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
				{
				setState(253);
				((ForDeclarationContext)_localctx).e = exp(0);
				}
			}

			setState(256);
			match(T__10);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
				{
				setState(257);
				((ForDeclarationContext)_localctx).fu = forUpdates();
				}
			}

			setState(260);
			match(T__9);
			setState(261);
			match(T__2);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
				{
				{
				setState(262);
				((ForDeclarationContext)_localctx).s = statement();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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
	public static class ForInitsContext extends ParserRuleContext {
		public List<ForInitContext> forInit() {
			return getRuleContexts(ForInitContext.class);
		}
		public ForInitContext forInit(int i) {
			return getRuleContext(ForInitContext.class,i);
		}
		public ForInitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForInits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForInits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForInits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitsContext forInits() throws RecognitionException {
		ForInitsContext _localctx = new ForInitsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forInits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			forInit();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(271);
				match(T__13);
				setState(272);
				forInit();
				}
				}
				setState(277);
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
	public static class ForInitContext extends ParserRuleContext {
		public LhsContext lh;
		public ExpContext e;
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((ForInitContext)_localctx).lh = lhs();
			setState(279);
			match(T__16);
			setState(280);
			((ForInitContext)_localctx).e = exp(0);
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
	public static class ForUpdatesContext extends ParserRuleContext {
		public IncDecContext id;
		public IncDecContext ids;
		public List<IncDecContext> incDec() {
			return getRuleContexts(IncDecContext.class);
		}
		public IncDecContext incDec(int i) {
			return getRuleContext(IncDecContext.class,i);
		}
		public ForUpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdatesContext forUpdates() throws RecognitionException {
		ForUpdatesContext _localctx = new ForUpdatesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forUpdates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((ForUpdatesContext)_localctx).id = incDec();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(283);
				match(T__13);
				setState(284);
				((ForUpdatesContext)_localctx).ids = incDec();
				}
				}
				setState(289);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__21);
			setState(291);
			match(T__6);
			setState(292);
			exp(0);
			setState(293);
			match(T__9);
			setState(294);
			match(T__2);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
				{
				{
				setState(295);
				statement();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvokeExpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvokeExpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_invokeExpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			invoke();
			setState(304);
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext s;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			match(T__2);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222897836160L) != 0)) {
				{
				{
				setState(308);
				((DoWhileStatementContext)_localctx).s = statement();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(T__3);
			setState(315);
			match(T__21);
			setState(316);
			match(T__6);
			setState(317);
			((DoWhileStatementContext)_localctx).e = exp(0);
			setState(318);
			match(T__9);
			setState(319);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__23);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
				{
				setState(322);
				exp(0);
				}
			}

			setState(325);
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
	public static class NewExpArrayContext extends ExpContext {
		public TypeContext t;
		public ExpContext e;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NewExpArrayContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNewExpArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNewExpArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExpArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayAccessExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayAccessExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayAccessExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayAccessExp(this);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvokeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvokeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExp(this);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends ExpContext {
		public FalseLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public IdExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIdExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIdExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpContext extends ExpContext {
		public ExpContext e1;
		public Token op1;
		public ExpContext e2;
		public ExpContext e3;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TernaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterTernaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitTernaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitTernaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends ExpContext {
		public TrueLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayInitContext extends ExpContext {
		public TypeContext t;
		public ArrayInitContext a;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public NewArrayInitContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNewArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNewArrayInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewArrayInit(this);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpContext {
		public Token INT;
		public TerminalNode INT() { return getToken(ExtendedStaticJavaParser.INT, 0); }
		public IntLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntLiteral(this);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends ExpContext {
		public ExpContext e;
		public Token id;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldAccessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ExpContext {
		public NullLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpContext extends ExpContext {
		public Token id;
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public NewExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExp(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(328);
				((IntLiteralContext)_localctx).INT = match(INT);
				setState(329);
				if (!( new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($INT.text).bitLength() < 32 ");
				}
				break;
			case 2:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(T__24);
				}
				break;
			case 3:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				match(T__25);
				}
				break;
			case 4:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(T__26);
				}
				break;
			case 5:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(T__6);
				setState(334);
				exp(0);
				setState(335);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				invoke();
				}
				break;
			case 7:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				exp(15);
				}
				break;
			case 9:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				exp(14);
				}
				break;
			case 10:
				{
				_localctx = new NewExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(T__45);
				setState(344);
				((NewExpContext)_localctx).id = match(ID);
				setState(345);
				match(T__6);
				setState(346);
				match(T__9);
				}
				break;
			case 11:
				{
				_localctx = new NewExpArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				match(T__45);
				setState(348);
				((NewExpArrayContext)_localctx).t = type();
				setState(349);
				match(T__7);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
					{
					setState(350);
					((NewExpArrayContext)_localctx).e = exp(0);
					}
				}

				setState(353);
				match(T__8);
				}
				break;
			case 12:
				{
				_localctx = new NewArrayInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(T__45);
				setState(356);
				((NewArrayInitContext)_localctx).t = type();
				setState(357);
				match(T__7);
				setState(358);
				match(T__8);
				setState(359);
				((NewArrayInitContext)_localctx).a = arrayInit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(363);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(364);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(365);
						((BinaryExpContext)_localctx).e2 = exp(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(366);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(367);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						((BinaryExpContext)_localctx).e2 = exp(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(369);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(370);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						((BinaryExpContext)_localctx).e2 = exp(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(373);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						((BinaryExpContext)_localctx).e2 = exp(10);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(376);
						((BinaryExpContext)_localctx).op = match(T__40);
						setState(377);
						((BinaryExpContext)_localctx).e2 = exp(9);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(378);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(379);
						((BinaryExpContext)_localctx).op = match(T__41);
						setState(380);
						((BinaryExpContext)_localctx).e2 = exp(8);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(381);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(382);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						((BinaryExpContext)_localctx).e2 = exp(7);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpContext(new ExpContext(_parentctx, _parentState));
						((TernaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(384);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(385);
						((TernaryExpContext)_localctx).op1 = match(T__46);
						setState(386);
						((TernaryExpContext)_localctx).e2 = exp(0);
						setState(387);
						match(T__47);
						setState(388);
						((TernaryExpContext)_localctx).e3 = exp(2);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessExpContext(new ExpContext(_parentctx, _parentState));
						((ArrayAccessExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(390);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(391);
						match(T__7);
						setState(392);
						((ArrayAccessExpContext)_localctx).e2 = exp(0);
						setState(393);
						match(T__8);
						}
						break;
					case 10:
						{
						_localctx = new FieldAccessContext(new ExpContext(_parentctx, _parentState));
						((FieldAccessContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(395);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(396);
						match(T__17);
						setState(397);
						((FieldAccessContext)_localctx).id = match(ID);
						}
						break;
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public ArgsContext a;
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_invoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(403);
				((InvokeContext)_localctx).id1 = match(ID);
				setState(404);
				match(T__17);
				}
				break;
			}
			setState(407);
			((InvokeContext)_localctx).id2 = match(ID);
			setState(408);
			match(T__6);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1759222865854592L) != 0)) {
				{
				setState(409);
				((InvokeContext)_localctx).a = args();
				}
			}

			setState(412);
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
	public static class ArrayInitContext extends ParserRuleContext {
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
	 
		public ArrayInitContext() { }
		public void copyFrom(ArrayInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitilizationStatementContext extends ArrayInitContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayInitilizationStatementContext(ArrayInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayInitilizationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayInitilizationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayInitilizationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayInit);
		int _la;
		try {
			_localctx = new ArrayInitilizationStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__2);
			setState(415);
			((ArrayInitilizationStatementContext)_localctx).e1 = exp(0);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(416);
				match(T__13);
				setState(417);
				((ArrayInitilizationStatementContext)_localctx).e2 = exp(0);
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
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
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			exp(0);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(426);
				match(T__13);
				setState(427);
				exp(0);
				}
				}
				setState(432);
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
		case 4:
			return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 29:
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
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u01b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000"+
		"\n\u0000\f\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001X\b\u0001"+
		"\n\u0001\f\u0001[\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\b\u0001"+
		"\b\u0003\b\u009a\b\b\u0001\t\u0001\t\u0003\t\u009e\b\t\u0001\n\u0001\n"+
		"\u0003\n\u00a2\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a7"+
		"\b\u000b\n\u000b\f\u000b\u00aa\t\u000b\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0005\r\u00b0\b\r\n\r\f\r\u00b3\t\r\u0001\r\u0005\r\u00b6\b\r\n\r\f\r"+
		"\u00b9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00c7\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00cb\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00df\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e7\b\u0014\n\u0014"+
		"\f\u0014\u00ea\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00f0\b\u0014\n\u0014\f\u0014\u00f3\t\u0014\u0001\u0014\u0003"+
		"\u0014\u00f6\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fb"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ff\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0103\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0108\b\u0015\n\u0015\f\u0015\u010b\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0112\b\u0016\n"+
		"\u0016\f\u0016\u0115\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u011e\b\u0018\n"+
		"\u0018\f\u0018\u0121\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0129\b\u0019\n\u0019\f\u0019"+
		"\u012c\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0136\b\u001b\n\u001b"+
		"\f\u001b\u0139\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0144\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0160\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u016a\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u018f\b\u001d\n\u001d\f\u001d\u0192"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0196\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u019b\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a3\b\u001f"+
		"\n\u001f\f\u001f\u01a6\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u01ad\b \n \f \u01b0\t \u0001 \u0000\u0001:!\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@\u0000\u0007\u0001\u0000\u000f\u0010\u0001\u0000\u001c"+
		"\u001d\u0001\u0000\u001e\u001f\u0001\u0000 \"\u0001\u0000#&\u0001\u0000"+
		"\'(\u0001\u0000+-\u01cd\u0000E\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000"+
		"\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000"+
		"\bm\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000"+
		"\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a1\u0001\u0000"+
		"\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000"+
		"\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000"+
		"\u0000\u0000\u001e\u00c6\u0001\u0000\u0000\u0000 \u00c8\u0001\u0000\u0000"+
		"\u0000\"\u00cc\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000"+
		"&\u00de\u0001\u0000\u0000\u0000(\u00e0\u0001\u0000\u0000\u0000*\u00f7"+
		"\u0001\u0000\u0000\u0000,\u010e\u0001\u0000\u0000\u0000.\u0116\u0001\u0000"+
		"\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u0122\u0001\u0000\u0000\u0000"+
		"4\u012f\u0001\u0000\u0000\u00006\u0132\u0001\u0000\u0000\u00008\u0141"+
		"\u0001\u0000\u0000\u0000:\u0169\u0001\u0000\u0000\u0000<\u0195\u0001\u0000"+
		"\u0000\u0000>\u019e\u0001\u0000\u0000\u0000@\u01a9\u0001\u0000\u0000\u0000"+
		"BD\u0003\u0006\u0003\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HL\u0003\u0002\u0001\u0000IK\u0003"+
		"\u0006\u0003\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0005\u0002\u0000\u0000"+
		"ST\u00051\u0000\u0000TU\u0005\u0003\u0000\u0000UY\u0003\b\u0004\u0000"+
		"VX\u0003\u0004\u0002\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0004\u0000\u0000]\u0003"+
		"\u0001\u0000\u0000\u0000^a\u0003\f\u0006\u0000_a\u0003\u000e\u0007\u0000"+
		"`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0005\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u00051\u0000\u0000dh\u0005\u0003"+
		"\u0000\u0000eg\u0003\n\u0005\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0004\u0000\u0000"+
		"l\u0007\u0001\u0000\u0000\u0000mn\u0005\u0001\u0000\u0000no\u0005\u0005"+
		"\u0000\u0000op\u0005\u0006\u0000\u0000pq\u00051\u0000\u0000qr\u0004\u0004"+
		"\u0000\u0001rs\u0005\u0007\u0000\u0000st\u00051\u0000\u0000tu\u0004\u0004"+
		"\u0001\u0001uv\u0005\b\u0000\u0000vw\u0005\t\u0000\u0000wx\u00051\u0000"+
		"\u0000xy\u0005\n\u0000\u0000yz\u0005\u0003\u0000\u0000z{\u0003\u001a\r"+
		"\u0000{|\u0005\u0004\u0000\u0000|\t\u0001\u0000\u0000\u0000}~\u0005\u0001"+
		"\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080\u00051\u0000\u0000"+
		"\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u000b\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084"+
		"\u0085\u00051\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\r"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089"+
		"\u0003\u0012\t\u0000\u0089\u008a\u00051\u0000\u0000\u008a\u008c\u0005"+
		"\u0007\u0000\u0000\u008b\u008d\u0003\u0016\u000b\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\n\u0000\u0000\u008f\u0090\u0005\u0003"+
		"\u0000\u0000\u0090\u0091\u0003\u001a\r\u0000\u0091\u0092\u0005\u0004\u0000"+
		"\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0096\u0003\u0014\n\u0000"+
		"\u0094\u0096\u00051\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\b\u0000\u0000\u0098\u009a\u0005\t\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0011"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0005\u0006\u0000\u0000\u009c\u009e"+
		"\u0003\u0010\b\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f\u00a2\u0005"+
		"\f\u0000\u0000\u00a0\u00a2\u0005\r\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0015\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a8\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u000e\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0018\f\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u0010\b\u0000\u00ac"+
		"\u00ad\u00051\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0003\u001c\u000e\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001b"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0003\u0010\b\u0000\u00bb\u00bc\u00051\u0000\u0000\u00bc\u00bd\u0005"+
		"\u000b\u0000\u0000\u00bd\u001d\u0001\u0000\u0000\u0000\u00be\u00c7\u0003"+
		"$\u0012\u0000\u00bf\u00c7\u0003(\u0014\u0000\u00c0\u00c7\u00032\u0019"+
		"\u0000\u00c1\u00c7\u00034\u001a\u0000\u00c2\u00c7\u00038\u001c\u0000\u00c3"+
		"\u00c7\u0003*\u0015\u0000\u00c4\u00c7\u00036\u001b\u0000\u00c5\u00c7\u0003"+
		" \u0010\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\"\u0011"+
		"\u0000\u00c9\u00cb\u0005\u000b\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0003:\u001d\u0000\u00cd\u00ce\u0007\u0000\u0000\u0000\u00ce"+
		"#\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d1\u0005"+
		"\u0011\u0000\u0000\u00d1\u00d2\u0003:\u001d\u0000\u00d2\u00d3\u0005\u000b"+
		"\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000\u00d4\u00df\u00051\u0000\u0000"+
		"\u00d5\u00d6\u0003:\u001d\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000\u00d7"+
		"\u00d8\u00051\u0000\u0000\u00d8\u00df\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003:\u001d\u0000\u00da\u00db\u0005\b\u0000\u0000\u00db\u00dc\u0003"+
		":\u001d\u0000\u00dc\u00dd\u0005\t\u0000\u0000\u00dd\u00df\u0001\u0000"+
		"\u0000\u0000\u00de\u00d4\u0001\u0000\u0000\u0000\u00de\u00d5\u0001\u0000"+
		"\u0000\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00df\'\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0013\u0000\u0000\u00e1\u00e2\u0005\u0007\u0000"+
		"\u0000\u00e2\u00e3\u0003:\u001d\u0000\u00e3\u00e4\u0005\n\u0000\u0000"+
		"\u00e4\u00e8\u0005\u0003\u0000\u0000\u00e5\u00e7\u0003\u001e\u000f\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00f5\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005\u0014\u0000\u0000"+
		"\u00ed\u00f1\u0005\u0003\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0005\u0004\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6)\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0015\u0000\u0000\u00f8\u00fa\u0005\u0007\u0000\u0000\u00f9"+
		"\u00fb\u0003,\u0016\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0005\u000b\u0000\u0000\u00fd\u00ff\u0003:\u001d\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0005\u000b\u0000\u0000\u0101\u0103\u0003"+
		"0\u0018\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005\n\u0000"+
		"\u0000\u0105\u0109\u0005\u0003\u0000\u0000\u0106\u0108\u0003\u001e\u000f"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0004\u0000\u0000\u010d+\u0001\u0000\u0000\u0000"+
		"\u010e\u0113\u0003.\u0017\u0000\u010f\u0110\u0005\u000e\u0000\u0000\u0110"+
		"\u0112\u0003.\u0017\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114-\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0003&\u0013\u0000\u0117\u0118\u0005\u0011"+
		"\u0000\u0000\u0118\u0119\u0003:\u001d\u0000\u0119/\u0001\u0000\u0000\u0000"+
		"\u011a\u011f\u0003\"\u0011\u0000\u011b\u011c\u0005\u000e\u0000\u0000\u011c"+
		"\u011e\u0003\"\u0011\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u01201\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005\u0016\u0000\u0000\u0123\u0124\u0005"+
		"\u0007\u0000\u0000\u0124\u0125\u0003:\u001d\u0000\u0125\u0126\u0005\n"+
		"\u0000\u0000\u0126\u012a\u0005\u0003\u0000\u0000\u0127\u0129\u0003\u001e"+
		"\u000f\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0005\u0004\u0000\u0000\u012e3\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0003<\u001e\u0000\u0130\u0131\u0005\u000b\u0000\u0000"+
		"\u01315\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0017\u0000\u0000\u0133"+
		"\u0137\u0005\u0003\u0000\u0000\u0134\u0136\u0003\u001e\u000f\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u0004\u0000\u0000\u013b\u013c\u0005\u0016\u0000\u0000\u013c"+
		"\u013d\u0005\u0007\u0000\u0000\u013d\u013e\u0003:\u001d\u0000\u013e\u013f"+
		"\u0005\n\u0000\u0000\u013f\u0140\u0005\u000b\u0000\u0000\u01407\u0001"+
		"\u0000\u0000\u0000\u0141\u0143\u0005\u0018\u0000\u0000\u0142\u0144\u0003"+
		":\u001d\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u000b"+
		"\u0000\u0000\u01469\u0001\u0000\u0000\u0000\u0147\u0148\u0006\u001d\uffff"+
		"\uffff\u0000\u0148\u0149\u00052\u0000\u0000\u0149\u016a\u0004\u001d\u0002"+
		"\u0001\u014a\u016a\u0005\u0019\u0000\u0000\u014b\u016a\u0005\u001a\u0000"+
		"\u0000\u014c\u016a\u0005\u001b\u0000\u0000\u014d\u014e\u0005\u0007\u0000"+
		"\u0000\u014e\u014f\u0003:\u001d\u0000\u014f\u0150\u0005\n\u0000\u0000"+
		"\u0150\u016a\u0001\u0000\u0000\u0000\u0151\u016a\u0003<\u001e\u0000\u0152"+
		"\u016a\u00051\u0000\u0000\u0153\u0154\u0007\u0001\u0000\u0000\u0154\u016a"+
		"\u0003:\u001d\u000f\u0155\u0156\u0007\u0002\u0000\u0000\u0156\u016a\u0003"+
		":\u001d\u000e\u0157\u0158\u0005.\u0000\u0000\u0158\u0159\u00051\u0000"+
		"\u0000\u0159\u015a\u0005\u0007\u0000\u0000\u015a\u016a\u0005\n\u0000\u0000"+
		"\u015b\u015c\u0005.\u0000\u0000\u015c\u015d\u0003\u0010\b\u0000\u015d"+
		"\u015f\u0005\b\u0000\u0000\u015e\u0160\u0003:\u001d\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0005\t\u0000\u0000\u0162\u016a\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005.\u0000\u0000\u0164\u0165\u0003\u0010"+
		"\b\u0000\u0165\u0166\u0005\b\u0000\u0000\u0166\u0167\u0005\t\u0000\u0000"+
		"\u0167\u0168\u0003>\u001f\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169"+
		"\u0147\u0001\u0000\u0000\u0000\u0169\u014a\u0001\u0000\u0000\u0000\u0169"+
		"\u014b\u0001\u0000\u0000\u0000\u0169\u014c\u0001\u0000\u0000\u0000\u0169"+
		"\u014d\u0001\u0000\u0000\u0000\u0169\u0151\u0001\u0000\u0000\u0000\u0169"+
		"\u0152\u0001\u0000\u0000\u0000\u0169\u0153\u0001\u0000\u0000\u0000\u0169"+
		"\u0155\u0001\u0000\u0000\u0000\u0169\u0157\u0001\u0000\u0000\u0000\u0169"+
		"\u015b\u0001\u0000\u0000\u0000\u0169\u0163\u0001\u0000\u0000\u0000\u016a"+
		"\u0190\u0001\u0000\u0000\u0000\u016b\u016c\n\f\u0000\u0000\u016c\u016d"+
		"\u0007\u0003\u0000\u0000\u016d\u018f\u0003:\u001d\r\u016e\u016f\n\u000b"+
		"\u0000\u0000\u016f\u0170\u0007\u0001\u0000\u0000\u0170\u018f\u0003:\u001d"+
		"\f\u0171\u0172\n\n\u0000\u0000\u0172\u0173\u0007\u0004\u0000\u0000\u0173"+
		"\u018f\u0003:\u001d\u000b\u0174\u0175\n\t\u0000\u0000\u0175\u0176\u0007"+
		"\u0005\u0000\u0000\u0176\u018f\u0003:\u001d\n\u0177\u0178\n\b\u0000\u0000"+
		"\u0178\u0179\u0005)\u0000\u0000\u0179\u018f\u0003:\u001d\t\u017a\u017b"+
		"\n\u0007\u0000\u0000\u017b\u017c\u0005*\u0000\u0000\u017c\u018f\u0003"+
		":\u001d\b\u017d\u017e\n\u0006\u0000\u0000\u017e\u017f\u0007\u0006\u0000"+
		"\u0000\u017f\u018f\u0003:\u001d\u0007\u0180\u0181\n\u0001\u0000\u0000"+
		"\u0181\u0182\u0005/\u0000\u0000\u0182\u0183\u0003:\u001d\u0000\u0183\u0184"+
		"\u00050\u0000\u0000\u0184\u0185\u0003:\u001d\u0002\u0185\u018f\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\n\r\u0000\u0000\u0187\u0188\u0005\b\u0000\u0000"+
		"\u0188\u0189\u0003:\u001d\u0000\u0189\u018a\u0005\t\u0000\u0000\u018a"+
		"\u018f\u0001\u0000\u0000\u0000\u018b\u018c\n\u0002\u0000\u0000\u018c\u018d"+
		"\u0005\u0012\u0000\u0000\u018d\u018f\u00051\u0000\u0000\u018e\u016b\u0001"+
		"\u0000\u0000\u0000\u018e\u016e\u0001\u0000\u0000\u0000\u018e\u0171\u0001"+
		"\u0000\u0000\u0000\u018e\u0174\u0001\u0000\u0000\u0000\u018e\u0177\u0001"+
		"\u0000\u0000\u0000\u018e\u017a\u0001\u0000\u0000\u0000\u018e\u017d\u0001"+
		"\u0000\u0000\u0000\u018e\u0180\u0001\u0000\u0000\u0000\u018e\u0186\u0001"+
		"\u0000\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191;\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u00051\u0000\u0000\u0194\u0196\u0005\u0012\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u00051\u0000\u0000"+
		"\u0198\u019a\u0005\u0007\u0000\u0000\u0199\u019b\u0003@ \u0000\u019a\u0199"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0005\n\u0000\u0000\u019d=\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a4\u0003"+
		":\u001d\u0000\u01a0\u01a1\u0005\u000e\u0000\u0000\u01a1\u01a3\u0003:\u001d"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005\u0004\u0000\u0000\u01a8?\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ae\u0003:\u001d\u0000\u01aa\u01ab\u0005\u000e\u0000\u0000\u01ab"+
		"\u01ad\u0003:\u001d\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01afA\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000$ELY`h\u008c\u0095\u0099\u009d\u00a1\u00a8\u00b1\u00b7"+
		"\u00c6\u00ca\u00de\u00e8\u00f1\u00f5\u00fa\u00fe\u0102\u0109\u0113\u011f"+
		"\u012a\u0137\u0143\u015f\u0169\u018e\u0190\u0195\u019a\u01a4\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}