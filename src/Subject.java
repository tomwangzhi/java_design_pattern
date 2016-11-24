import java.util.ArrayList;
import java.util.List;

/**
 * Created by engli on 2016/11/23.
 */
//被观察者
public abstract class Subject {
    //用来保存注册观察者的对象
    private List<Observer> list=new ArrayList<Observer>();
    public void attach(Observer observer){
        this.list.add(observer);
        System.out.println("注册一个观察者");
    }
    //删除观察者对象
    public void detach(Observer observer){
        this.list.remove(observer);
    }
    //通知所有注册的观察者
    public void nodifyObservers(String newState){
        for(Observer observer:list){
            observer.update(newState);
        }
    }
}
