
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class MiniTriangleParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return mySym.class;
}

  /** Default constructor. */
  public MiniTriangleParser() {super();}

  /** Constructor which sets the default scanner. */
  public MiniTriangleParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MiniTriangleParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\004\003\000\002\002\004\000\002\005" +
    "\005\000\002\005\005\000\002\002\005\000\002\002\003" +
    "\000\002\006\005\000\002\006\003\000\002\003\003\000" +
    "\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\004\005\006\006\001\002\000\004\002" +
    "\024\001\002\000\006\004\005\006\006\001\002\000\004" +
    "\010\010\001\002\000\004\002\001\001\002\000\004\013" +
    "\011\001\002\000\014\002\ufffa\005\ufffa\007\ufffa\011\ufffa" +
    "\012\ufffa\001\002\000\014\002\ufffe\005\ufffe\007\ufffe\011" +
    "\013\012\014\001\002\000\004\013\ufff9\001\002\000\004" +
    "\013\ufff8\001\002\000\004\013\011\001\002\000\014\002" +
    "\ufffb\005\ufffb\007\ufffb\011\013\012\014\001\002\000\004" +
    "\005\023\001\002\000\006\005\ufffc\007\021\001\002\000" +
    "\006\004\005\006\006\001\002\000\004\005\ufffd\001\002" +
    "\000\010\002\uffff\005\uffff\007\uffff\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\004\003\005\006\001\001\000\002\001" +
    "\001\000\006\002\016\005\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\011\001\001\000\002\001" +
    "\001\000\004\003\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\015\001\001\000\004\003\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\002\021" +
    "\005\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MiniTriangleParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MiniTriangleParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MiniTriangleParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$MiniTriangleParser$actions {
  private final MiniTriangleParser parser;

  /** Constructor */
  CUP$MiniTriangleParser$actions(MiniTriangleParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$MiniTriangleParser$do_action_part00000000(
    int                        CUP$MiniTriangleParser$act_num,
    java_cup.runtime.lr_parser CUP$MiniTriangleParser$parser,
    java.util.Stack            CUP$MiniTriangleParser$stack,
    int                        CUP$MiniTriangleParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MiniTriangleParser$result;

      /* select the action based on the action number */
      switch (CUP$MiniTriangleParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= command 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("program",2, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)).value;
		RESULT = start_val;
              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-1)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MiniTriangleParser$parser.done_parsing();
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // command ::= BEGIN commands END 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",3, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // command ::= IDENTIFIER ASSIGN expr 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("command",3, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // commands ::= command SEMI commands 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("commands",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // commands ::= command 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("commands",0, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr binOp expr 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.elementAt(CUP$MiniTriangleParser$top-2)), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= INTEGER 
            {
              Integer RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // binOp ::= PLUS 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // binOp ::= TIMES 
            {
              Object RESULT =null;

              CUP$MiniTriangleParser$result = parser.getSymbolFactory().newSymbol("binOp",1, ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MiniTriangleParser$stack.peek()), RESULT);
            }
          return CUP$MiniTriangleParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$MiniTriangleParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$MiniTriangleParser$do_action(
    int                        CUP$MiniTriangleParser$act_num,
    java_cup.runtime.lr_parser CUP$MiniTriangleParser$parser,
    java.util.Stack            CUP$MiniTriangleParser$stack,
    int                        CUP$MiniTriangleParser$top)
    throws java.lang.Exception
    {
              return CUP$MiniTriangleParser$do_action_part00000000(
                               CUP$MiniTriangleParser$act_num,
                               CUP$MiniTriangleParser$parser,
                               CUP$MiniTriangleParser$stack,
                               CUP$MiniTriangleParser$top);
    }
}

}