package Call_Back_Test_Code_Events;

/**
 * Created by wogal on 4/17/2017.
 */

public interface IEventDispatcher {

    public void addEventListener(String _type,IEventHandler _cbInterface);
    public void removeEventListener(String _type);
    public void dispatchEvent(String _type);
    public Boolean removeAllListeners();


}
