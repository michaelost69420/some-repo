package ObjectsAndClassesLab.Songs;

public class Song {

    public String typeList;
    public String name;
    public String time;

    public Song(String typeList, String name, String time) {
        this.time = time;
        this.name = name;
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public String getTypeList() {
        return typeList;
    }
}
