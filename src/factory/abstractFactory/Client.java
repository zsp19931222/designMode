package factory.abstractFactory;
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
 * 抽象工厂，产品族的概念
 * 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类；具体的工厂负责实现具体的产品实例。
 * author：Andy on 2019/6/13 0013-16:03
 * email:zsp872126510@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        CarFactory bmw = new BMW();
        CarFactory byd = new Byd();
        CarFactory nissan=new Nissan();

        bmw.createEngine().engineMessage();
        bmw.createSeat().seatMessage();
        bmw.createTyre().tyreMessage();

        byd.createEngine().engineMessage();
        byd.createSeat().seatMessage();
        byd.createTyre().tyreMessage();

        nissan.createEngine().engineMessage();
        nissan.createSeat().seatMessage();
        nissan.createTyre().tyreMessage();
    }
}
