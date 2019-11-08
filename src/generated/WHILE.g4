grammar WHILE;

@header {
import java.util.HashMap;
import java.util.Map;
}

@parser::members {
  Map<String, Integer> map = new HashMap<>();
}

program
:
  aexpr
  { int result = $aexpr.sv; System.out.println(result); }
;

aexpr returns [int sv]
  : aexpr2
  { $sv = $aexpr2.sv; }
  | a1=aexpr '+' a2=aexpr
  { $sv = $a1.sv + $a2.sv; }
  | a1=aexpr '-' a2=aexpr
  { $sv = $a1.sv - $a2.sv; }
;

aexpr2 returns [int sv]
  : N
  { String n = $N.getText(); $sv = Integer.parseInt(n); }
  | IDENT
  { String id = $IDENT.getText(); $sv = map.get(id); }
  | a1=aexpr2 '*' a2=aexpr2
  { $sv = $a1.sv * $a2.sv; }
  | a1=aexpr2 '/' a2=aexpr2
  { $sv = $a1.sv / $a2.sv; }
;

N
:
  [1-9][0-9]*
;

IDENT
:
  [a-z][a-z0-9]*
;

WS :
(
    ' '
    | '\t'
    | '\r'
    | '\n'
)+
-> channel(HIDDEN)
;