package com.company.dataStructure;

public class Document {
    Integer id;
    String contents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Document(){
        this.id = -1;
        this.contents = "N/A";
    }

    public Document(String contents){
        this.contents  =contents;
    }


}
