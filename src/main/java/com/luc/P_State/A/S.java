package  com.luc.P_State.A;

import lombok.AllArgsConstructor;

enum NetworkState {
    NetworkState_Open,
    NetworkState_Close,
    NetworkState_Connect,
}

@AllArgsConstructor
public class S {
    private NetworkState state;

    /*
     * 对象的状态发生改变，行为也会发生变化
     **/
    public void operation1() {
        if (state == NetworkState.NetworkState_Open) {
            // ......
            state = NetworkState.NetworkState_Close;
        }
        else if(state == NetworkState.NetworkState_Close) {
            // ######
            state = NetworkState.NetworkState_Connect;
        }
        else if (state == NetworkState.NetworkState_Connect) {
            // ******
            state = NetworkState.NetworkState_Open;
        }
    }

    /*
     * 以后会不会有其他状态
     * 如果添加了新的状态，那之前的if-else代码要如何更改
     * else if(...)
     *   - 违反开闭原则
     * */
    public void operation2() {
        if (state == NetworkState.NetworkState_Open) {
            // ^^^^^^
            state = NetworkState.NetworkState_Connect;
        }
        else if(state == NetworkState.NetworkState_Close) {
            // ======
            state = NetworkState.NetworkState_Open;
        }
        else if (state == NetworkState.NetworkState_Connect) {
            // $$$$$$
            state = NetworkState.NetworkState_Close;
        }
    }
}
