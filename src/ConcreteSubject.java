/**
 * Created by engli on 2016/11/23.
 */
public class ConcreteSubject extends Subject {
    private String state;
    public String getState(){
        return state;
    }
    public void change(String newState){
        state=newState;
        System.out.println("状态改变为："+state);
        this.nodifyObservers(state);
    }
}
