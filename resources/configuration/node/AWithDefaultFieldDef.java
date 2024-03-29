/* This file was generated by SableCC (http://www.sablecc.org/). */

package configuration.node;

import configuration.analysis.*;

@SuppressWarnings("nls")
public final class AWithDefaultFieldDef extends PFieldDef
{
    private TId _name_;
    private TId _type_;
    private PExp _default_;

    public AWithDefaultFieldDef()
    {
        // Constructor
    }

    public AWithDefaultFieldDef(
        @SuppressWarnings("hiding") TId _name_,
        @SuppressWarnings("hiding") TId _type_,
        @SuppressWarnings("hiding") PExp _default_)
    {
        // Constructor
        setName(_name_);

        setType(_type_);

        setDefault(_default_);

    }

    @Override
    public Object clone()
    {
        return new AWithDefaultFieldDef(
            cloneNode(this._name_),
            cloneNode(this._type_),
            cloneNode(this._default_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWithDefaultFieldDef(this);
    }

    public TId getName()
    {
        return this._name_;
    }

    public void setName(TId node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TId getType()
    {
        return this._type_;
    }

    public void setType(TId node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public PExp getDefault()
    {
        return this._default_;
    }

    public void setDefault(PExp node)
    {
        if(this._default_ != null)
        {
            this._default_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._default_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._type_)
            + toString(this._default_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._default_ == child)
        {
            this._default_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((TId) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((TId) newChild);
            return;
        }

        if(this._default_ == oldChild)
        {
            setDefault((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
