package singleton;

/*
 * @description:测试懒汉式单例模式
 * @author: Andy
 * @date: 2019/6/12 0012 16:58
 * @param null:
 * @return:
 */
public class SingletonDemo2 {
	
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonDemo2 instance;  
	
	private SingletonDemo2(){ //私有化构造器
	}
	
	//方法同步，调用效率低！
	public static  synchronized SingletonDemo2  getInstance(){
		if(instance==null){
			instance = new SingletonDemo2();
		}
		return instance;
	}
	
}
