package ully.designpattern.templatemethod;



/**
 * 模版方法，定义了在一个操作中的一个算法框架，把一些步骤推迟到子类去实现。
 * 模版方法模式让子类不需要改变算法结构而重新定义特定的算法步骤。
 * @author ully
 *
 */
public abstract class HappyPeople {
	
	public void clelebrateSpringFestival() {
		subscribeTicket();
		travel();
		celebrate();
	}

	protected void celebrate() {
		System.out.println("Happy new Year!");		
	}

	protected abstract void travel();

	protected void subscribeTicket() {
		System.out.println("Buy ticket");
	}

}
