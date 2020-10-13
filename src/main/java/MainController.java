import music.CommonMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainController {


    public static void main(String[] args) {

        /**
         *
         *         PopMusic popMusic = new PopMusic();
         *         RockMusic rockMusic = new RockMusic();
         *         ClassicMusic classicMusic = new ClassicMusic();
         *      bean - объект java класса находящийся в контейнере Springa
         *
         *      Ctrl+D
         *
         * Она вся инициализуется в контейнере спринга
         * Пример InversionControl
         *
         *
         * ДЗ
         * 1.Распаоквать архив и запустить в своей среде
         * 2.Значения property из файла beans.xml вынести в отдельный файл properties.xml
         * 3.В файле beans.xml считать значения из файла properties.xml и проинициализовать ими объект с id="commonMusic"
         *
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        /**
         * из контейнера(коробки) Springa
         */
        CommonMusic commonMusic = context.getBean("commonMusic", CommonMusic.class);

        commonMusic.showPropertiesValue();

        context.close();


    }
}
