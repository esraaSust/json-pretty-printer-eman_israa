package src.fmt;

// TODO: Make a use of src.parse.JSONLexer to tokenize the input text
// then colorize each token with the approporiate color
import src.parse.JSONLexer;

import src.parse.JSONBaseVisitor;
import src.parse.JSONParser;
import org.antlr.v4.* ;
import org.antlr.v4.runtime.*;
import java.util.*;
import java.awt.Color ;
import javax.swing.text.StyleContext;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument ;
import java.awt.Color ;
// IMPORTANT NOTE:
//
// You can use the following code to higligh specific word in the document:
//
//      doc.setCharacterAttributes(start,len, style, false);
//
//      Where:
//          doc: is variable of class Document
//          start: index from which we should start coloring
//          len: how many characters we want to apply this style to ?
//          style: our style, i.e. color, font, font size ... etc
//              we can create style like this:
//
//              StyleContext context = new StyleContext();
//              Style mystyle = context.addStyle("mystyle", null);
//              StyleConstants.setForeground(mystyle, Color.red);
//

public class Highlighter{}

