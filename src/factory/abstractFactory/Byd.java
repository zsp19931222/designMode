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
 * author：Andy on 2019/6/13 0013-16:03
 * email:zsp872126510@gmail.com
 */
public class Byd implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineLow();
    }

    @Override
    public Seat createSeat() {
        return new SeatLow();
    }

    @Override
    public Tyre createTyre() {
        return new TyreLow();
    }
}