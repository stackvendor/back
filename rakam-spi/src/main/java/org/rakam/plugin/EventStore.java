package org.rakam.plugin;

import org.rakam.collection.Event;

import java.util.List;


public interface EventStore {
    void store(Event event);

    default void storeBatch(List<Event> events) {
        events.forEach(this::store);
    }
}
