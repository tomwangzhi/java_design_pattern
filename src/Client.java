/**
 * Created by engli on 2016/11/23.
 */
public class Client {
    public static void main(String [] args){
        ConcreteSubject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.attach(observer);
        subject.change("a new state");
    }
}
