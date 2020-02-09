package com.kovalchv.interfaces;

import com.kovalchv.model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();

}
