package music;


public class ClassicMusic implements Music {
    @Override
    public String play() {
        System.out.println(" I play " + ClassicMusic.class.getName());
        return "";
    }
}
