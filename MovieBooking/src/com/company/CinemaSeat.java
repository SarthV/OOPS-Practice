package com.company;

public class CinemaSeat {
    char row;
    Integer column;
    Boolean isEmpty;

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public CinemaSeat(){
        this.isEmpty = true;
        this.row = '0';
        this.column = -1;
    }
}
