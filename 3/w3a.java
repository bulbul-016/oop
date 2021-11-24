class Color{
    int colorId;
    String name;
    static int cnt=0;

    Color(){
        cnt+=1;
        colorId=cnt;

    }

    static void showNumOfColors(){
        System.out.println(cnt);
    }
}

public class w3a {
    public static void main(String[] args) {
        Color c1=new Color();
        Color c2=new Color();
        Color c3=new Color();
        Color c4=new Color();
        Color c5=new Color();
        Color c6=new Color();

        Color.showNumOfColors();
    }
    
}
