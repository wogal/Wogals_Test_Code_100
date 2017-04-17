package Call_Back_Test_Code_Events;

/**
 * Created by wogal on 4/17/2017.
 */

public class Listener {
    private String type;
    private IEventHandler handler;

    public Listener (String _type, IEventHandler _handler) {
        this.type = _type;
        this.handler = _handler;
    }

    public String getType () {
        return this.type;
    }

    public IEventHandler getHandler () {
        return this.handler;
    }


}
