package ast;

import visitor.*;

/**
 *
 * @author qihongkuang
 */
public class FFTree extends AST {

    /**
     *
     */
    public FFTree() {
    }

    public Object accept(ASTVisitor v) {
        return v.visitBlockTree(this);
    }

}

