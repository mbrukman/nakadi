package org.zalando.nakadi.exceptions.runtime;

public class InvalidCursorOperation extends MyNakadiRuntimeException1 {
    private final Reason reason;

    public enum Reason {
        TIMELINE_NOT_FOUND,
        PARTITION_NOT_FOUND,
        CURSORS_WITH_DIFFERENT_PARTITION
    }

    public InvalidCursorOperation(final Reason reason) {
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }
}
