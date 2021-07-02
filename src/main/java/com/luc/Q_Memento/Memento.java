package com.luc.Q_Memento;

import lombok.AllArgsConstructor;

class Originator {
    String state;
    // ...
    // .

    public Originator() {}
    public Memento createMemento() {
        return new Memento(state);
    }
    public void setMemento(Memento m) {
        state = m.getState();
    }
}

@AllArgsConstructor
public class Memento {
    String state;
    // .

    public String getState() {
        return state;
    }
    public void setState(String s) {
        this.state = s;
    }

    public static void main(String[] args) {
        Originator originator = new Originator();

        // 存储到备忘录
        Memento mem = originator.createMemento();

        // ...
        // ...改变originator
        // ...

        // 从备忘录恢复
        originator.setMemento(mem);
    }
}
