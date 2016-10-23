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

public class Highlighter{
  	public static CommonTokenStream tok ;
			public  String text ;
			String [] tok;
			public StyledDocument doc;
			int   i;
			public  Highlighter(String text , StyledDocument doc)
				{
					this.text=text;
					this.doc=doc;
				}
			public void  do_Highlighter(){

					ANTLRInputStream strin =new ANTLRInputStream(text);

						JSONLexer lex = new JSONLexer(strin);
						// create object of CommonTokenStream to toknize string and pass object of JSONLexer created above to it .....>>
						CommonTokenStream toke = new CommonTokenStream(lex);
						toke.fill();
						// call method getToken to return list of token .....>>
						List  tokens = toke.getTokens();
						//create object of JTextPane to call getStyledDocument method of class StyledDocument ....>>
						JTextPane tex = new JTextPane();
						// assing the StyledDocument that return from  getStyledDocument to doc ......>>
						doc = tex.getStyledDocument ();
								StyleContext context1 = new StyleContext();
					StyleContext context2 = new StyleContext();
					StyleContext context3 = new StyleContext();
					Style style1 = context1.addStyle("style1", null);
					Style style2 = context2.addStyle("style2", null);
					Style style3 = context3.addStyle("style3", null);
					StyleConstants.setForeground(style1, Color.RED);
				    StyleConstants.setForeground(style2, Color.BLUE);
					StyleConstants.setForeground(style3, Color.YELLOW);


			for(int i=0;i<= toke.size();i++)
			{
				// create object of class string ......>>
				String str = new String ();
				// assing token number i to string  && return token by call get(i).getText() method  .....>>
				str = toke.get(i).getText();
				System.out.println("our token is : "+str);
				// call getStartIndex to return start index of token number i and assing it to start virable ...>>
				int start = toke.get(i).getStartIndex();
				//call getstop Index to return stop index of token number i and assing it to stop  virable ....>>
				int stop = toke.get(i).getStopIndex();
				// calculate the length of token number i ......>>
				int leng = ( stop - start);
				// test the token if it match on of these string
				if ( str.equals("true") || str.equals("false") || str.equals("null") ||  str.equals(";") ||  str.equals(",") ||  str.equals(":") ||  str.equals("new"))
					{
						// clorize the token with blue colore...>
						doc.setCharacterAttributes(start,leng,mystyle2, true);
					}
				// test the token if it match on of these string
				if ( str.equals("{") || str.equals("}")|| str.equals("(") || str.equals(")") || str.equals("[") || str.equals("]"))
					{
						// clorize the token with red  colore...>
						doc.setCharacterAttributes(start,leng, mystyle1, true);
					}
				// test the token if it match on of these string
				if ( str.equals("0")||  str.equals("1")||  str.equals("2") ||  str.equals("3") ||  str.equals("4") ||  str.equals("5") ||  str.equals("6") ||  str.equals("7") ||  str.equals("8") ||  str.equals("9"))
					{
						// clorize the token with green  colore...>
						doc.setCharacterAttributes(start,leng,mystyle3, true);
					}
				else
					{
						// if token dos not match any of string above clorize the token with black colore...>
						doc.setCharacterAttributes(start,leng,tex.getStyle("black"), true);
					}
					// call method consume to seek to next token ....>>
					toke.consume();



			}


{




					try
 					{ 					this.doc.setCharacterAttributes(tokenIndex[i],lines[i].length() , redStyle, false);
				     }
 					catch (Exception e)
 					{
				}
 					try
 					{
 						this.doc.setCharacterAttributes(tokenIndex[i],lines[i].length() , blueStyle, false);
 					}
 					catch (Exception e)
 					{
 					}
 					try
 					{

 				    	this.doc.setCharacterAttributes(tokenIndex[i],lines[i].length() , greenStyle, false);
 					}
 					catch (Exception e)
 					{
 					}
