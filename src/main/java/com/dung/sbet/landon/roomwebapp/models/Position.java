package com.dung.sbet.landon.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    @Override
    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case SECURITY:
                return "Security";
            case FRONT_DESK:
                return "Front Desk";
            case HOUSEKEEPING:
                return "Housekeeping";
        }
        return "";
    }
}
