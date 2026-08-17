// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/Project/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExtendedStaticJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, ID=48, INT=49, SEMICOLON=50, WS=51, ERROR=52;
	public static final int
		RULE_compilationUnit = 0, RULE_classDefinition = 1, RULE_simpleClassDeclaration = 2, 
		RULE_publicFieldDeclaration = 3, RULE_memberDeclaration = 4, RULE_mainMethodDeclaration = 5, 
		RULE_fieldDeclaration = 6, RULE_methodDeclaration = 7, RULE_returnType = 8, 
		RULE_type = 9, RULE_basicType = 10, RULE_params = 11, RULE_param = 12, 
		RULE_methodBody = 13, RULE_localDeclaration = 14, RULE_statement = 15, 
		RULE_incDecStatement = 16, RULE_assignStatement = 17, RULE_assign = 18, 
		RULE_incDec = 19, RULE_lhs = 20, RULE_ifStatement = 21, RULE_whileStatement = 22, 
		RULE_forStatement = 23, RULE_forInits = 24, RULE_forUpdates = 25, RULE_invokeExpStatement = 26, 
		RULE_doWhileStatement = 27, RULE_returnStatement = 28, RULE_exp = 29, 
		RULE_invoke = 30, RULE_arrayInit = 31, RULE_args = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDefinition", "simpleClassDeclaration", "publicFieldDeclaration", 
			"memberDeclaration", "mainMethodDeclaration", "fieldDeclaration", "methodDeclaration", 
			"returnType", "type", "basicType", "params", "param", "methodBody", "localDeclaration", 
			"statement", "incDecStatement", "assignStatement", "assign", "incDec", 
			"lhs", "ifStatement", "whileStatement", "forStatement", "forInits", "forUpdates", 
			"invokeExpStatement", "doWhileStatement", "returnStatement", "exp", "invoke", 
			"arrayInit", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'{'", "'}'", "'static'", "'void'", "'('", 
			"'['", "']'", "')'", "'boolean'", "'int'", "','", "'='", "'++'", "'--'", 
			"'.'", "'if'", "'else'", "'while'", "'for'", "'do'", "'return'", "'true'", 
			"'false'", "'null'", "'-'", "'+'", "'!'", "'~'", "'*'", "'/'", "'%'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'>>'", 
			"'<<'", "'>>>'", "'new'", "'?'", "':'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "SEMICOLON", "WS", "ERROR"
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
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	 
		public CompilationUnitContext() { }
		public void copyFrom(CompilationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntryPointContext extends CompilationUnitContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExtendedStaticJavaParser.EOF, 0); }
		public List<SimpleClassDeclarationContext> simpleClassDeclaration() {
			return getRuleContexts(SimpleClassDeclarationContext.class);
		}
		public SimpleClassDeclarationContext simpleClassDeclaration(int i) {
			return getRuleContext(SimpleClassDeclarationContext.class,i);
		}
		public EntryPointContext(CompilationUnitContext ctx) { copyFrom(ctx); }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			_localctx = new EntryPointContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(66);
				simpleClassDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			classDefinition();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(73);
				simpleClassDeclaration();
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
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
	 
		public ClassDefinitionContext() { }
		public void copyFrom(ClassDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ClassDefinitionContext {
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
		public ClassDeclarationContext(ClassDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			_localctx = new ClassDeclarationContext(_localctx);
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(85);
				mainMethodDeclaration();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(88);
				memberDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public List<PublicFieldDeclarationContext> publicFieldDeclaration() {
			return getRuleContexts(PublicFieldDeclarationContext.class);
		}
		public PublicFieldDeclarationContext publicFieldDeclaration(int i) {
			return getRuleContext(PublicFieldDeclarationContext.class,i);
		}
		public CustomClassDeclarationContext(SimpleClassDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final SimpleClassDeclarationContext simpleClassDeclaration() throws RecognitionException {
		SimpleClassDeclarationContext _localctx = new SimpleClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleClassDeclaration);
		int _la;
		try {
			_localctx = new CustomClassDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__1);
			setState(97);
			match(ID);
			setState(98);
			match(T__2);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				publicFieldDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public PublicDecLarationContext(PublicFieldDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final PublicFieldDeclarationContext publicFieldDeclaration() throws RecognitionException {
		PublicFieldDeclarationContext _localctx = new PublicFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_publicFieldDeclaration);
		try {
			_localctx = new PublicDecLarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(108);
			type();
			setState(109);
			match(ID);
			setState(110);
			match(SEMICOLON);
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
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	 
		public MemberDeclarationContext() { }
		public void copyFrom(MemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodMemberDeclarationContext extends MemberDeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodMemberDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldMemberDeclarationContext extends MemberDeclarationContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FieldMemberDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memberDeclaration);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FieldMemberDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				fieldDeclaration();
				}
				break;
			case 2:
				_localctx = new MethodMemberDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
	 
		public MainMethodDeclarationContext() { }
		public void copyFrom(MainMethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainStatementContext extends MainMethodDeclarationContext {
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
		public MainStatementContext(MainMethodDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethodDeclaration);
		try {
			_localctx = new MainStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(117);
			match(T__4);
			setState(118);
			match(T__5);
			setState(119);
			((MainStatementContext)_localctx).id1 = match(ID);
			setState(120);
			if (!( "main".equals((((MainStatementContext)_localctx).id1!=null?((MainStatementContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(121);
			match(T__6);
			setState(122);
			((MainStatementContext)_localctx).id2 = match(ID);
			setState(123);
			if (!( "String".equals((((MainStatementContext)_localctx).id2!=null?((MainStatementContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(124);
			match(T__7);
			setState(125);
			match(T__8);
			setState(126);
			((MainStatementContext)_localctx).id3 = match(ID);
			setState(127);
			match(T__9);
			setState(128);
			match(T__2);
			setState(129);
			methodBody();
			setState(130);
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
	public static class ClassFieldDeclarationContext extends FieldDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public ClassFieldDeclarationContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			_localctx = new ClassFieldDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__4);
			setState(133);
			type();
			setState(134);
			match(ID);
			setState(135);
			match(SEMICOLON);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__4);
			setState(138);
			returnType();
			setState(139);
			match(ID);
			setState(140);
			match(T__6);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976716800L) != 0)) {
				{
				setState(141);
				params();
				}
			}

			setState(144);
			match(T__9);
			setState(145);
			match(T__2);
			setState(146);
			methodBody();
			setState(147);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidReturnTypeContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnType);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__5);
				}
				break;
			case T__10:
			case T__11:
			case ID:
				_localctx = new NonVoidReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
	public static class TypeDecContext extends TypeContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeDecContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			_localctx = new TypeDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				{
				setState(153);
				basicType();
				}
				break;
			case ID:
				{
				setState(154);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(157);
				match(T__7);
				setState(158);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends BasicTypeContext {
		public IntTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicType);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__11);
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
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParamsContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParamsContext ctx) { copyFrom(ctx); }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			param();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(166);
				match(T__12);
				setState(167);
				param();
				}
				}
				setState(172);
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
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ParameterContext(ParamContext ctx) { copyFrom(ctx); }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			type();
			setState(174);
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
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	 
		public MethodBodyContext() { }
		public void copyFrom(MethodBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends MethodBodyContext {
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
		public MethodContext(MethodBodyContext ctx) { copyFrom(ctx); }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodBody);
		int _la;
		try {
			int _alt;
			_localctx = new MethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					localDeclaration();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
				{
				{
				setState(182);
				statement();
				}
				}
				setState(187);
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
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
	 
		public LocalDeclarationContext() { }
		public void copyFrom(LocalDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends LocalDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public DeclarationContext(LocalDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localDeclaration);
		try {
			_localctx = new DeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			type();
			setState(189);
			match(ID);
			setState(190);
			match(SEMICOLON);
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
	public static class AssignmentStateContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public AssignmentStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStateContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStateContext extends StatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DoWhileStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStateContext extends StatementContext {
		public IncDecStatementContext incDecStatement() {
			return getRuleContext(IncDecStatementContext.class,0);
		}
		public IncDecStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStateContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStateContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvocationStateContext extends StatementContext {
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public InvocationStateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStateContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStateContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignmentStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				assignStatement();
				}
				break;
			case 2:
				_localctx = new IfStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new WhileStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				whileStatement();
				}
				break;
			case 4:
				_localctx = new InvocationStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				invokeExpStatement();
				}
				break;
			case 5:
				_localctx = new ReturnStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				returnStatement();
				}
				break;
			case 6:
				_localctx = new ForStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				forStatement();
				}
				break;
			case 7:
				_localctx = new DoWhileStateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				doWhileStatement();
				}
				break;
			case 8:
				_localctx = new IncDecStateContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
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
		public IncDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStatement; }
	 
		public IncDecStatementContext() { }
		public void copyFrom(IncDecStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecDeclarationContext extends IncDecStatementContext {
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public IncDecDeclarationContext(IncDecStatementContext ctx) { copyFrom(ctx); }
	}

	public final IncDecStatementContext incDecStatement() throws RecognitionException {
		IncDecStatementContext _localctx = new IncDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_incDecStatement);
		int _la;
		try {
			_localctx = new IncDecDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			incDec();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(203);
				match(SEMICOLON);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	 
		public AssignStatementContext() { }
		public void copyFrom(AssignStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends AssignStatementContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public AssignmentContext(AssignStatementContext ctx) { copyFrom(ctx); }
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignStatement);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			assign();
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(207);
				match(SEMICOLON);
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
	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignOperatorContext extends AssignContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignOperatorContext(AssignContext ctx) { copyFrom(ctx); }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			_localctx = new AssignOperatorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			lhs();
			setState(211);
			match(T__13);
			setState(212);
			exp(0);
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
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
	 
		public IncDecContext() { }
		public void copyFrom(IncDecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecOperatorContext extends IncDecContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IncDecOperatorContext(IncDecContext ctx) { copyFrom(ctx); }
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incDec);
		int _la;
		try {
			_localctx = new IncDecOperatorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			exp(0);
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
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
	public static class LhsContext extends ParserRuleContext {
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
	 
		public LhsContext() { }
		public void copyFrom(LhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessStateContext extends LhsContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayAccessStateContext(LhsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessStateContext extends LhsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public AccessStateContext(LhsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LhsStateContext extends LhsContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public LhsStateContext(LhsContext ctx) { copyFrom(ctx); }
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lhs);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LhsStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AccessStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				exp(0);
				setState(219);
				match(T__16);
				setState(220);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ArrayAccessStateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				exp(0);
				setState(223);
				match(T__7);
				setState(224);
				exp(0);
				setState(225);
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfDeclarationContext extends IfStatementContext {
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
		public IfDeclarationContext(IfStatementContext ctx) { copyFrom(ctx); }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__17);
			setState(230);
			match(T__6);
			setState(231);
			exp(0);
			setState(232);
			match(T__9);
			setState(233);
			match(T__2);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
				{
				{
				setState(234);
				((IfDeclarationContext)_localctx).statement = statement();
				((IfDeclarationContext)_localctx).ts.add(((IfDeclarationContext)_localctx).statement);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__3);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(241);
				match(T__18);
				setState(242);
				match(T__2);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
					{
					{
					setState(243);
					((IfDeclarationContext)_localctx).statement = statement();
					((IfDeclarationContext)_localctx).fs.add(((IfDeclarationContext)_localctx).statement);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
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
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileDeclarationContext extends WhileStatementContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileDeclarationContext(WhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		int _la;
		try {
			_localctx = new WhileDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__19);
			setState(253);
			match(T__6);
			setState(254);
			exp(0);
			setState(255);
			match(T__9);
			setState(256);
			match(T__2);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
				{
				{
				setState(257);
				statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(ExtendedStaticJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ExtendedStaticJavaParser.SEMICOLON, i);
		}
		public ForInitsContext forInits() {
			return getRuleContext(ForInitsContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__20);
			setState(266);
			match(T__6);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
				{
				setState(267);
				forInits();
				}
			}

			setState(270);
			match(SEMICOLON);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
				{
				{
				setState(271);
				exp(0);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(SEMICOLON);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
				{
				setState(278);
				forUpdates();
				}
			}

			setState(281);
			match(T__9);
			setState(282);
			match(T__2);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
				{
				{
				setState(283);
				statement();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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
		public ForInitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInits; }
	 
		public ForInitsContext() { }
		public void copyFrom(ForInitsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitStatementContext extends ForInitsContext {
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public AssignStatementContext assignStatement(int i) {
			return getRuleContext(AssignStatementContext.class,i);
		}
		public ForInitStatementContext(ForInitsContext ctx) { copyFrom(ctx); }
	}

	public final ForInitsContext forInits() throws RecognitionException {
		ForInitsContext _localctx = new ForInitsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInits);
		int _la;
		try {
			_localctx = new ForInitStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			assignStatement();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(292);
				match(T__12);
				setState(293);
				assignStatement();
				}
				}
				setState(298);
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
	public static class ForUpdatesContext extends ParserRuleContext {
		public ForUpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdates; }
	 
		public ForUpdatesContext() { }
		public void copyFrom(ForUpdatesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateStatementContext extends ForUpdatesContext {
		public List<IncDecStatementContext> incDecStatement() {
			return getRuleContexts(IncDecStatementContext.class);
		}
		public IncDecStatementContext incDecStatement(int i) {
			return getRuleContext(IncDecStatementContext.class,i);
		}
		public ForUpdateStatementContext(ForUpdatesContext ctx) { copyFrom(ctx); }
	}

	public final ForUpdatesContext forUpdates() throws RecognitionException {
		ForUpdatesContext _localctx = new ForUpdatesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forUpdates);
		int _la;
		try {
			_localctx = new ForUpdateStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			incDecStatement();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(300);
				match(T__12);
				setState(301);
				incDecStatement();
				}
				}
				setState(306);
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
	public static class InvokeExpStatementContext extends ParserRuleContext {
		public InvokeExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpStatement; }
	 
		public InvokeExpStatementContext() { }
		public void copyFrom(InvokeExpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeDeclarationContext extends InvokeExpStatementContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public InvokeDeclarationContext(InvokeExpStatementContext ctx) { copyFrom(ctx); }
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_invokeExpStatement);
		try {
			_localctx = new InvokeDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			invoke();
			setState(308);
			match(SEMICOLON);
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
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	 
		public DoWhileStatementContext() { }
		public void copyFrom(DoWhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileDeclarationContext extends DoWhileStatementContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileDeclarationContext(DoWhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doWhileStatement);
		int _la;
		try {
			_localctx = new DoWhileDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__21);
			setState(311);
			match(T__2);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611448918144L) != 0)) {
				{
				{
				setState(312);
				statement();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(T__3);
			setState(319);
			match(T__19);
			setState(320);
			match(T__6);
			setState(321);
			exp(0);
			setState(322);
			match(T__9);
			setState(323);
			match(SEMICOLON);
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
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnDeclarationContext extends ReturnStatementContext {
		public TerminalNode SEMICOLON() { return getToken(ExtendedStaticJavaParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnDeclarationContext(ReturnStatementContext ctx) { copyFrom(ctx); }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__22);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
				{
				setState(326);
				exp(0);
				}
			}

			setState(329);
			match(SEMICOLON);
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
	public static class NewContext extends ExpContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public NewContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpContext extends ExpContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends ExpContext {
		public FalseLiteralContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public IdExpContext(ExpContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayAccessContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends ExpContext {
		public TrueLiteralContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpContext {
		public Token INT;
		public TerminalNode INT() { return getToken(ExtendedStaticJavaParser.INT, 0); }
		public IntLiteralContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldAccessContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ExpContext {
		public NullLiteralContext(ExpContext ctx) { copyFrom(ctx); }
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(332);
				((IntLiteralContext)_localctx).INT = match(INT);
				setState(333);
				if (!( new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($INT.text).bitLength() < 32 ");
				}
				break;
			case 2:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(T__23);
				}
				break;
			case 3:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(T__24);
				}
				break;
			case 4:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(T__25);
				}
				break;
			case 5:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(T__6);
				setState(338);
				exp(0);
				setState(339);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				invoke();
				}
				break;
			case 7:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				exp(15);
				}
				break;
			case 9:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				exp(14);
				}
				break;
			case 10:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				match(T__44);
				setState(348);
				match(ID);
				setState(349);
				match(T__6);
				setState(350);
				match(T__9);
				}
				break;
			case 11:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(T__44);
				setState(352);
				type();
				setState(353);
				match(T__7);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
					{
					setState(354);
					exp(0);
					}
				}

				setState(357);
				match(T__8);
				}
				break;
			case 12:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(T__44);
				setState(360);
				type();
				setState(361);
				match(T__7);
				setState(362);
				match(T__8);
				setState(363);
				arrayInit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(368);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((BinaryExpContext)_localctx).e2 = exp(14);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(371);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(372);
						((BinaryExpContext)_localctx).e2 = exp(13);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(373);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(374);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						((BinaryExpContext)_localctx).e2 = exp(12);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(376);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(377);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(378);
						((BinaryExpContext)_localctx).e2 = exp(11);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(379);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(380);
						((BinaryExpContext)_localctx).op = match(T__39);
						setState(381);
						((BinaryExpContext)_localctx).e2 = exp(10);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(382);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(383);
						((BinaryExpContext)_localctx).op = match(T__40);
						setState(384);
						((BinaryExpContext)_localctx).e2 = exp(9);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(385);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(386);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(387);
						((BinaryExpContext)_localctx).e2 = exp(8);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpContext(new ExpContext(_parentctx, _parentState));
						((TernaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(388);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(389);
						((TernaryExpContext)_localctx).op1 = match(T__45);
						setState(390);
						((TernaryExpContext)_localctx).e2 = exp(0);
						setState(391);
						match(T__46);
						setState(392);
						((TernaryExpContext)_localctx).e3 = exp(2);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessContext(new ExpContext(_parentctx, _parentState));
						((ArrayAccessContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(394);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(395);
						match(T__7);
						setState(396);
						((ArrayAccessContext)_localctx).e2 = exp(0);
						setState(397);
						match(T__8);
						}
						break;
					case 10:
						{
						_localctx = new FieldAccessContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						match(T__16);
						setState(401);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
	 
		public InvokeContext() { }
		public void copyFrom(InvokeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeStatementContext extends InvokeContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeStatementContext(InvokeContext ctx) { copyFrom(ctx); }
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_invoke);
		int _la;
		try {
			_localctx = new InvokeStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(407);
				((InvokeStatementContext)_localctx).id1 = match(ID);
				setState(408);
				match(T__16);
				}
				break;
			}
			setState(411);
			((InvokeStatementContext)_localctx).id2 = match(ID);
			setState(412);
			match(T__6);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 879611432927360L) != 0)) {
				{
				setState(413);
				args();
				}
			}

			setState(416);
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
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayInit);
		int _la;
		try {
			_localctx = new ArrayInitilizationStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__2);
			setState(419);
			((ArrayInitilizationStatementContext)_localctx).e1 = exp(0);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(420);
				match(T__12);
				setState(421);
				((ArrayInitilizationStatementContext)_localctx).e2 = exp(0);
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
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
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgStatementContext extends ArgsContext {
		public ExpContext e1;
		public ExpContext d2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgStatementContext(ArgsContext ctx) { copyFrom(ctx); }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_args);
		int _la;
		try {
			_localctx = new ArgStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			((ArgStatementContext)_localctx).e1 = exp(0);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(430);
				match(T__12);
				setState(431);
				((ArgStatementContext)_localctx).d2 = exp(0);
				}
				}
				setState(436);
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
		case 5:
			return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 29:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mainMethodDeclaration_sempred(MainMethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  "main".equals((((MainStatementContext)_localctx).id1!=null?((MainStatementContext)_localctx).id1.getText():null)) ;
		case 1:
			return  "String".equals((((MainStatementContext)_localctx).id2!=null?((MainStatementContext)_localctx).id2.getText():null)) ;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 ;
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u01b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001"+
		"\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002"+
		"\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"s\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003"+
		"\b\u0098\b\b\u0001\t\u0001\t\u0003\t\u009c\b\t\u0001\t\u0001\t\u0003\t"+
		"\u00a0\b\t\u0001\n\u0001\n\u0003\n\u00a4\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a9\b\u000b\n\u000b\f\u000b\u00ac\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0005\r\u00b2\b\r\n\r\f\r\u00b5\t\r\u0001\r\u0005"+
		"\r\u00b8\b\r\n\r\f\r\u00bb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00cd\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d1"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e4\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00ec\b\u0015\n\u0015\f\u0015\u00ef\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f5\b\u0015"+
		"\n\u0015\f\u0015\u00f8\t\u0015\u0001\u0015\u0003\u0015\u00fb\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0103\b\u0016\n\u0016\f\u0016\u0106\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010d\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0111\b\u0017\n\u0017\f\u0017\u0114\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0118\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u011d\b\u0017\n\u0017\f\u0017\u0120\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0127\b\u0018"+
		"\n\u0018\f\u0018\u012a\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u012f\b\u0019\n\u0019\f\u0019\u0132\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u013a\b\u001b"+
		"\n\u001b\f\u001b\u013d\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0148\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0164\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u016e\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0193\b\u001d\n\u001d\f\u001d"+
		"\u0196\t\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u019a\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u019f\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a7"+
		"\b\u001f\n\u001f\f\u001f\u01aa\t\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0005 \u01b1\b \n \f \u01b4\t \u0001 \u0000\u0001:!\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@\u0000\u0007\u0001\u0000\u000f\u0010\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\u001d\u001e\u0001\u0000\u001f!\u0001\u0000\""+
		"%\u0001\u0000&\'\u0001\u0000*,\u01d3\u0000E\u0001\u0000\u0000\u0000\u0002"+
		"Q\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006k\u0001"+
		"\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000"+
		"\f\u0084\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010"+
		"\u0097\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014"+
		"\u00a3\u0001\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018"+
		"\u00ad\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c"+
		"\u00bc\u0001\u0000\u0000\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00ca"+
		"\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d2\u0001"+
		"\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000"+
		"\u0000*\u00e5\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000."+
		"\u0109\u0001\u0000\u0000\u00000\u0123\u0001\u0000\u0000\u00002\u012b\u0001"+
		"\u0000\u0000\u00004\u0133\u0001\u0000\u0000\u00006\u0136\u0001\u0000\u0000"+
		"\u00008\u0145\u0001\u0000\u0000\u0000:\u016d\u0001\u0000\u0000\u0000<"+
		"\u0199\u0001\u0000\u0000\u0000>\u01a2\u0001\u0000\u0000\u0000@\u01ad\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0004\u0002\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HL\u0003\u0002"+
		"\u0001\u0000IK\u0003\u0004\u0002\u0000JI\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0000\u0000"+
		"\u0001P\u0001\u0001\u0000\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0005"+
		"\u0002\u0000\u0000ST\u00050\u0000\u0000TV\u0005\u0003\u0000\u0000UW\u0003"+
		"\n\u0005\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0001"+
		"\u0000\u0000\u0000XZ\u0003\b\u0004\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0004\u0000"+
		"\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0005"+
		"0\u0000\u0000bf\u0005\u0003\u0000\u0000ce\u0003\u0006\u0003\u0000dc\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0004\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0001\u0000\u0000lm\u0003\u0012\t\u0000mn\u00050\u0000\u0000no\u0005"+
		"2\u0000\u0000o\u0007\u0001\u0000\u0000\u0000ps\u0003\f\u0006\u0000qs\u0003"+
		"\u000e\u0007\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"s\t\u0001\u0000\u0000\u0000tu\u0005\u0001\u0000\u0000uv\u0005\u0005\u0000"+
		"\u0000vw\u0005\u0006\u0000\u0000wx\u00050\u0000\u0000xy\u0004\u0005\u0000"+
		"\u0001yz\u0005\u0007\u0000\u0000z{\u00050\u0000\u0000{|\u0004\u0005\u0001"+
		"\u0001|}\u0005\b\u0000\u0000}~\u0005\t\u0000\u0000~\u007f\u00050\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000"+
		"\u0081\u0082\u0003\u001a\r\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083"+
		"\u000b\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085"+
		"\u0086\u0003\u0012\t\u0000\u0086\u0087\u00050\u0000\u0000\u0087\u0088"+
		"\u00052\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u0005\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c\u00050"+
		"\u0000\u0000\u008c\u008e\u0005\u0007\u0000\u0000\u008d\u008f\u0003\u0016"+
		"\u000b\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\n\u0000"+
		"\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0003\u001a\r\u0000"+
		"\u0093\u0094\u0005\u0004\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0005\u0006\u0000\u0000\u0096\u0098\u0003\u0012\t\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0011\u0001\u0000\u0000\u0000\u0099\u009c\u0003\u0014\n\u0000\u009a\u009c"+
		"\u00050\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\b\u0000\u0000\u009e\u00a0\u0005\t\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0013\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0005\u000b\u0000\u0000\u00a2\u00a4\u0005\f\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003\u0018\f\u0000"+
		"\u00a6\u00a7\u0005\r\u0000\u0000\u00a7\u00a9\u0003\u0018\f\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u0017\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0012\t\u0000\u00ae\u00af\u00050\u0000\u0000\u00af\u0019"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u001c\u000e\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0003\u001e\u000f\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0012\t\u0000\u00bd\u00be\u0005"+
		"0\u0000\u0000\u00be\u00bf\u00052\u0000\u0000\u00bf\u001d\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c9\u0003\"\u0011\u0000\u00c1\u00c9\u0003*\u0015\u0000"+
		"\u00c2\u00c9\u0003,\u0016\u0000\u00c3\u00c9\u00034\u001a\u0000\u00c4\u00c9"+
		"\u00038\u001c\u0000\u00c5\u00c9\u0003.\u0017\u0000\u00c6\u00c9\u00036"+
		"\u001b\u0000\u00c7\u00c9\u0003 \u0010\u0000\u00c8\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u001f\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cc\u0003&\u0013\u0000\u00cb\u00cd\u00052\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"!\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003$\u0012\u0000\u00cf\u00d1\u0005"+
		"2\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1#\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003(\u0014\u0000"+
		"\u00d3\u00d4\u0005\u000e\u0000\u0000\u00d4\u00d5\u0003:\u001d\u0000\u00d5"+
		"%\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003:\u001d\u0000\u00d7\u00d8\u0007"+
		"\u0000\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000\u00d9\u00e4\u00050"+
		"\u0000\u0000\u00da\u00db\u0003:\u001d\u0000\u00db\u00dc\u0005\u0011\u0000"+
		"\u0000\u00dc\u00dd\u00050\u0000\u0000\u00dd\u00e4\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003:\u001d\u0000\u00df\u00e0\u0005\b\u0000\u0000\u00e0"+
		"\u00e1\u0003:\u001d\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e3\u00d9\u0001\u0000\u0000\u0000\u00e3\u00da"+
		"\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e4)\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u0012\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0007\u0000\u0000\u00e7\u00e8\u0003:\u001d\u0000\u00e8\u00e9\u0005\n"+
		"\u0000\u0000\u00e9\u00ed\u0005\u0003\u0000\u0000\u00ea\u00ec\u0003\u001e"+
		"\u000f\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00fa\u0005\u0004\u0000\u0000\u00f1\u00f2\u0005\u0013"+
		"\u0000\u0000\u00f2\u00f6\u0005\u0003\u0000\u0000\u00f3\u00f5\u0003\u001e"+
		"\u000f\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0005\u0004\u0000\u0000\u00fa\u00f1\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb+\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0014\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000"+
		"\u0000\u00fe\u00ff\u0003:\u001d\u0000\u00ff\u0100\u0005\n\u0000\u0000"+
		"\u0100\u0104\u0005\u0003\u0000\u0000\u0101\u0103\u0003\u001e\u000f\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005\u0004\u0000\u0000\u0108-\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u0015\u0000\u0000\u010a\u010c\u0005\u0007\u0000\u0000\u010b"+
		"\u010d\u00030\u0018\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0112"+
		"\u00052\u0000\u0000\u010f\u0111\u0003:\u001d\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u00052\u0000"+
		"\u0000\u0116\u0118\u00032\u0019\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\n\u0000\u0000\u011a\u011e\u0005\u0003\u0000\u0000\u011b"+
		"\u011d\u0003\u001e\u000f\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0004\u0000\u0000\u0122"+
		"/\u0001\u0000\u0000\u0000\u0123\u0128\u0003\"\u0011\u0000\u0124\u0125"+
		"\u0005\r\u0000\u0000\u0125\u0127\u0003\"\u0011\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u01291\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u0130\u0003 \u0010"+
		"\u0000\u012c\u012d\u0005\r\u0000\u0000\u012d\u012f\u0003 \u0010\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u01313\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0003<\u001e\u0000\u0134\u0135\u00052\u0000\u0000\u01355\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u0016\u0000\u0000\u0137\u013b\u0005"+
		"\u0003\u0000\u0000\u0138\u013a\u0003\u001e\u000f\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005"+
		"\u0004\u0000\u0000\u013f\u0140\u0005\u0014\u0000\u0000\u0140\u0141\u0005"+
		"\u0007\u0000\u0000\u0141\u0142\u0003:\u001d\u0000\u0142\u0143\u0005\n"+
		"\u0000\u0000\u0143\u0144\u00052\u0000\u0000\u01447\u0001\u0000\u0000\u0000"+
		"\u0145\u0147\u0005\u0017\u0000\u0000\u0146\u0148\u0003:\u001d\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u00052\u0000\u0000\u014a9\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0006\u001d\uffff\uffff\u0000\u014c\u014d"+
		"\u00051\u0000\u0000\u014d\u016e\u0004\u001d\u0002\u0001\u014e\u016e\u0005"+
		"\u0018\u0000\u0000\u014f\u016e\u0005\u0019\u0000\u0000\u0150\u016e\u0005"+
		"\u001a\u0000\u0000\u0151\u0152\u0005\u0007\u0000\u0000\u0152\u0153\u0003"+
		":\u001d\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u016e\u0001\u0000"+
		"\u0000\u0000\u0155\u016e\u0003<\u001e\u0000\u0156\u016e\u00050\u0000\u0000"+
		"\u0157\u0158\u0007\u0001\u0000\u0000\u0158\u016e\u0003:\u001d\u000f\u0159"+
		"\u015a\u0007\u0002\u0000\u0000\u015a\u016e\u0003:\u001d\u000e\u015b\u015c"+
		"\u0005-\u0000\u0000\u015c\u015d\u00050\u0000\u0000\u015d\u015e\u0005\u0007"+
		"\u0000\u0000\u015e\u016e\u0005\n\u0000\u0000\u015f\u0160\u0005-\u0000"+
		"\u0000\u0160\u0161\u0003\u0012\t\u0000\u0161\u0163\u0005\b\u0000\u0000"+
		"\u0162\u0164\u0003:\u001d\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0005\t\u0000\u0000\u0166\u016e\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0005-\u0000\u0000\u0168\u0169\u0003\u0012\t\u0000\u0169\u016a\u0005"+
		"\b\u0000\u0000\u016a\u016b\u0005\t\u0000\u0000\u016b\u016c\u0003>\u001f"+
		"\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u014b\u0001\u0000\u0000"+
		"\u0000\u016d\u014e\u0001\u0000\u0000\u0000\u016d\u014f\u0001\u0000\u0000"+
		"\u0000\u016d\u0150\u0001\u0000\u0000\u0000\u016d\u0151\u0001\u0000\u0000"+
		"\u0000\u016d\u0155\u0001\u0000\u0000\u0000\u016d\u0156\u0001\u0000\u0000"+
		"\u0000\u016d\u0157\u0001\u0000\u0000\u0000\u016d\u0159\u0001\u0000\u0000"+
		"\u0000\u016d\u015b\u0001\u0000\u0000\u0000\u016d\u015f\u0001\u0000\u0000"+
		"\u0000\u016d\u0167\u0001\u0000\u0000\u0000\u016e\u0194\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\n\r\u0000\u0000\u0170\u0171\u0007\u0003\u0000\u0000"+
		"\u0171\u0193\u0003:\u001d\u000e\u0172\u0173\n\f\u0000\u0000\u0173\u0174"+
		"\u0007\u0001\u0000\u0000\u0174\u0193\u0003:\u001d\r\u0175\u0176\n\u000b"+
		"\u0000\u0000\u0176\u0177\u0007\u0004\u0000\u0000\u0177\u0193\u0003:\u001d"+
		"\f\u0178\u0179\n\n\u0000\u0000\u0179\u017a\u0007\u0005\u0000\u0000\u017a"+
		"\u0193\u0003:\u001d\u000b\u017b\u017c\n\t\u0000\u0000\u017c\u017d\u0005"+
		"(\u0000\u0000\u017d\u0193\u0003:\u001d\n\u017e\u017f\n\b\u0000\u0000\u017f"+
		"\u0180\u0005)\u0000\u0000\u0180\u0193\u0003:\u001d\t\u0181\u0182\n\u0007"+
		"\u0000\u0000\u0182\u0183\u0007\u0006\u0000\u0000\u0183\u0193\u0003:\u001d"+
		"\b\u0184\u0185\n\u0001\u0000\u0000\u0185\u0186\u0005.\u0000\u0000\u0186"+
		"\u0187\u0003:\u001d\u0000\u0187\u0188\u0005/\u0000\u0000\u0188\u0189\u0003"+
		":\u001d\u0002\u0189\u0193\u0001\u0000\u0000\u0000\u018a\u018b\n\u0003"+
		"\u0000\u0000\u018b\u018c\u0005\b\u0000\u0000\u018c\u018d\u0003:\u001d"+
		"\u0000\u018d\u018e\u0005\t\u0000\u0000\u018e\u0193\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\n\u0002\u0000\u0000\u0190\u0191\u0005\u0011\u0000\u0000\u0191"+
		"\u0193\u00050\u0000\u0000\u0192\u016f\u0001\u0000\u0000\u0000\u0192\u0172"+
		"\u0001\u0000\u0000\u0000\u0192\u0175\u0001\u0000\u0000\u0000\u0192\u0178"+
		"\u0001\u0000\u0000\u0000\u0192\u017b\u0001\u0000\u0000\u0000\u0192\u017e"+
		"\u0001\u0000\u0000\u0000\u0192\u0181\u0001\u0000\u0000\u0000\u0192\u0184"+
		"\u0001\u0000\u0000\u0000\u0192\u018a\u0001\u0000\u0000\u0000\u0192\u018f"+
		"\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195;\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0005"+
		"0\u0000\u0000\u0198\u019a\u0005\u0011\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u00050\u0000\u0000\u019c\u019e\u0005\u0007\u0000"+
		"\u0000\u019d\u019f\u0003@ \u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005\n\u0000\u0000\u01a1=\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0003\u0000\u0000\u01a3\u01a8\u0003:\u001d\u0000\u01a4\u01a5\u0005"+
		"\r\u0000\u0000\u01a5\u01a7\u0003:\u001d\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0004"+
		"\u0000\u0000\u01ac?\u0001\u0000\u0000\u0000\u01ad\u01b2\u0003:\u001d\u0000"+
		"\u01ae\u01af\u0005\r\u0000\u0000\u01af\u01b1\u0003:\u001d\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"A\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000&ELV[fr\u008e"+
		"\u0097\u009b\u009f\u00a3\u00aa\u00b3\u00b9\u00c8\u00cc\u00d0\u00e3\u00ed"+
		"\u00f6\u00fa\u0104\u010c\u0112\u0117\u011e\u0128\u0130\u013b\u0147\u0163"+
		"\u016d\u0192\u0194\u0199\u019e\u01a8\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}