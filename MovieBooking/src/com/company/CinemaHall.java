package com.company;

public class CinemaHall {
    Integer id;
    String currentMovie;
    int rows;
    int columns;
    CinemaSeat[][] layout;

    public CinemaSeat[][] getLayout() {
        return layout;
    }


    public Integer getId() {
        return id;
    }

    public CinemaHall(int id, int rows, int columns){
        this.id = id;
        this.columns = columns;
        this.rows = rows;
        this.layout = new CinemaSeat[rows][columns];
        for(int i = 0  ; i  < rows; i++){
            for(int j = 0 ;  j < columns; j++){
                this.layout[i][j] = new CinemaSeat();
                char temp = (char) ('A' + i);
                this.layout[i][j].setRow(temp);
                this.layout[i][j].setColumn(j);
            }
        }
    }

}
