package factory.simplefactory;
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
 * author：Andy on 2019/6/12 0012-17:44
 * email:zsp872126510@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Car car = CarSimpleFactory.createCar("宝马");
        Car car1 = CarSimpleFactory.createCar("奥迪");
        Car car2 = CarSimpleFactory.createCar("byd");
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
    }
}
