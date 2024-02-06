//AbstractFactoryWord
abstract class AbstractFactoryGUI 
{

    public abstract AbstractPanel CreatePanel();
    public abstract AbstractButton CreateButton();
    public abstract AbstractText CreateText();
}

//ConcreteFactoryWord90
class ConcreteFactoryWord90 : AbstractFactoryGUI
{
    public override AbstractPanel CreatePanel()
    {
        return new Word90Panel();
    }

    public override AbstractButton CreateButton()
    {
        return new Word90Button();
    }

    public override AbstractText CreateText()
    {
        return new Word90Text();
    }

}

//ConcreteFactoryWord00
class ConcreteFactoryWord00 : AbstractFactoryGUI
{
    public override AbstractPanel CreatePanel()
    {
        return new Word00Panel();
    }

    public override AbstractButton CreateButton()
    {
        return new Word00Button();
    }

    public override AbstractText CreateText()
    {
        return new Word00Text();
    }
}

//ConcreteFactoryWord10
class ConcreteFactoryWord10 : AbstractFactoryGUI
{
    public override AbstractPanel CreatePanel()
    {
        return new Word10Panel();
    }

    public override AbstractButton CreateButton()
    {
        return new Word10Button();
    }

    public override AbstractText CreateText()
    {
        return new Word10Text();
    }
}

//ConcreteFactoryWord24
class ConcreteFactoryWord24 : AbstractFactoryGUI
{
    public override AbstractPanel CreatePanel()
    {
        return new Word24Panel();
    }

    public override AbstractButton CreateButton()
    {
        return new Word24Button();
    }

    public override AbstractText CreateText()
    {
        return new Word24Text();
    }
}

//AbstractPanel
abstract class AbstractPanel 
{

    
}

//ProdcutWord90
class word90 : AbstractPanel
{

}

//ProductWord00
class word00 : AbstractPanel
{

}

//ProductWord10
class word00 : AbstractPanel
{

}

//ProcuctWord24
class word24 : AbstractPanel
{

}

//AbstractButton
abstract class AbstractButton 
{

    
}

//ProdcutWord90
class word90 : AbstractButton
{

}

//ProductWord00
class word00 : AbstractButton
{

}

//ProductWord10
class word00 : AbstractButton
{

}

//ProcuctWord24
class word24 : AbstractButton
{

}

//AbstractText
abstract class AbstractText
{

    
}

//ProdcutWord90
class word90 : AbstractText
{

}

//ProductWord00
class word00 : AbstractText
{

}

//ProductWord10
class word00 : AbstractText
{

}

//ProcuctWord24
class word24 : AbstractText
{

}

//Client
class Client
{
    private AbstractPanel AbstractPanel;
    private AbstractButton AbstractButton;
    private AbstractText AbstractText;

    //constructor
    public Client(AbstractFactoryGUI)
    {
        AbstractPanel = factory.CreatePanel();
        AbstractButton = factory.CreateButton();
        AbstractText = factory.CreateText();
    }

    public void Run()
    {

    }
}
