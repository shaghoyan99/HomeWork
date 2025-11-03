package work.company.models;

import work.company.exception.PositionNotFoundException;

public enum PositionLevel {

    JUNIOR("1"),
    MIDDLE("2"),
    SENIOR("3"),
    LEAD("4");

    private final String code;

    PositionLevel(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static PositionLevel fromCode(String code) throws PositionNotFoundException {
        for (PositionLevel level : values()) {
            if (level.code.equals(code)) {
                return level;
            }
        }
        throw new PositionNotFoundException("Invalid position level code: " + code);
    }
}
