package com.kovalchv;

import com.kovalchv.interfaces.SocketAdapter;
import com.kovalchv.model.SocketAdapterImpl;
import com.kovalchv.model.SocketObjectAdapterImpl;
import com.kovalchv.model.Volt;

public class Main {

    public static void main(String... args) {
        testingObjectAdapter();
        System.out.println();
        testingClassAdapter();
    }

    private static void testingClassAdapter() {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        Volt v1 = getVolt(socketAdapter, 1);

        System.out.println(" V3 volts is using Class Adapter " + v3.getVolts());
        System.out.println(" V12 volts is using Class Adapter " + v12.getVolts());
        System.out.println(" V120 volts is using Class Adapter " + v120.getVolts());
        System.out.println(" V1 volt is using Class Adapter " + v1.getVolts());
    }

    private static void testingObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        Volt v1 = getVolt(socketAdapter, 1);

        System.out.println(" V3 volts is using Object Adapter " + v3.getVolts());
        System.out.println(" V12 volts is using Object Adapter " + v12.getVolts());
        System.out.println(" V120 volts is using Object Adapter " + v120.getVolts());
        System.out.println(" V1 volt is using Object Adapter " + v1.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get1Volt();
        }
    }


}
