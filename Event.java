package Call_Back_Test_Code_Events;

/**
 * Created by wogal on 4/17/2017.
 */

public class Event {
    protected String strType = "";

    public Event (String _type) {
        initProperties( _type );
    }

    protected void initProperties (String _type) {
        strType = _type;
    }

    public String getStrType () {
        return strType;
    }
}
