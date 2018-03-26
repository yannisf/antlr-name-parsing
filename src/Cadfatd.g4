grammar Cadfatd;

line    : name (born|aka)* remark?;

name            : text;
remark          : text;
aka             : '(' AKA_KEYWORD text ')';
born            : '(' BORN_KEYWORD text ')';
text            : ALPHANUM+;

fragment DIGIT          : [0-9];
fragment CHAR           : [a-zA-Z-'];

AKA_KEYWORD         : AKA_VAR_1 | AKA_VAR_2 ;
AKA_VAR_1           : 'also known as ';
AKA_VAR_2           : 'known among others as ';

BORN_KEYWORD    : BORN_ON | DOB;
BORN_ON         : 'born on ';
DOB             : 'date of birth: ';

ALPHANUM       : (CHAR|DIGIT)+;
WS              : [ \t\r\n]+ -> skip;
