package cn.misection.cvac.codegen.bst.bdecl;

import cn.misection.cvac.codegen.bst.btype.ITargetType;

/**
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @ClassName CvaDeclaration
 * @Description TODO
 * @CreateTime 2021年02月14日 19:54:00
 */
public final class TargetDeclaration extends BaseDeclaration
{
    private String literal;

    private ITargetType type;

    public TargetDeclaration(String literal, ITargetType type)
    {
        this.literal = literal;
        this.type = type;
    }

    public String getLiteral()
    {
        return literal;
    }

    public ITargetType getType()
    {
        return type;
    }
}
