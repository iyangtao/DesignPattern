package live.yangtao.dip.client;

import live.yangtao.dip.car.BWM;
import live.yangtao.dip.car.Benz;
import live.yangtao.dip.car.Car;
import live.yangtao.dip.car.Driver;
import org.junit.Test;

/**
 * @author yangtao
 * @description
 * @create 2022-07-07 0:11
 */
public class CarClient {

    @Test
    public void test() {
        Driver tom = new Driver("tom");
        Car car = new Benz("benz");
        tom.drive(car);

        // 驾驶方法依赖于抽象类Car以及接口drive，如果需要更换汽车，只需要更换父类Car指向的实现类即可，无需更换接口中方法的参数
        System.out.println("===更换汽车===");

        car = new BWM("bwm");
        tom.drive(car);
    }

}
