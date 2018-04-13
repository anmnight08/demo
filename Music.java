package music.play.cool.bean;

public class Music {

    private String name;//歌手名字
    private int imageId;//最左边排名金银铜的小图片
    private String desc;//这个没用
    private int figureId;//头像图片ID
    private String number;//条目最右边的数字

    public Music(String name, int imageId, int figureId, String desc, String number) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
        this.figureId = figureId;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFigureId() {
        return figureId;
    }

    public void setFigureId(int figureId) {
        this.figureId = figureId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getDesc() {
        return desc;
    }
}

