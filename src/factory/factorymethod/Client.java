package factory.factorymethod;
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| : |||// \
//                     / _||||| -:- |||||- \
//                       | | \\\ - /// | |
//                     | \_| ''\---/'' | |
//                      \ .-\__ `-` ___/-. /
//                   ___`. .' /--.--\ `. . __
//                ."" '< `.___\_<|>_/___.' >'"".
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                  佛祖镇楼           BUG辟易

/**
 * 工厂方法：
 * 优点：体现了开闭原则，支持扩展。
 * 缺点：每次新增都会增加类，导致臃肿。
 * author：Andy on 2019/6/13 0013-15:45
 * email:zsp872126510@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Car audiCar = AudiFactory.createCar();
        Car bmwCar = BMWFactory.createCar();
        Car bydCar = BydFactory.createCar();
        System.out.println(audiCar.carName());
        System.out.println(bmwCar.carName());
        System.out.println(bydCar.carName());
    }
}
