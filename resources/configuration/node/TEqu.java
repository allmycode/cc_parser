/* This file was generated by SableCC (http://www.sablecc.org/). */

package configuration.node;

import configuration.analysis.*;

@SuppressWarnings("nls")
public final class TEqu extends Token
{
    public TEqu()
    {
        super.setText("==");
    }

    public TEqu(int line, int pos)
    {
        super.setText("==");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEqu(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEqu(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEqu text.");
    }
}