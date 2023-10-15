/* Generated By:JavaCC: Do not edit this line. CompilerConstants.java */
package com.example.compiler_testes;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CompilerConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IDENTIFICADOR = 5;
  /** RegularExpression Id. */
  int RESULT = 6;
  /** RegularExpression Id. */
  int AVALIATE = 7;
  /** RegularExpression Id. */
  int DO = 8;
  /** RegularExpression Id. */
  int THIS = 9;
  /** RegularExpression Id. */
  int BODY = 10;
  /** RegularExpression Id. */
  int DESCRIPTION = 11;
  /** RegularExpression Id. */
  int DECLARATION = 12;
  /** RegularExpression Id. */
  int TYPE = 13;
  /** RegularExpression Id. */
  int IS = 14;
  /** RegularExpression Id. */
  int CONSTANT = 15;
  /** RegularExpression Id. */
  int AND = 16;
  /** RegularExpression Id. */
  int VARIABLE = 17;
  /** RegularExpression Id. */
  int DESIGNATE = 18;
  /** RegularExpression Id. */
  int AS = 19;
  /** RegularExpression Id. */
  int READ = 20;
  /** RegularExpression Id. */
  int WRITE = 21;
  /** RegularExpression Id. */
  int ALL = 22;
  /** RegularExpression Id. */
  int REPEAT = 23;
  /** RegularExpression Id. */
  int INTEGER_DEF = 24;
  /** RegularExpression Id. */
  int REAL_DEF = 25;
  /** RegularExpression Id. */
  int LITERAL_DEF = 26;
  /** RegularExpression Id. */
  int LOGIC_DEF = 27;
  /** RegularExpression Id. */
  int INTEGER = 28;
  /** RegularExpression Id. */
  int REAL = 29;
  /** RegularExpression Id. */
  int TRUE = 30;
  /** RegularExpression Id. */
  int UNTRUE = 31;
  /** RegularExpression Id. */
  int LITERAL = 32;
  /** RegularExpression Id. */
  int PLUS = 33;
  /** RegularExpression Id. */
  int MINUS = 34;
  /** RegularExpression Id. */
  int MULTIPLY = 35;
  /** RegularExpression Id. */
  int DIVIDE = 36;
  /** RegularExpression Id. */
  int POWER = 37;
  /** RegularExpression Id. */
  int MODULO = 38;
  /** RegularExpression Id. */
  int DOUBLE_MODULO = 39;
  /** RegularExpression Id. */
  int LESS_THAN = 40;
  /** RegularExpression Id. */
  int LESS_THAN_EQUAL = 41;
  /** RegularExpression Id. */
  int GREATER_THAN_EQUAL = 42;
  /** RegularExpression Id. */
  int GREATER_THAN = 43;
  /** RegularExpression Id. */
  int EQUAL = 44;
  /** RegularExpression Id. */
  int NOT_EQUAL = 45;
  /** RegularExpression Id. */
  int AND_LOGIC = 46;
  /** RegularExpression Id. */
  int OR_LOGIC = 47;
  /** RegularExpression Id. */
  int NOT_LOGIC = 48;
  /** RegularExpression Id. */
  int HASH = 49;
  /** RegularExpression Id. */
  int DOLLAR = 50;
  /** RegularExpression Id. */
  int OPEN_PAREN = 51;
  /** RegularExpression Id. */
  int CLOSE_PAREN = 52;
  /** RegularExpression Id. */
  int COMMA = 53;
  /** RegularExpression Id. */
  int DOT = 54;
  /** RegularExpression Id. */
  int COLON = 55;
  /** RegularExpression Id. */
  int SEMICOLON = 56;
  /** RegularExpression Id. */
  int S_LESS_THAN = 57;
  /** RegularExpression Id. */
  int S_GREATER_THAN = 58;
  /** RegularExpression Id. */
  int QUESTION_MARK = 59;
  /** RegularExpression Id. */
  int AT_SIGN = 60;
  /** RegularExpression Id. */
  int OPEN_BRACKET = 61;
  /** RegularExpression Id. */
  int CLOSE_BRACKET = 62;
  /** RegularExpression Id. */
  int BACKTICK = 63;
  /** RegularExpression Id. */
  int OPEN_BRACE = 64;
  /** RegularExpression Id. */
  int CLOSE_BRACE = 65;
  /** RegularExpression Id. */
  int TILDE = 66;
  /** RegularExpression Id. */
  int EQUALS = 67;
  /** RegularExpression Id. */
  int COMENTARIOLINHA = 68;
  /** RegularExpression Id. */
  int COMENTARIOBLOCO = 69;
  /** RegularExpression Id. */
  int MAIUSCULA = 70;
  /** RegularExpression Id. */
  int MINUSCULA = 71;
  /** RegularExpression Id. */
  int DIGITO = 72;
  /** RegularExpression Id. */
  int LETRA = 73;
  /** RegularExpression Id. */
  int ASCII = 74;
  /** RegularExpression Id. */
  int ASCII_ASPAS = 75;
  /** RegularExpression Id. */
  int ASCII_APOSTROFO = 76;
  /** RegularExpression Id. */
  int DENTROSEMLINHA = 77;
  /** RegularExpression Id. */
  int SEM_ESTRELA = 78;
  /** RegularExpression Id. */
  int SEM_BARRA = 79;
  /** RegularExpression Id. */
  int ERROR_IDENTIFICADOR = 80;
  /** RegularExpression Id. */
  int ERROR_IDENTIFICADOR_START_DIGIT = 81;
  /** RegularExpression Id. */
  int ERROR_IDENTIFICADOR_MULTIPLE_UNDERSCORES = 82;
  /** RegularExpression Id. */
  int ERROR_IDENTIFICADOR_END_UNDERSCORE = 83;
  /** RegularExpression Id. */
  int ERROR_IDENTIFICADOR_START_LOWERCASE = 84;
  /** RegularExpression Id. */
  int ERROR_INTEGER = 85;
  /** RegularExpression Id. */
  int ERROR_REAL = 86;
  /** RegularExpression Id. */
  int ERROR_LITERAL_START = 87;
  /** RegularExpression Id. */
  int ERROR_LITERAL_END = 88;
  /** RegularExpression Id. */
  int ERROR_COMENTARIOLINHA = 89;
  /** RegularExpression Id. */
  int ERROR_COMENTARIOBLOCO_START = 90;
  /** RegularExpression Id. */
  int ERROR_COMENTARIOBLOCO_END = 91;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<IDENTIFICADOR>",
    "\"result\"",
    "\"avaliate\"",
    "\"do\"",
    "\"this\"",
    "\"body\"",
    "\"description\"",
    "\"declaration\"",
    "\"type\"",
    "\"is\"",
    "\"constant\"",
    "\"and\"",
    "\"variable\"",
    "\"designate\"",
    "\"as\"",
    "\"read\"",
    "\"write\"",
    "\"all\"",
    "\"repeat\"",
    "\"integer\"",
    "\"real\"",
    "\"literal\"",
    "\"logic\"",
    "<INTEGER>",
    "<REAL>",
    "\"true\"",
    "\"untrue\"",
    "<LITERAL>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"**\"",
    "\"%\"",
    "\"%%\"",
    "\"<<\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>\"",
    "\"==\"",
    "\"!=\"",
    "\"&\"",
    "\"|\"",
    "\"!\"",
    "\"#\"",
    "\"$\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\".\"",
    "\":\"",
    "\";\"",
    "\"<\"",
    "\">\"",
    "\"?\"",
    "\"@\"",
    "\"[\"",
    "\"]\"",
    "\"`\"",
    "\"{\"",
    "\"}\"",
    "\"~\"",
    "\"=\"",
    "<COMENTARIOLINHA>",
    "<COMENTARIOBLOCO>",
    "<MAIUSCULA>",
    "<MINUSCULA>",
    "<DIGITO>",
    "<LETRA>",
    "<ASCII>",
    "<ASCII_ASPAS>",
    "<ASCII_APOSTROFO>",
    "<DENTROSEMLINHA>",
    "<SEM_ESTRELA>",
    "<SEM_BARRA>",
    "<ERROR_IDENTIFICADOR>",
    "<ERROR_IDENTIFICADOR_START_DIGIT>",
    "<ERROR_IDENTIFICADOR_MULTIPLE_UNDERSCORES>",
    "<ERROR_IDENTIFICADOR_END_UNDERSCORE>",
    "<ERROR_IDENTIFICADOR_START_LOWERCASE>",
    "<ERROR_INTEGER>",
    "<ERROR_REAL>",
    "<ERROR_LITERAL_START>",
    "<ERROR_LITERAL_END>",
    "<ERROR_COMENTARIOLINHA>",
    "<ERROR_COMENTARIOBLOCO_START>",
    "<ERROR_COMENTARIOBLOCO_END>",
  };

}
