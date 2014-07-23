/* This file was generated by SableCC (http://www.sablecc.org/). */

package configuration.node;

import java.util.*;
import configuration.analysis.*;

@SuppressWarnings("nls")
public final class ATypeDef extends PDef
{
    private TId _i_;
    private final LinkedList<PFieldDef> _f_ = new LinkedList<PFieldDef>();

    public ATypeDef()
    {
        // Constructor
    }

    public ATypeDef(
        @SuppressWarnings("hiding") TId _i_,
        @SuppressWarnings("hiding") List<?> _f_)
    {
        // Constructor
        setI(_i_);

        setF(_f_);

    }

    @Override
    public Object clone()
    {
        return new ATypeDef(
            cloneNode(this._i_),
            cloneList(this._f_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeDef(this);
    }

    public TId getI()
    {
        return this._i_;
    }

    public void setI(TId node)
    {
        if(this._i_ != null)
        {
            this._i_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._i_ = node;
    }

    public LinkedList<PFieldDef> getF()
    {
        return this._f_;
    }

    public void setF(List<?> list)
    {
        for(PFieldDef e : this._f_)
        {
            e.parent(null);
        }
        this._f_.clear();

        for(Object obj_e : list)
        {
            PFieldDef e = (PFieldDef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._f_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._i_)
            + toString(this._f_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._i_ == child)
        {
            this._i_ = null;
            return;
        }

        if(this._f_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._i_ == oldChild)
        {
            setI((TId) newChild);
            return;
        }

        for(ListIterator<PFieldDef> i = this._f_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFieldDef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
