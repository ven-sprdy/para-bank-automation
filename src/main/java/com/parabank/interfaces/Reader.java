package com.parabank.interfaces;

import java.util.Collection;

public interface Reader<T> {
    Collection<T> read();
}
