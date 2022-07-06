package live.yangtao.lsp.client;

import live.yangtao.lsp.animal.Animal;
import live.yangtao.lsp.animal.Bird;
import live.yangtao.lsp.animal.Horse;
import org.junit.Test;

/**
 * @author yangtao
 * @description
 * @create 2022-07-06 23:49
 */
public class AnimalClient {

    @Test
    public void test() {
        Animal horse = new Horse();
        horse.move();

        Animal bird = new Bird();
        bird.move();

        // Bird bird2 = new Animal();  错误，子类不能指向父类，且违背了里氏替换原则
    }

}
