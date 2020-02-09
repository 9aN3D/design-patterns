package com.kovalchv.model;

import com.kovalchv.interfaces.SocketAdapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(socket.getVolt(), 40);
    }

    @Override
    public Volt get1Volt() {
        return convertVolt(socket.getVolt(), 120);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

}
