package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonMusic {

    @Autowired
    private ClassicMusic classicMusic;


    private String author;

    private Integer volume;

    /**
     * init метод
     */
    public void MyFirstMethod() {
//        System.out.println("Самый первый метод после инициализации конструктора");
    }


    /**
     * destroy метод
     */
    public void MyLastMethod() {
//        System.out.println("Самый последний метод перед заверешние приложения");
    }

    public CommonMusic(ClassicMusic classicMusic) {
//        System.out.println("работает конструктор");
        this.classicMusic = classicMusic;
//        System.out.println("конструктор завершил свою работу");
    }

    public String playCommonMusic() {
        System.out.println("playCommonMusic " + author + " " + this.classicMusic);
        return "";
    }

    public String showPropertiesValue() {
        System.out.println("showPropertiesValue " + author  + " " + volume);
        return "";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
