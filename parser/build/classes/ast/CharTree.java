/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;
/**
 *
 * @author qihongkuang
 */
public class CharTree extends AST{
    
    private Symbol symbol;
    
    public CharTree(Token tok){
        this.symbol = tok.getSymbol();
    }

    @Override
    public Object accept(ASTVisitor v) {
        return v.visitCharTree(this);
    }
    
    public Symbol getSymbol(){
        return symbol;
    }
        
}
