/**
 * Created by engli on 2016/11/23.
 */
public class ConcreteObserver implements Observer {
    private String observerState;  //观察者状态
    @Override
    public void update(String state) {    //更新观察者状态
       observerState=state;
        System.out.println("观察者状态为"+observerState);
    }
}
