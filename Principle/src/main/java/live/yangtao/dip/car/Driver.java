package live.yangtao.dip.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangtao
 * @description
 * @create 2022-07-07 0:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver implements drive {

    private String name;

    @Override
    public void drive(Car car) {
        System.out.println(this.name + " 正在驾驶 " + car.getName());
    }

}
