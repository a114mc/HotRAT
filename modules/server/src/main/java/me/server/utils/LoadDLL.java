package me.server.utils;

import com.sun.jna.*;

public interface LoadDLL extends Library {
    LoadDLL instance = (LoadDLL) Native.loadLibrary("me/server/dll/CppUtils.dll", LoadDLL.class);
    WString $Get$Key();
}