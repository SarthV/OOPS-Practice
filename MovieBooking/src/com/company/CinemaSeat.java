package com.company;

public class CinemaSeat {
    String row;
    Integer column;
    Boolean isEmpty = true;

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public CinemaSeat(){
        this.row = "-1";
        this.column = -1;
    }
}
